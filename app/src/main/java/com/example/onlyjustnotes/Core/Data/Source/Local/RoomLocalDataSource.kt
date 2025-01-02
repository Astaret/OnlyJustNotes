package com.example.onlyjustnotes.Core.Data.Source.Local

import com.example.onlyjustnotes.Core.Data.Mapper.toNote
import com.example.onlyjustnotes.Core.Data.Mapper.toNoteEntity
import com.example.onlyjustnotes.Core.Data.Source.Local.DAO.NoteDao
import com.example.onlyjustnotes.Core.Domain.Model.Note
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class RoomLocalDataSource @Inject constructor(
    private val noteDao: NoteDao
):LocalDataSource {
    override fun getAllNotesFlow(): Flow<List<Note>> {
        return noteDao.getAllNotes().map { noteEntityList ->
            noteEntityList.map { noteEntity -> noteEntity.toNote() }
        }
    }

    override suspend fun addNote(note: Note) {
        noteDao.insertNote(note.toNoteEntity())
    }

    override suspend fun deleteNote(note: Note) {
        noteDao.deleteNote(note.toNoteEntity())
    }

    override suspend fun updateNote(note: Note) {
        noteDao.updateNote(note.toNoteEntity())
    }

    override fun getNoteByIdFLow(id: Int): Flow<Note> {
        return noteDao.getNoteById(id).map { noteEntity ->
            noteEntity.toNote()
        }
    }
}