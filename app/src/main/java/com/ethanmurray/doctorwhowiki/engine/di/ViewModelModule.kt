package com.ethanmurray.doctorwhowiki.engine.di

import com.ethanmurray.doctorwhowiki.viewmodel.home.HomeViewModel
import com.ethanmurray.doctorwhowiki.viewmodel.splash.SplashViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

fun viewModelModule(): Module = module {
    viewModel { SplashViewModel() }
    viewModel { HomeViewModel() }
}
