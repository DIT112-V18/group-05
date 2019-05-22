package com.example.hajken.helpers;

import android.graphics.Bitmap;
import android.graphics.PointF;

import java.io.File;
import java.util.ArrayList;

public class CoordinatesListItem {

    private String mName;
    private Bitmap mBitmap;
    private ArrayList<PointF> listOfCoordinates = new ArrayList<>();

    public Bitmap getmBitmap() {
        return mBitmap;
    }

    public void setmBitmap(Bitmap mBitmap) {
        this.mBitmap = mBitmap;
    }

    public ArrayList<PointF> getListOfCoordinates() {
        return listOfCoordinates;
    }

    public void setListOfCoordinates(ArrayList<PointF> listOfCoordinates) {
        this.listOfCoordinates = listOfCoordinates;
    }

    public void setmName(String path){
        this.mName = path;
    }
}
