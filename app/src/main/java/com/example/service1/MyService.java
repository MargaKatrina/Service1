package com.example.service1;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class MyService extends IntentService {


    public MyService() {
        super("MyService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.d("MyService", "Service is running...");
    }
}
