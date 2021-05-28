package com.dicoding.tourismapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
open class MyApplication : Application() {

    /**  menghapus kode untuk inject Component karena Anda sudah tidak menggunakannya lagi. */
}

