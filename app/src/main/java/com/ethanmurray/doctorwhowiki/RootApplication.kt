package com.ethanmurray.doctorwhowiki

import android.app.Application
import com.ethanmurray.doctorwhowiki.engine.di.KoinFactory
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger

class RootApplication: Application() {
    override fun onCreate() {
        super.onCreate()

        // Initialise DI
        KoinFactory.start {
            androidLogger()
            androidContext(this@RootApplication)
        }
    }
}
