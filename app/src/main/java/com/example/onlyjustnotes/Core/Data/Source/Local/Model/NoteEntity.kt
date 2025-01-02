package com.example.onlyjustnotes.Core.Data.Source.Local.Model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class NoteEntity (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    @ColumnInfo val title: String,
    @ColumnInfo val description: String
    )