package com.example.onlyjustnotes.Core.Data.Source.Local.Di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.onlyjustnotes.Core.Data.Repository.LocalDataSourceRepositoryImpl
import com.example.onlyjustnotes.Core.Data.Source.Local.LocalDataSource
import com.example.onlyjustnotes.Core.Data.Source.Local.RoomLocalDataSource
import com.example.onlyjustnotes.Core.Data.Source.Local.db.NotesRoomDatabase
import com.example.onlyjustnotes.Core.Domain.Model.Note
import com.example.onlyjustnotes.Core.Domain.Repository.LocalDataSourceRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class LocalSourceModuleProvider {
    @Provides
    fun provideNoteDao(database:NotesRoomDatabase) = database.noteDao()

    @Provides
    @Singleton
    fun providesLocalDatabase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(
        context,
        NotesRoomDatabase::class.java,
        "just_notes-database"
    ).build()
}

@Module
@InstallIn(SingletonComponent::class)
abstract class LocalSourceModuleBinder {
    @Binds
    abstract fun bindRoomLocalDataSource(
        roomLocalDataSource: RoomLocalDataSource
    ) : LocalDataSource

    @Binds
    abstract fun bindDefaultJustNotesRepository(
        defaultJustNotesRepository: LocalDataSourceRepositoryImpl
    ) : LocalDataSourceRepository
}