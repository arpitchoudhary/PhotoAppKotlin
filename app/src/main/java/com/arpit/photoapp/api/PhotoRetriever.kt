package com.arpit.photoapp.api

import com.arpit.photoapp.model.PhotoList
import retrofit2.Callback
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by achoudhary on 5/22/17.
 */
class PhotoRetriever {

    private val service: PhotoApi

    init {
        val retrofit = Retrofit.Builder()
                .baseUrl("https://pixabay.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        service = retrofit.create(PhotoApi::class.java)
    }

    fun getPhotos(callback: Callback<PhotoList>){
        val call = service.getPhotos()
        call.enqueue(callback)
    }
}