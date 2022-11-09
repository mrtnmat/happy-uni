package com.example.happyuni

import android.content.Context
import android.util.Log
import androidx.room.Room

object DatabaseClient {
    init {
        Log.d("dbClient", "init")
    }

    var db : AppDatabase? = null
    fun newDb(ctx : Context) {
        db = Room.databaseBuilder(
            ctx,
            AppDatabase::class.java, "appDb"
        ).build()
    }
}