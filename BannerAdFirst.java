package com.govind8061.homeandgymworkoutsmen;

import android.app.Activity;
import android.widget.FrameLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class BannerAdFirst {

    private Activity activity;

    public BannerAdFirst(Activity activity) {
        this.activity = activity;
    }

    public void loadBannerAds(FrameLayout frameLayout){
        MobileAds.initialize(activity, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        AdView mAdview=new AdView(activity);
        mAdview.setAdUnitId("ca-app-pub-3940256099942544/6300978111");
        mAdview.setAdSize(AdSize.FULL_BANNER);
        frameLayout.addView(mAdview);


        AdRequest adRequest=new AdRequest.Builder().build();
        mAdview.loadAd(adRequest);
        mAdview.setAdListener(new AdListener() {
            @Override
            public void onAdClicked() {
                super.onAdClicked();
            }

            @Override
            public void onAdClosed() {
                super.onAdClosed();
            }

            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                super.onAdFailedToLoad(loadAdError);
                mAdview.loadAd(adRequest);
            }

            @Override
            public void onAdImpression() {
                super.onAdImpression();
            }

            @Override
            public void onAdLoaded() {
                super.onAdLoaded();
            }

            @Override
            public void onAdOpened() {
                super.onAdOpened();
            }
        });






    }
}
