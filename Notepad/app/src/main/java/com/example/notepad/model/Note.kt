package com.example.notepad.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize
import java.util.*

// The reminder class which can be parsed from one activity to another
@Parcelize
@Entity(tableName = "noteTable")
data class Note(
    var title: String,
    var lastUpdated: Date,
    var text: String,
    @PrimaryKey var id : Long? = null
) : Parcelable