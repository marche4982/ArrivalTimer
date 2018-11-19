package com.example.youyou.arrivaltimer;

/**
 * Created by youyou on 2018/11/19.
 */

public class MyLatLong {

    private double mLatitude;   // 緯度（縦）
    private double mLongitude;  // 経度（横）

    public void SetLatLong(double latitude, double longitude){
        mLatitude = latitude;
        mLongitude = longitude;
    }

    public double GetLatitude(){
        return mLatitude;
    }

    public double GetLongitude(){
        return mLongitude;
    }
}
