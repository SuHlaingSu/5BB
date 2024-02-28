package com.fivebb.selfcare.activities

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.text.Html
import android.text.Html.fromHtml
import android.util.Log
import android.util.Patterns
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.fivebb.selfcare.R
import com.fivebb.selfcare.adapters.email.EmailAdapter
import com.fivebb.selfcare.delegates.EmailActionDelegate
import com.fivebb.selfcare.mvp.presenters.EmailVerifyPresenter
import com.fivebb.selfcare.mvp.views.EmailVerifyView
import com.fivebb.selfcare.network.responses.EmailListResponse
import com.fivebb.selfcare.utils.SwipeToDeleteCallback
import kotlinx.android.synthetic.main.activity_notification.*
import kotlinx.android.synthetic.main.add_email_new.*
import java.util.regex.Pattern

class AddNewEmailAty : ApplicationBaseActivity(), EmailVerifyView, EmailActionDelegate {
    private lateinit var mEmailListAdapter: EmailAdapter
    private lateinit var mPresenter: EmailVerifyPresenter
    lateinit var mDelegate: EmailActionDelegate
    private val mEmail = ArrayList<EmailListResponse>()
    val eList: MutableList<String> = ArrayList()
    var strMsg : String = ""
    //var userText : String = ""
    var emailToText : String = ""

