package com.example.ramonsl.touristapp2.Models;

public class Places {

    private String mName;
    private String mDesc;
    private int mDraw;
    public Places(String mName, String mDesc, int mDraw) {
        this.mName = mName;
        this.mDesc = mDesc;
        this.mDraw = mDraw;
    }
    public String getmName() {
        return mName;
    }

    public String getmDesc() {
        return mDesc;
    }

    public int getmDraw() {
        return mDraw;
    }
}
