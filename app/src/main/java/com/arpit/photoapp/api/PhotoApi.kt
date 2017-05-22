package com.arpit.photoapp.api

import com.arpit.photoapp.model.PhotoList
import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by achoudhary on 5/22/17.
 */
interface PhotoApi {

    @GET("?key=ENTER_YOUR_KEY_HERE&q=nature&image_type=photo")
    fun getPhotos(): Call<PhotoList>
}