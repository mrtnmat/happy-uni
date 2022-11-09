package com.example.happyuni

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.happyuni.daos.FacultyDao
import com.example.happyuni.entities.Faculty

@Database(entities = [Faculty::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun facultyDao() : FacultyDao
}