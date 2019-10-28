package com.example.adsaa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.android.gms.ads.doubleclick.PublisherAdRequest
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    private lateinit var mPublisherInterstitialAd: PublisherInterstitialAd

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //mPublisherAdView = findViewById(R.id.publisherAdView)
        val adRequest = PublisherAdRequest.Builder().build()
        publisherAdView.loadAd(adRequest)
        //mPublisherAdView.loadAd(adRequest)

        mPublisherInterstitialAd = PublisherInterstitialAd(this)
        mPublisherInterstitialAd.adUnitId = "/6499/example/interstitial"
        mPublisherInterstitialAd.loadAd(PublisherAdRequest.Builder().build())

        textView.setOnClickListener {
            if (mPublisherInterstitialAd.isLoaded) {
                mPublisherInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
            }
        }
    }
}
