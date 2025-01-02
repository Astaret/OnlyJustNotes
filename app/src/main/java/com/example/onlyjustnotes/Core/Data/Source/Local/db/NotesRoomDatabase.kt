package com.example.onlyjustnotes.Core.Data.Source.Local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.onlyjustnotes.Core.Data.Source.Local.DAO.NoteDao
import com.example.onlyjustnotes.Core.Data.Source.Local.Model.NoteEntity

@Database(entities = [NoteEntity::class],version = 1)
abstract class NotesRoomDatabase:RoomDatabase() {
    abstract fun noteDao():NoteDao
}