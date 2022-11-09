package com.example.happyuni.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

import com.example.happyuni.R

import kotlinx.coroutines.*

import android.widget.EditText
import androidx.room.Room
import com.example.happyuni.AppDatabase
import com.example.happyuni.entities.Faculty

class AddFacultyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_faculty)

        val facultyCode = findViewById<EditText>(R.id.facultyCode)
        val facultyName = findViewById<EditText>(R.id.facultyName)
        val facultyLocation = findViewById<EditText>(R.id.facultyLocation)

        val db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "appDb"
        ).build()

        val facultyAdd = findViewById<Button>(R.id.facultyAdd)
        facultyAdd.setOnClickListener {
            runBlocking {
                launch (Dispatchers.Default) {
                    val facultyDao = db.facultyDao()
                    try {
                        facultyDao.insertFaculties(Faculty(
                            Integer.parseInt(facultyCode.text.toString()),
                            facultyName.text.toString(),
                            facultyLocation.text.toString()
                        ))
                    } catch (e : Exception) {
                        Log.e("add faculty", e.toString())
                    }
                }
            }
        }
    }
}