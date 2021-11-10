package com.example.project400.Activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.project400.R

class SettingsActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        //This call the parent constructor
        super.onCreate(savedInstanceState)
        // This is used to align the xml view to this class
        setContentView(R.layout.activity_settings)
    }
}