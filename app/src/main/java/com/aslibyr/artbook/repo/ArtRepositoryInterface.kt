package com.aslibyr.artbook.repo

import androidx.lifecycle.LiveData
import com.aslibyr.artbook.model.Art
import com.aslibyr.artbook.model.ImageResponse

interface ArtRepositoryInterface {

    suspend fun insertArt(art: Art)

    suspend fun deleteArt(art: Art)

    fun getArt(): LiveData<List<Art>>

    suspend fun searchImage(imageString: String): com.aslibyr.artbook.Util.Resource<ImageResponse>
}