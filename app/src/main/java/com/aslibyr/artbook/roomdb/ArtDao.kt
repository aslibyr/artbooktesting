package com.aslibyr.artbook.roomdb

import androidx.lifecycle.LiveData
import androidx.room.*
import com.aslibyr.artbook.model.Art

@Dao
interface ArtDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertArt(art: Art)

    @Delete
    suspend fun deleteArt(art: Art)

    @Query("SELECT * FROM Arts")
    fun observeArts(): LiveData<List<Art>>
}