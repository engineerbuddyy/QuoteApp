package com.example.quoteapp.data.local

import android.content.Context
import androidx.room.Room


object QuoteDatabaseProvider{
    @Volatile
    private var INSTANCE: QuoteDatabase?=null

    fun getDatabase(context: Context):QuoteDatabase{
        return INSTANCE?:synchronized(this){
            val instance = Room.databaseBuilder(
                context.applicationContext,
                QuoteDatabase::class.java,
                "quote_db"
            ).build()
            INSTANCE=instance
            instance

        }
    }
}