package com.thiagosantos.apprepositories

import android.app.Application
import com.thiagosantos.apprepositories.data.di.DataModule
import com.thiagosantos.apprepositories.domain.di.DomainModule
import com.thiagosantos.apprepositories.presentation.ui.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin{
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }

}