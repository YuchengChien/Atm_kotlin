package com.jason.atm_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    var login = false;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if(!login) {
            // open LoginActivity
            Intent(this, LoginActivity::class.java).apply {
                startActivity(this)
            }
        }
    }
}
