package com.digitalservicetech.mediapp.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.digitalservicetech.mediapp.R

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        //setting toolbar
        setSupportActionBar(findViewById(R.id.toolbar))
        //home navigation
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.title = ""
    }
}
