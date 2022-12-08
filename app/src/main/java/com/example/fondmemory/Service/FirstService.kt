package com.example.fondmemory.Service

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import androidx.annotation.Nullable

class FirstService : Service() {
/*
    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }
*/
    @Nullable
    override fun onBind(intent: Intent): IBinder? {
        Log.i(TAG, "call onBind...")
        return null
    }

    override fun onCreate() {
        Log.i(TAG, "call onCreate...")
    }

    override fun onStart(intent: Intent, startId: Int) {
        Log.i(TAG, "call onStart...")
    }

    override fun onStartCommand(intent: Intent, flags: Int, startId: Int): Int {
        Log.i(TAG, "call onStartCommand...")
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        Log.i(TAG, "call onDestroy...")
    }

    companion object {
        const val TAG = "SimpleService"
    }
}

