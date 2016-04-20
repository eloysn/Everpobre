package com.fratelliapps.everpobre;

import android.app.Application;
import android.util.Log;

/**
 * Created by eloysanznavarro on 18/4/16.
 */
public class EverpobreApp extends Application  {


    public static final String TAG = EverpobreApp.class.getName();

    //Cuando inicia la app
    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "Application init");


    }
    //Se ejecuta cuando nos quedamos sin memoria
    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }
}
