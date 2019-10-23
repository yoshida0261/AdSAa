package com.example.adsaa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.doubleclick.PublisherAdRequest
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //mPublisherAdView = findViewById(R.id.publisherAdView)
        val adRequest = PublisherAdRequest.Builder().build()
        publisherAdView.loadAd(adRequest)
        //mPublisherAdView.loadAd(adRequest)
    }
}
