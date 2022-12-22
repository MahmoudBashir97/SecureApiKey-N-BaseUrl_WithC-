package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    init{
        System.loadLibrary("native-lib")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this,"storedBaseUrl : ${getBaseUrlFromNative()} apiKey: ${getAPIKEY()}",Toast.LENGTH_LONG).show()
    }

    external fun getBaseUrlFromNative():String
    external fun getAPIKEY():String
}