package com.dicoding.tourismapp.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.dicoding.tourismapp.core.domain.usecase.TourismUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/** karena Hilt sudah terintegrasi dengan Jetpack,
 * maka Anda tak perlu lagi membuat multibinding dengan menggunakan ViewModelFactory dan ViewModelKey.
 * Anda dapat menggantinya cukup dengan menambahkan anotasi @ViewModelInject pada masing-masing ViewModel */

@HiltViewModel
class HomeViewModel @Inject constructor(tourismUseCase: TourismUseCase) : ViewModel() {
    val tourism = tourismUseCase.getAllTourism().asLiveData()
}

