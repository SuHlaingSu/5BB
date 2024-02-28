package com.fivebb.shared.activities

import android.Manifest
import android.app.Activity
import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.content.pm.PackageManager
import android.content.res.Configuration
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.fivebb.shared.R
import com.fivebb.shared.fragments.LoadingFragment
import com.fivebb.shared.utils.*
import java.io.File
import java.io.IOException
import java.util.*


abstract class BaseActivity : AppCompatActivity() {

    val FIVEBB = "5bb"

    //Uri
    private var fileUri: Uri? = null

    //Permissions List
    private lateinit var permissionsToRequest: List<String>
    private var permissionsRejected = arrayListOf<String>()
    private var permissions = arrayListOf<String>()
    var alertDialog: AlertDialog? = null
    private var mLoadingFragment: LoadingFragment? = null

    companion object {
        //Request Code for Permissions
        const val ALL_REQUEST_CODE = 1111

        //Take Image from Camera
        const val PROFILE_IMAGE_SELECT_BY_CAMERA = 111
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ScreenUtils.getInstance().initScreenDimension(this)

        val language =
            PersistentUtil.newInstance(this).getLanguage() ?: SharedConstants.SELECTED_LANGUAGE_MY
        forceUpdateLocale(language)

//        getAllPermissionRequestsFromManifest()
//        filterOutUngrantedPermissions()
//        requestAllUngrantedPermissions()
    }

    override fun onResume() {
        super.onResume()

        if (!NetworkUtils.isOnline(applicationContext)) {
            showErrorMessage(SharedConstants.NO_INTERNET_RETRY)
        }
    }

    private fun getAllPermissionRequestsFromManifest() {
        permissions.apply {
            add(Manifest.permission.ACCESS_COARSE_LOCATION)
            add(Manifest.permission.ACCESS_FINE_LOCATION)
            add(Manifest.permission.CAMERA)
            add(Manifest.permission.WRITE_EXTERNAL_STORAGE)
            add(Manifest.permission.READ_EXTERNAL_STORAGE)

        }
    }

    private fun filterOutUngrantedPermissions() {
        permissionsToRequest = permissions.filter { !hasPermission(it) }.toMutableList()
    }

    private fun requestAllUngrantedPermissions() {
        if (permissionsToRequest.isNotEmpty()) {
            ActivityCompat.requestPermissions(
                this,
                permissionsToRequest.toTypedArray(),
                ALL_REQUEST_CODE
            )
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        when (requestCode) {
            ALL_REQUEST_CODE -> {
                permissionsToRequest
                    .filter { !hasPermission(it) }
                    .forEach { permissionsRejected.add(it) }

                if (permissionsRejected.size > 0) {
                    permissionsRejected.forEach {
                        if (ActivityCompat.shouldShowRequestPermissionRationale(this, it)) {
                            showWarningDialogWhenRejectedAndAskForPermissionsAgain()
                            return
                        }
                    }

                }
            }
        }
    }

    private fun showWarningDialogWhenRejectedAndAskForPermissionsAgain() {
        AlertDialog.Builder(this)
            .setMessage(getString(R.string.warning_to_grant_permissions))
            .setPositiveButton(getString(R.string.lbl_app_title)) { _, _ ->
                requestRejectedPermissions()
            }
            .create().show()
    }

    private fun requestRejectedPermissions() {
        ActivityCompat.requestPermissions(
            this,
            permissionsRejected.toTypedArray(),
            ALL_REQUEST_CODE
        )
    }

    private fun hasPermission(permission: String): Boolean {
        return ContextCompat.checkSelfPermission(
            this,
            permission
        ) == PackageManager.PERMISSION_GRANTED
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK) {
            when (requestCode) {
                SharedConstants.PICK_IMAGE_REQUEST_CODE.toInt() -> {
                    data?.data?.run {
                        val selectedImageUri = this
                        getSelectedImageUri(selectedImageUri)
                    }
                }
                SharedConstants.GALLY_REQUEST_CODE.toInt() -> {
                    data?.data?.run {
                        val selectedImageUri = this
                        getSelectedImageUri(selectedImageUri)
                    }
                }
            }
        }
    }

    protected fun imageUploadByCamera(requestCode: Int) {
        fireCameraIntentWithRequestCode(requestCode)
    }

    protected fun imageFromGallery(requestCode: Int) {
        fireGalleryWithRequestCode(requestCode)
    }

    private fun fireCameraIntentWithRequestCode(requestCode: Int) {
        val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        try {
            val file = File(externalCacheDir, "${System.currentTimeMillis()}.jpg")
            fileUri = Uri.parse("file://${file.absolutePath}")
            val imageUri = Uri.fromFile(file)
            getSelectedImageUri(imageUri)

        } catch (ex: IOException) {
            Log.d("FileError", "Error Creating File$requestCode")
        }
    }

    private fun fireGalleryWithRequestCode(requestCode: Int) {
        val intent = Intent(Intent.ACTION_GET_CONTENT)
        intent.type = "image/*"
        startActivityForResult(intent, requestCode)
    }

