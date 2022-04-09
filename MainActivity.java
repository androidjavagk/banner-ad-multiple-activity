package com.govind8061.homeandgymworkoutsmen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {


    private FrameLayout frameLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frameLayout=findViewById(R.id.bannerAdFirst);
        BannerAdFirst bannerAdFirst=new BannerAdFirst(this);
        bannerAdFirst.loadBannerAds(frameLayout);



    }
}