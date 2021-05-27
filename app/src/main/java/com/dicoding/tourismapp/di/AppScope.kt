package com.dicoding.tourismapp.di

import javax.inject.Scope

/**
 * karena kelas AppComponent akan depend (tergantung) pada CoreComponent, kedua kelas ini harus memiliki scope yang berbeda.
 * Untuk itu kita akan membuat custom scope sendiri. Buat class baru dengan nama AppScope
 * */
@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class AppScope