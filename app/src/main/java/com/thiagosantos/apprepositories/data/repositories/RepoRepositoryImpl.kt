package com.thiagosantos.apprepositories.data.repositories

import com.thiagosantos.apprepositories.data.model.Repo
import com.thiagosantos.apprepositories.data.services.GitHubServices
import kotlinx.coroutines.flow.flow

class RepoRepositoryImpl(private val service: GitHubServices): RepoRepository  {

    override suspend fun listRepositories(user: String) = flow {
       val repoList = service.listRepositories(user)
        emit(repoList)
    }
}