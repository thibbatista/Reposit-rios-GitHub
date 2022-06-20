package com.thiagosantos.apprepositories.data.repositories

import com.thiagosantos.apprepositories.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String) : Flow<List<Repo>>
}