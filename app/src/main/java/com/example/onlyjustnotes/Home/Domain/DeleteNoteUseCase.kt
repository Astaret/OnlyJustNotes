package com.example.onlyjustnotes.Home.Domain

import com.example.onlyjustnotes.Core.Domain.Model.Note

interface DeleteNoteUseCase {
    suspend operator fun invoke(note: Note)
}