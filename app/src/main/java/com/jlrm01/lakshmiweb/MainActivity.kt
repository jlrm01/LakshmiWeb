package com.jlrm01.lakshmiweb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.HttpAuthHandler
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webview = findViewById<WebView>(R.id.webview)

        webview.settings.javaScriptEnabled = true;
        webview.settings.javaScriptCanOpenWindowsAutomatically = true;
        
        webview.webViewClient = MyWebViewClient()

        webview.loadUrl("https://discord-lakshmi-bot.herokuapp.com/")

    }

    inner class MyWebViewClient : WebViewClient() {
        override fun onReceivedHttpAuthRequest(
            view: WebView?,
            handler: HttpAuthHandler?,
            host: String?,
            realm: String?
        ) {
            null
        }
    }

}