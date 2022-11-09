package com.example.happyuni.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.example.happyuni.entities.Faculty

@Dao
interface FacultyDao {
    @Insert(onConflict = OnConflictStrategy.ABORT)
    suspend fun insertFaculties(vararg faculties: Faculty)
}