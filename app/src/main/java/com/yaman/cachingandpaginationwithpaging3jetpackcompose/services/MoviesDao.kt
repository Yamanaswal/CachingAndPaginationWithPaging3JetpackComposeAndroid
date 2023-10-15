package com.yaman.cachingandpaginationwithpaging3jetpackcompose.services

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.yaman.cachingandpaginationwithpaging3jetpackcompose.models.Movie

@Dao
interface MoviesDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(movies: List<Movie>)

    @Query("Select * From movies Order By page")
    fun getMovies(): PagingSource<Int, Movie>

    @Query("Delete From movies")
    suspend fun clearAllMovies()
}