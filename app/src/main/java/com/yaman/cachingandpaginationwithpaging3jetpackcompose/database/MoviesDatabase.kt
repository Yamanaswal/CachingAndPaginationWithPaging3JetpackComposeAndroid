package com.yaman.cachingandpaginationwithpaging3jetpackcompose.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.yaman.cachingandpaginationwithpaging3jetpackcompose.models.Movie
import com.yaman.cachingandpaginationwithpaging3jetpackcompose.models.RemoteKeys
import com.yaman.cachingandpaginationwithpaging3jetpackcompose.services.MoviesDao
import com.yaman.cachingandpaginationwithpaging3jetpackcompose.services.RemoteKeysDao

@Database(
    entities = [Movie::class, RemoteKeys::class],
    version = 1,
)
abstract class MoviesDatabase: RoomDatabase() {
    abstract fun getMoviesDao(): MoviesDao
    abstract fun getRemoteKeysDao(): RemoteKeysDao
}