package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        supportActionBar?.hide()

        val webView = findViewById<WebView>(R.id.webView2)

        webView.webViewClient = WebViewClient()
        webView.loadUrl("https://www.apple.com/br/store?afid=p238%7CsikJb1MHC-dc_mtid_1870765e38482_pcrid_667974320550_pgrid_17049243418_pntwk_g_pchan__pexid__&cid=aos-br-kwgo-brand--slid---product-")
        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true


    }
}