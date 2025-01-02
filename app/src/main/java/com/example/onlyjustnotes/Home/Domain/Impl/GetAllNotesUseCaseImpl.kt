package com.example.onlyjustnotes.Home.Domain.Impl

import com.example.onlyjustnotes.Core.Domain.Repository.LocalDataSourceRepository
import com.example.onlyjustnotes.Home.Domain.GetAllNotesUseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetAllNotesUseCaseImpl @Inject constructor(
    private val localDataSourceRepository: LocalDataSourceRepository
): GetAllNotesUseCase{
    override fun invoke() = localDataSourceRepository.getAllNotesFlow()
}