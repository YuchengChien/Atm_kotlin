package com.jason.atm_kotlin

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    companion object {
        val RC_LOGIN = 30
    }
    var login = false;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        startActivity(Intent(this, MaterialActivity::class.java))
        if(!login) {
            // open LoginActivity
            Intent(this, LoginActivity::class.java).apply {
                startActivityForResult(this, RC_LOGIN)
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == RC_LOGIN) {
            if(resultCode == Activity.RESULT_OK) {
                val userid = data?.getStringExtra("LOGIN_USERID")
                val passwd = data?.getStringExtra("LOGIN_PASSWD")
                Log.d("RESULT", "$userid / $passwd")
            }
        }
    }
}
