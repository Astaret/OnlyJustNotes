package com.example.onlyjustnotes.Home.Domain.Impl

import com.example.onlyjustnotes.Core.Domain.Model.Note
import com.example.onlyjustnotes.Core.Domain.Repository.LocalDataSourceRepository
import com.example.onlyjustnotes.Home.Domain.DeleteNoteUseCase
import javax.inject.Inject

class DeleteNoteUseCaseImpl @Inject constructor(
    private val localDataSourceRepository: LocalDataSourceRepository
):DeleteNoteUseCase {
    override suspend fun invoke(note: Note) {
        localDataSourceRepository.deleteNote(note)
    }
}

