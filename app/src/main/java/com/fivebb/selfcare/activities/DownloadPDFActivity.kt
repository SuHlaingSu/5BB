package com.fivebb.selfcare.activities

import android.annotation.SuppressLint
import android.app.DownloadManager
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import android.webkit.*
import android.widget.Toast
import com.fivebb.selfcare.R
import com.fivebb.shared.activities.BaseActivity
import kotlinx.android.synthetic.main.activity_callback_result.*

class DownloadPDFActivity : BaseActivity(){
    private lateinit var webView: WebView
    companion object {
        private const val URL = "URL"

        @SuppressLint("SuspiciousIndentation")
        fun newIntent(context: Context, url : String): Intent {
          val intent =   Intent(context, DownloadPDFActivity::class.java)
            intent.putExtra(URL,url)
            return intent
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.aty_download)
        webView = findViewById(R.id.webview)
        webView.requestFocus();
       // webView.settings.setDefaultZoom(WebSettings.ZoomDensity.CLOSE);
       // webView.settings.layoutAlgorithm = WebSettings.LayoutAlgorithm.NORMAL;
       // webView.settings.useWideViewPort = true;
        //webView.settings.javaScriptEnabled = true
        webView.settings.loadWithOverviewMode = true
        webView.settings.useWideViewPort = true
        //webView.settings.domStorageEnabled = true
       // webView.settings.javaScriptCanOpenWindowsAutomatically = true
        webView.webViewClient = object : WebViewClient() {
            @Deprecated("Deprecated in Java")
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                if (url != null) {
                    view?.loadUrl(url)
               }
                return true
            }
        }

        intent.getStringExtra(URL).let {
            if (it != null) {
                val pdf = it
               // webView.loadUrl("https://drive.google.com/viewerng/viewer?embedded=true&url=$pdf")
               webView.loadUrl("https://docs.google.com/gview?embedded=true&url=$pdf")
               // webView.loadUrl(pdf)
            }
        }
       /* webView.setDownloadListener(DownloadListener { url, userAgent, contentDisposition, mimetype, contentLength ->
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
            finish()
        })*/
       /* webView.setDownloadListener { url, userAgent, contentDisposition, mimeType, contentLength ->
            val request = DownloadManager.Request(Uri.parse(url))
            request.setMimeType(mimeType)
            request.addRequestHeader("cookie", CookieManager.getInstance().getCookie(url))
            request.addRequestHeader("User-Agent", userAgent)
            request.setDescription("Downloading file...")
            request.setTitle(URLUtil.guessFileName(url, contentDisposition, mimeType))
            request.allowScanningByMediaScanner()
            request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
            request.setDestinationInExternalFilesDir(
                this@DownloadPDFActivity,
                Environment.DIRECTORY_DOWNLOADS,
                ".pdf"
            )
            val dm = getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
            dm.enqueue(request)
            Toast.makeText(applicationContext, "Downloading File", Toast.LENGTH_LONG).show()
        }*/
    }
}