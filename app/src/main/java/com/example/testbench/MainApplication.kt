package com.example.testbench

import android.app.Application

/**
 * Created by vivek on 06/04/18.
 */

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

    }

    companion object {
        private val TAG = "MainApplication"
    }
}
