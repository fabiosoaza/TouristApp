package com.example.ramonsl.touristapp2.Models;

public class Establish {
    private  String mName;
    private  String mAdress;
    private  String mFone;



    public String getmName() {
        return mName;
    }

    public String getmAdress() {
        return mAdress;
    }

    public String getmFone() {
        return mFone;
    }
    public Establish(String mName, String mAdress, String mFone) {
        this.mName = mName;
        this.mAdress = mAdress;
        this.mFone = mFone;

    }
}