    override fun getContext(): Context = applicationContext

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, AddNewEmailAty::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_email_new)

        setUpPresenter()
        setUpRecyclerView()
        setUpListeners()
        mPresenter.emailList(getContext())
    }

    private fun setUpPresenter() {
        mPresenter = ViewModelProviders.of(this).get(EmailVerifyPresenter::class.java)
        mPresenter.initPresenter(this)
    }

    private fun setUpRecyclerView() {
        mEmailListAdapter = EmailAdapter(this)
        rvShowEmailList.adapter = mEmailListAdapter
        rvShowEmailList.setHasFixedSize(true)
        /* var mLayoutManager = LinearLayoutManager(getContext())
         rvShowEmailList.setLayoutManager(mLayoutManager);*/

        val swipeHandler = object : SwipeToDeleteCallback(this) {
            @SuppressLint("NotifyDataSetChanged")
            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                if(!mEmail[viewHolder.adapterPosition].isPrimary && !mEmail[viewHolder.adapterPosition].isBSSPrimary) {
                    mEmail.removeAt(viewHolder.adapterPosition).email
                    mPresenter.deleteSingleEmail(mEmail)
                    mEmailListAdapter.notifyDataSetChanged()

                }else if(!mEmail[viewHolder.adapterPosition].isPrimary){
                    Toast.makeText(applicationContext,resources.getString(R.string.lbl_make_primary),Toast.LENGTH_SHORT).show()
                    mEmailListAdapter.notifyDataSetChanged()
                }else{
                    Toast.makeText(applicationContext,resources.getString(R.string.lbl_primary_not_delete),
                        Toast.LENGTH_SHORT).show()
                    mEmailListAdapter.notifyDataSetChanged()
                }
            }
        }
        val itemTouchHelper = ItemTouchHelper(swipeHandler)
        itemTouchHelper.attachToRecyclerView(rvShowEmailList)
    }

    private fun setUpListeners() {
        iBack.setOnClickListener {
            finish()
        }
        swipeRefreshEmail.setOnRefreshListener {
            mEmail.clear()
            eList.clear()
            mPresenter.emailList(getContext())
        }

        txtAddNew.setOnClickListener {
            //Toast.makeText(applicationContext,"Clicked Add/New",Toast.LENGTH_SHORT).show()
            //mEmail.clear()
            eList.clear()
            if(mEmail.size < 5)
            {
                addNewEmail()
            }else{
                Toast.makeText(applicationContext,resources.getString(R.string.lbl_no_more_add),Toast.LENGTH_SHORT).show()
            }
        }
        mPresenter.mShowProgressLoadingDialogLiveData.observe(this, Observer {
            swipeRefreshEmail.isRefreshing = false
            showLoadingDialog()
        })

        mPresenter.mHideProgressLoadingDialogLiveData.observe(this, Observer {
            swipeRefreshEmail.isRefreshing = false
            hideLoadingDialog()
        })

        mPresenter.mErrorLiveData.observe(this, Observer {
            swipeRefreshEmail.isRefreshing = false
            checkErrorMessageAndRedirectLogin(it)
        })
    }

    override fun onResume() {
        super.onResume()
        mPresenter.emailList(getContext())
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun showEmailList(emailList: List<EmailListResponse>) {
        Log.i("", "showEmailList :" + listOf(emailList).toString())
        mEmail.clear()
        mEmail.addAll(emailList)
        mEmailListAdapter.submitList(mEmail)
        mEmailListAdapter.notifyDataSetChanged()
        rvShowEmailList.adapter = mEmailListAdapter
    }

    override fun showMsgVerify(msg: String) {
        //Toast.makeText(applicationContext,msg,Toast.LENGTH_LONG).show()
        // setup the alert builder
        if (alertDialog?.isShowing == true) {
            return
        }
        alertDialog = android.app.AlertDialog.Builder(this)
            .setCancelable(true)
            .setIcon(com.fivebb.shared.R.drawable.logo)
            .setTitle(com.fivebb.shared.R.string.lbl_app_title)
            .setPositiveButton(com.fivebb.shared.R.string.lbl_ok) { dialog, _ ->
                startActivity(VerifyEmailAty.newIntent(applicationContext, 200))
            }
            .create()

        alertDialog!!.apply {
            strMsg = msg.replace("\n","<br>")
            setMessage(fromHtml(strMsg))
        }.show()
    }

    override fun addNewEmail() {
        var strEmail : String
        //Toast.makeText(applicationContext,"Clicked Add/New",Toast.LENGTH_SHORT).show()
        val alertDialog = AlertDialog.Builder(this)
        val customLayout: View = LayoutInflater.from(this).inflate(R.layout.item_add_email, null)
        alertDialog.setView(customLayout)
        val alert = alertDialog.create()
        alert.setIcon(R.drawable.logo)
        alert.setTitle("5BB")
        alert.setCancelable(false)
        alert.setCanceledOnTouchOutside(false)

        val editText = customLayout.findViewById<EditText>(R.id.etMessage)
        val submitBtn: Button = customLayout.findViewById(R.id.btnOK)
        val cancelBtn: Button = customLayout.findViewById(R.id.btnCancel)
        submitBtn.setOnClickListener {
            var isDuplicate: Boolean = false
            emailToText = editText.text.toString()
            if (emailToText.isNotEmpty() && Patterns.EMAIL_ADDRESS.matcher(emailToText).matches()) {
               // Toast.makeText(this, "Email Verified !", Toast.LENGTH_SHORT).show()
                mEmail.forEach { emailListResponse ->
                    Log.i("", "addNewEmail: $emailListResponse")
                    if (!emailToText.contains(emailListResponse.email)) {
                        if(!emailListResponse.isPrimary && !emailListResponse.isBSSPrimary) {
                                strEmail = emailListResponse.email
                                eList.add(strEmail)
                                Log.d("TAG", "eList size: $eList")
                        }
                    } else {
                        isDuplicate = true
                        Toast.makeText(applicationContext, resources.getString(R.string.lbl_ready_mail), Toast.LENGTH_SHORT).show()
                        alert.dismiss()
                    }
                }
                if (!isDuplicate){
                    mPresenter.updateCusInfoEmail(customLayout.context, emailToText, eList)
                }
            } else{
                Toast.makeText(this, this.getString(R.string.lbl_right_format_mail), Toast.LENGTH_SHORT).show()
            }
          //  Log.i("TAG", "Email Response: $userText")
            alert.dismiss()
        }
        cancelBtn.setOnClickListener {
            alert.dismiss()
        }
        alert.show()
    }

    override fun checkVerify(msg: String) {

    }

    @SuppressLint("NotifyDataSetChanged")
    override fun updateEmailInfo(msg: String) {
        Toast.makeText(applicationContext, msg, Toast.LENGTH_SHORT).show()
        mPresenter.emailList(getContext())
    }

    override fun deleteEmail(msg: String) {
        Toast.makeText(applicationContext, msg, Toast.LENGTH_SHORT).show()
        mPresenter.emailList(getContext())
    }

    private fun isValidEmailId(email: String): Boolean {
        return Pattern.compile(
            /*"^(([\\w-]+\\.)+[\\w-]+|([a-zA-Z]{1}|[\\w-]{2,}))@"
                    + "((([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                    + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\."
                    + "([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                    + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])){1}|"
                    + "([a-zA-Z]+[\\w-]+\\.)+[a-zA-Z]{2,4})$"*/
        "\"^[_A-Za-z0-9-]+(\\\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\\\.[A-Za-z0-9]+)*(\\\\.[A-Za-z]{2,})\$\""
        ).matcher(email).matches()
    }

    override fun onGetEmailList() {
//  TODO("Not yet implemented")
    }

    override fun onTapAddNew() {
// TODO("Not yet implemented")
    }

    override fun onTapVerify() {
        mPresenter.changeEmail(this)
    }

   /* override fun showBtnAdd() {
        txtAddNew.visibility = View.VISIBLE
    }*/
}