    open fun getSelectedImageUri(imageUri: Uri) {

    }

    protected fun dialCall(phoneNo: String) {
        val uri = "tel: $phoneNo"
        val callIntent = Intent(Intent.ACTION_DIAL)
        callIntent.data = Uri.parse(uri)
        startActivity(callIntent)
    }

    protected fun navigateToLink(address: String) {
        if (!address.startsWith("http://") && !address.startsWith("https://")){
            val address:String = "https://$address";
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(address)
            startActivity(intent)
        }else{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(address)
            startActivity(intent)
        }
    }

    protected fun navigateToEmailAddress(address: String) {
        val intent = Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:$address"))
        startActivity(Intent.createChooser(intent, ""))
    }

    private fun forceUpdateLocale(language: String) {
        val locale = Locale(language)
        Locale.setDefault(locale)

        val res = resources
        val conf = Configuration(res.configuration)

        conf.setLocale(locale)
        createConfigurationContext(conf)

        res.updateConfiguration(conf, res.displayMetrics)
    }

    protected fun showErrorMessage(message: String) {
        if (alertDialog?.isShowing == true) {
            return
        }

        alertDialog = AlertDialog.Builder(this@BaseActivity)
            .setCancelable(true)
            .setIcon(R.drawable.ic_error_outline_24dp)
            .setTitle(R.string.lbl_app_title)
            .setPositiveButton(R.string.lbl_ok) { dialog, _ -> dialog.dismiss()}
            .create()

        alertDialog!!.apply {
            setMessage(
                SharedUtils.mmTextUnicodeOrigin(
                    message,
                    applicationContext
                )
            )
        }.show()
        positionDialogViews()
    }

    protected fun showErrorMessage(message: String, action: () -> Unit) {
        if (alertDialog?.isShowing == true) {
            return
        }

        alertDialog = AlertDialog.Builder(this@BaseActivity)
            .setCancelable(false)
            .setIcon(R.drawable.ic_error_outline_24dp)
            .setTitle(R.string.lbl_app_title)
            .setPositiveButton(R.string.lbl_ok) { dialog, _ ->
                dialog.dismiss()
                action()
            }
            .create()

        alertDialog!!.apply {
            setMessage(
                SharedUtils.mmTextUnicodeOrigin(
                    message,
                    applicationContext
                )
            )
        }.show()
        positionDialogViews()
    }

    protected fun showSuccessMessage(message: String, action: () -> Unit) {
        if (alertDialog?.isShowing == true) {
            return
        }

        alertDialog = AlertDialog.Builder(this@BaseActivity)
            .setCancelable(true)
            .setIcon(R.drawable.ic_success_24dp)
            .setTitle(R.string.lbl_app_title)
            .setPositiveButton(R.string.lbl_ok) { dialog, _ ->
                dialog.dismiss()
                action()
            }
            .create()

        alertDialog!!.apply {
            setMessage(
                SharedUtils.mmTextUnicodeOrigin(
                    message,
                    applicationContext
                )
            )
        }.show()
        positionDialogViews()
    }

    protected fun confirmDialog(message: String, clickOk: () -> Unit) {
        if (alertDialog?.isShowing == true) {
            return
        }

        alertDialog = AlertDialog.Builder(this@BaseActivity)
            .setCancelable(true)
            .setIcon(R.drawable.logo)
            .setTitle(R.string.lbl_app_title)
            .setPositiveButton(R.string.lbl_ok) { dialog, _ ->
                dialog.dismiss()
                clickOk()
            }
            .setNegativeButton(R.string.lbl_cancel) { dialog, _ ->
                dialog.dismiss()
            }
            .create()

        alertDialog!!.apply {
            setMessage(
                SharedUtils.mmTextUnicodeOrigin(
                    message,
                    applicationContext
                )
            )
        }.show()
        positionDialogViews()
    }

    private fun positionDialogViews() {
        val messageView = alertDialog!!.findViewById<TextView>(android.R.id.message)!!
        messageView.setPadding(40, 40, 40, 40)
        messageView.gravity = Gravity.CENTER

        val positiveButton =
            alertDialog!!.getButton(androidx.appcompat.app.AlertDialog.BUTTON_POSITIVE)
        val positiveButtonLL = positiveButton.layoutParams as LinearLayout.LayoutParams
        positiveButtonLL.gravity = Gravity.CENTER
        positiveButton.layoutParams = positiveButtonLL
    }

    protected fun showLoadingDialog() {
        if (mLoadingFragment == null) {
            mLoadingFragment = LoadingFragment.getFragment()
        }

        mLoadingFragment?.let {
            if (!it.isAdded) {
                mLoadingFragment?.show(
                    supportFragmentManager,
                    LoadingFragment.TAG_LOADING_DALOG_FRAGMENT
                )
            }
        }
    }

    protected  fun hideLoadingDialog() {
        mLoadingFragment?.dismiss()
    }
}