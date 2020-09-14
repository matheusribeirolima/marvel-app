package com.marvel.app.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.marvel.app.R
import com.marvel.app.navigation.Actions

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        startActivity(Actions.openHomeIntent(this))
    }
}
