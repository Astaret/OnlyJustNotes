package com.example.onlyjustnotes.Home.di

import com.example.onlyjustnotes.Home.Domain.DeleteNoteUseCase
import com.example.onlyjustnotes.Home.Domain.GetAllNotesUseCase
import com.example.onlyjustnotes.Home.Domain.Impl.DeleteNoteUseCaseImpl
import com.example.onlyjustnotes.Home.Domain.Impl.GetAllNotesUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class HomeScreenModule {
    @Binds
    abstract fun bindGetAllNotesUseCase(
        getAllNotesUseCaseImpl: GetAllNotesUseCaseImpl
    ): GetAllNotesUseCase

    @Binds
    abstract fun bindDeleteNoteUseCase(
        deleteNoteUseCaseImpl: DeleteNoteUseCaseImpl
    ):DeleteNoteUseCase
}