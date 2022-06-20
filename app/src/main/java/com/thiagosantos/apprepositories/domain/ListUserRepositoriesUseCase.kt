package com.thiagosantos.apprepositories.domain

import com.thiagosantos.apprepositories.core.UseCase
import com.thiagosantos.apprepositories.data.model.Repo
import com.thiagosantos.apprepositories.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(

    private val repository: RepoRepository) : UseCase<String, List<Repo>>() {
    override suspend fun execute(param: String): Flow<List<Repo>> {
       return repository.listRepositories(param)
    }

}