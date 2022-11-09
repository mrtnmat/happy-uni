package com.example.happyuni.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Faculty(
    @PrimaryKey val codice: Int,

    val nome: String?,
    val sede: String?
)