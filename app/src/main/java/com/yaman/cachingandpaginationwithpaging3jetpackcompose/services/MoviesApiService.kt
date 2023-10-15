package com.yaman.cachingandpaginationwithpaging3jetpackcompose.services

import com.yaman.cachingandpaginationwithpaging3jetpackcompose.models.Consts.MOVIE_API_KEY
import com.yaman.cachingandpaginationwithpaging3jetpackcompose.models.MovieResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface MoviesApiService {
    @GET("movie/popular?api_key=${MOVIE_API_KEY}&language=en-US")
    suspend fun getPopularMovies(
        @Query("page") page: Int
    ): MovieResponse
}