package com.gabriel.kotlin.screen

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.gabriel.kotlin.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addControls();
        addEvents();
    }

    private fun addControls() {


    }

    private fun addEvents() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
