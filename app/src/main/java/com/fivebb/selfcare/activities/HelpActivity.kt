package com.fivebb.selfcare.activities

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.fivebb.selfcare.R
import com.fivebb.selfcare.adapters.advPaymentChooseMonth.AdvPaymentAdapter
import com.fivebb.selfcare.adapters.help.HelpListAdapter
import com.fivebb.selfcare.delegates.HelpActionDelegate
import com.fivebb.selfcare.mvp.presenters.HelpPresenter
import com.fivebb.selfcare.mvp.views.HelpView
import com.fivebb.shared.vos.RegionVO
import com.google.android.gms.maps.*
import kotlinx.android.synthetic.main.activity_help.*
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.maps.model.LatLng
import kotlinx.android.synthetic.main.activity_help.ivBack


class HelpActivity : ApplicationBaseActivity(), HelpView, HelpActionDelegate, OnMapReadyCallback {
    private lateinit var mHelpListAdapter: HelpListAdapter

    private lateinit var mPresenter: HelpPresenter

    private  var mGoogleMap: GoogleMap? = null

    private val MAP_VIEW_BUNDLE_KEY = "MapViewBundleKey"

    private var mFacebookLink = ""
    private var mYouTubeLink = ""
    private var mLat : Double = 0.0
    private var mLong : Double = 0.0
    private val regionList= ArrayList<RegionVO>()

