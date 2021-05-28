package com.dicoding.tourismapp.core.di

import android.content.Context
import androidx.room.Room
import com.dicoding.tourismapp.core.data.source.local.room.TourismDao
import com.dicoding.tourismapp.core.data.source.local.room.TourismDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/** Tambahkan kode berikut yang sebelumnya berada di TourismDatabase. */
@Module
@InstallIn(SingletonComponent::class)
class DatabaseModule {

    @Singleton
    @Provides           //Khusus pada DatabaseModule Anda juga menambahkan @ApplicationContext untuk mendapatkan context.
    fun provideDatabase(@ApplicationContext context: Context): TourismDatabase = Room.databaseBuilder(
        context,
        TourismDatabase::class.java, "Tourism.db"
    ).fallbackToDestructiveMigration().build()

    @Provides
    fun provideTourismDao(database: TourismDatabase): TourismDao = database.tourismDao()
}