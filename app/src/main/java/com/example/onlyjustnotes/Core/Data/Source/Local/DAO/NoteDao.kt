package com.example.onlyjustnotes.Core.Data.Source.Local.DAO

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.onlyjustnotes.Core.Data.Source.Local.Model.NoteEntity
import kotlinx.coroutines.flow.Flow
@Dao
interface NoteDao {
    @Query("SELECT * FROM NoteEntity")
    fun getAllNotes(): Flow<List<NoteEntity>>

    @Query("SELECT * FROM NoteEntity WHERE id = :id")
    fun getNoteById(id:Int): Flow<NoteEntity>

    @Insert
    fun insertNote(note: NoteEntity)
    @Update
    fun updateNote(note: NoteEntity)
    @Delete
    fun deleteNote(note: NoteEntity)
}