package com.arpit.photoapp.model

import java.io.Serializable

/**
 * Created by achoudhary on 5/22/17.
 */
data class Photo(val id: String,
                 val likes: Int,
                 val favorites: Int,
                 val tags: String,
                 val previewURL: String,
                 val webFormatURL: String) : Serializable{

}