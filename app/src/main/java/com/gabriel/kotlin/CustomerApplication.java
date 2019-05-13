package com.gabriel.kotlin;

import android.support.multidex.MultiDexApplication;
import com.gabriel.kotlin.webservice.WebServiceBuilder;

public class CustomerApplication extends MultiDexApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        WebServiceBuilder.getInstance().initServices();
    }
}
