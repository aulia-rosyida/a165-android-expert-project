package com.dicoding.tourismapp.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.dicoding.tourismapp.core.domain.usecase.TourismUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/** Karena Hilt sudah terintegrasi dengan Jetpack,
 * Anda dapat melakukan Injection pada ViewModel dengan jauh lebih mudah tanpa perlu menggunakan multi-binding lagi.
 * Yaitu dengan menggunakan anotasi @HiltViewModel dan @Inject seperti berikut:*/
@HiltViewModel
class HomeViewModel @Inject constructor(tourismUseCase: TourismUseCase) : ViewModel() {
    val tourism = tourismUseCase.getAllTourism().asLiveData()
}

