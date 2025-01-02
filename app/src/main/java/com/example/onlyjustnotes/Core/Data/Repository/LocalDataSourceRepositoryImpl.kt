package com.example.onlyjustnotes.Core.Data.Repository

import com.example.onlyjustnotes.Core.Data.Source.Local.LocalDataSource
import com.example.onlyjustnotes.Core.Domain.Model.Note
import com.example.onlyjustnotes.Core.Domain.Repository.LocalDataSourceRepository
import javax.inject.Inject

class LocalDataSourceRepositoryImpl @Inject constructor(
    private val localDataSource: LocalDataSource
):LocalDataSourceRepository {
    override fun getAllNotesFlow() = localDataSource.getAllNotesFlow()

    override fun getNoteByIdFlow(id: Int) = localDataSource.getNoteByIdFLow(id)

    override suspend fun updateNote(note: Note) = localDataSource.updateNote(note)

    override suspend fun addNote(note: Note) = localDataSource.addNote(note)

    override suspend fun deleteNote(note: Note) = localDataSource.deleteNote(note)
}