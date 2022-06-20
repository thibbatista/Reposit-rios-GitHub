package com.thiagosantos.apprepositories.data.services

import com.thiagosantos.apprepositories.data.model.Repo
import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubServices {

    @GET("users/{user}/repos")
    suspend fun listRepositories(@Path("user") user: String): List<Repo>

}