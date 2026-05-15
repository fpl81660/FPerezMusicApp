package com.example.musicapp.services

import com.example.musicapp.models.Album
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface MusicApiService {
    @GET("api/albums")
    suspend fun getAlbums(): List<Album>
}

object RetrofitClient {
    private const val BASE_URL = "https://musicapi.pjasoft.com/"

    val apiService: MusicApiService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(MusicApiService::class.java)
    }
}