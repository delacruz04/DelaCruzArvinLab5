package com.delacruz.arvin;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

public class ServiceActivity extends IntentService {
    public ServiceActivity(){
        super("ServiceActivity");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.d("4ITF", "service is running...");
    }
}
