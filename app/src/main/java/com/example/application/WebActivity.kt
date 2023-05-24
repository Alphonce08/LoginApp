package com.example.application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class WebActivity : AppCompatActivity() {
    lateinit var myWebView:WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)
        myWebView = findViewById(R.id.mbWEb)
        var setting = myWebView.settings
        setting.javaScriptEnabled = true
        myWebView.loadUrl("https://www.emobilis.ac.ke")
    }
}