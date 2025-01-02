package com.example.onlyjustnotes.Home.Domain

import com.example.onlyjustnotes.Core.Domain.Model.Note
import kotlinx.coroutines.flow.Flow

interface GetAllNotesUseCase {
    operator fun invoke(): Flow<List<Note>>
}