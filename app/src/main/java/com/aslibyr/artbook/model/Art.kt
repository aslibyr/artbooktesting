package com.aslibyr.artbook.model

import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity(tableName = "Arts")
data class Art(
    var name: String,
    var artistname: String,
    var year: Int,
    var imageUrl: String,
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
)


