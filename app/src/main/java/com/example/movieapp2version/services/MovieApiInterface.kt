package com.example.movieapp2version.services

import com.example.movieapp2version.models.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {
    @GET("/3/movie/popular?api_key=11459cff1c1ce00e3202addab99f3a91")
    fun getMovieList(): Call<MovieResponse>
}