    override fun getContext(): Context = applicationContext

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, HelpActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help)

        var mapViewBundle: Bundle? = null
        if (savedInstanceState != null) {
            mapViewBundle = savedInstanceState.getBundle(MAP_VIEW_BUNDLE_KEY)!!
        }
        mapView.onCreate(mapViewBundle)
        mapView.getMapAsync(this)

        initPresenter()
        initListeners()
        setUpRecyclerView()

        mPresenter.onUiReady()
        mPresenter.onDataList()
    }

    private fun initPresenter() {
        mPresenter = ViewModelProviders.of(this).get(HelpPresenter::class.java)
        mPresenter.initPresenter(this)
    }

    private fun setUpRecyclerView() {
        mHelpListAdapter = HelpListAdapter(this)
        recShowroom.adapter = mHelpListAdapter
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        var mapViewBundle = outState.getBundle(MAP_VIEW_BUNDLE_KEY)
        if (mapViewBundle == null) {
            mapViewBundle = Bundle()
            outState.putBundle(MAP_VIEW_BUNDLE_KEY, mapViewBundle)
        }

        mapView.onSaveInstanceState(mapViewBundle)
    }

    override fun onResume() {
        super.onResume()
        mapView.onResume()
    }

    override fun onStart() {
        super.onStart()
        mapView.onStart()
    }

    override fun onStop() {
        super.onStop()
        mapView.onStop()
    }

    override fun onPause() {
        mapView.onPause()
        super.onPause()
    }

    override fun onDestroy() {
        mapView.onDestroy()
        super.onDestroy()
    }

    override fun onLowMemory() {
        super.onLowMemory()
        mapView.onLowMemory()
    }

    override fun onMapReady(googleMap: GoogleMap) {

        mGoogleMap = googleMap

        googleMap.setMinZoomPreference(17.toFloat())
        googleMap.isIndoorEnabled = true
        val uiSettings = googleMap.uiSettings
        uiSettings.isIndoorLevelPickerEnabled = true
        uiSettings.isMyLocationButtonEnabled = true
        uiSettings.isMapToolbarEnabled = true
        uiSettings.isCompassEnabled = true
        uiSettings.isZoomControlsEnabled = true

        val fiveBBLagLng = LatLng(mLat, mLong)

        val markerOptions = MarkerOptions()
        markerOptions.position(fiveBBLagLng)
        googleMap.addMarker(markerOptions)

        googleMap.moveCamera(CameraUpdateFactory.newLatLng(fiveBBLagLng))
    }

    private fun initListeners() {

        //need to insert parent scrollable view to move all direction
        mapView.parent = nestedScrollView

        ivBack.setOnClickListener {
            finish()
        }

        ivFaceBook.setOnClickListener {
            navigateToLink(mFacebookLink)
        }

        ivYouTube.setOnClickListener {
            navigateToLink(mYouTubeLink)
        }

        lblEmail.setOnClickListener {
            mPresenter.onTapEmailButton(lblEmail.text.toString())
        }

        lblContactNumberOne.setOnClickListener {
            dialCall((it as TextView).text.toString().replace("-",""))
        }

        lblContactNumberTwo.setOnClickListener {
            dialCall((it as TextView).text.toString().replace("-",""))
        }

        mPresenter.mShowProgressLoadingDialogLiveData.observe(this, Observer {
            showLoadingDialog()
        })

        mPresenter.mHideProgressLoadingDialogLiveData.observe(this, Observer {
            hideLoadingDialog()
        })

        mPresenter.mErrorLiveData.observe(this, Observer {
            checkErrorMessageAndRedirectLogin(it)
        })
    }

    override fun bindData(data: RegionVO) {

        if(data.showroomName== null || data.showroomName == "")
        {
            recShowroom.visibility = View.VISIBLE
        }else{
            recShowroom.visibility= View.VISIBLE
        }
        data.isSelected= true
        mFacebookLink = data.facebookUrl ?: ""
        mYouTubeLink = data.youTubeUrl ?: ""

        val lagLong = data.latAndLogn?.split(",")

        lagLong?.let {
            mLat = it.firstOrNull()?.toDouble()!!
            mLong = it.lastOrNull()?.toDouble()!!
            /*mLat = it.firstOrNull()?.toDouble() ?: 0.0
            mLong = it.lastOrNull()?.toDouble() ?: 0.0*/
        }

       // Log.i("Lat & Long", "Lat and Long: $mLat , $mLong")

        lblEmail.text = data.primaryEmail
        if(data.primaryPhoneNo!=null)
        {
            lblContactNumberOne.text = data.primaryPhoneNo
        }else{
            lblContactNumberOne.visibility = View.GONE
        }


        if(data.secondaryPhoneNos!=null)
        {
            lblContactNumberTwo.text = data.secondaryPhoneNos?.split(",")?.firstOrNull() ?: ""
        }else{
            lblContactNumberTwo.visibility = View.GONE
        }

        lblLocation.text = data.address

        mGoogleMap?.let { onMapReady(it) }
    }

    override fun bindDataList(data: List<RegionVO>) {
        regionList.addAll(data)
        mHelpListAdapter.submitList(data)
    }

    override fun navigateToSendEmailActivity(email: String) {
        val intent = SendEmailActivity.newIntent(applicationContext, email)
        startActivity(intent)
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onShowroomClickItem(item: RegionVO) {
        regionList.forEach {
            if(it.id !=item.id)
            {
                it.isSelected= false
                mHelpListAdapter.notifyDataSetChanged()
            }else {
                it.isSelected= true
                mHelpListAdapter.notifyDataSetChanged()
            }
            mFacebookLink = item.facebookUrl ?: ""
            mYouTubeLink = item.youTubeUrl ?: ""

            val lagLong = item.latAndLogn?.split(",")
            if (lagLong != null) {
                Log.i("list", " ${lagLong.size}")
            }

            lagLong?.let {
                mLat = it.firstOrNull()?.toDouble()!!
                mLong = it.lastOrNull()?.toDouble()!!
              //  mLat = it.firstOrNull()?.toDouble() ?: 0.0
               // mLong = it.lastOrNull()?.toDouble() ?: 0.0
            }

            Log.i("Lat & Long", " $mLat , $mLong")

            lblEmail.text = item.primaryEmail
            lblContactNumberOne.text = item.primaryPhoneNo

            lblContactNumberTwo.text = item.secondaryPhoneNos?.split(",")?.firstOrNull() ?: ""

             if(item.secondaryPhoneNos?.split(",")?.first() != "" )
             {
                 lblContactNumberTwo.visibility= View.VISIBLE
                 lblContactNumberTwo.text = item.secondaryPhoneNos?.split(",")?.firstOrNull() ?: ""
             }
             else{
                 lblContactNumberTwo.visibility= View.GONE
             }
            lblLocation.text = item.address

            mGoogleMap?.let { it1 -> onMapReady(it1) }
        }
    }

}
