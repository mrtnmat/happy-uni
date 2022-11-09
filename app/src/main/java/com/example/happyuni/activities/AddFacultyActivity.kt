package com.example.happyuni.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

import com.example.happyuni.R

import kotlinx.coroutines.*

import android.util.Log
import androidx.room.Room
import com.example.happyuni.AppDatabase
import com.example.happyuni.entities.Faculty

class AddFacultyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_faculty)

        val db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "appDb"
        ).build()

        val facultyAdd : Button = findViewById(R.id.facultyAdd)
        facultyAdd.setOnClickListener {
            runBlocking {
                launch (Dispatchers.Default) {
                    val facultyDao = db.facultyDao()
                    facultyDao.insertFaculties(Faculty(1, "Scienze", "Piazza Grande"))
                }
            }
        }
    }
}