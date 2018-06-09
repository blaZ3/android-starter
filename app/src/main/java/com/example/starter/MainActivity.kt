package com.example.starter

import android.databinding.DataBindingUtil
import android.os.AsyncTask
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

import com.example.starter.databinding.ActivityMainBinding
import com.example.starter.login.LoginActivity
import com.google.android.gms.gcm.GoogleCloudMessaging
import com.google.android.gms.iid.InstanceID

class MainActivity : AppCompatActivity() {

    internal lateinit var dataBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        LoginActivity.start(this)
        finish()

        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        dataBinding.btnClick.setOnClickListener {
            LoginActivity.start(this)
        }

        dataBinding.btnClick2.setOnClickListener {
            Toast.makeText(this, "Koi 2", Toast.LENGTH_SHORT).show()
        }

        dataBinding.btnClick3.setOnClickListener {
            Toast.makeText(this, "Koi 3", Toast.LENGTH_SHORT).show()
        }

    }

    companion object {
        private val TAG = MainActivity::class.java.simpleName
    }
}
