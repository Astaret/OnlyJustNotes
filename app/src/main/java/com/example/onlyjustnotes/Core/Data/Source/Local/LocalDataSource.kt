package com.example.onlyjustnotes.Core.Data.Source.Local

import com.example.onlyjustnotes.Core.Domain.Model.Note
import kotlinx.coroutines.flow.Flow

interface LocalDataSource {
    fun getAllNotesFlow(): Flow<List<Note>>
    fun getNoteByIdFLow(id:Int): Flow<Note>
    suspend fun addNote(note: Note)
    suspend fun updateNote(note: Note)
    suspend fun deleteNote(note: Note)
}