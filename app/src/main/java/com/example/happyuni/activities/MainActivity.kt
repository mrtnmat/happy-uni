package com.example.happyuni.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.example.happyuni.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAddFaculty : Button = findViewById<Button>(R.id.btnAddFaculty)
        btnAddFaculty.setOnClickListener {
            startActivity(Intent(this, AddFacultyActivity::class.java))
        }

        Log.d("onCreate", "hello!")
    }

    override fun onStart() {
        super.onStart()
        Log.d("onStart", "hello!")
    }

    override fun onResume() {
        super.onResume()
        Log.d("onResume", "hello!")
    }
}