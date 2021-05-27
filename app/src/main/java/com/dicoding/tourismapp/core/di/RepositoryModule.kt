package com.dicoding.tourismapp.core.di

import com.dicoding.tourismapp.core.data.TourismRepository
import com.dicoding.tourismapp.core.domain.repository.ITourismRepository
import dagger.Binds
import dagger.Module

/** kode berikut yang digunakan untuk mem-provide interface dengan implementasinya. */
@Module(includes = [NetworkModule::class, DatabaseModule::class])
abstract class RepositoryModule {

    @Binds
    abstract fun provideRepository(tourismRepository: TourismRepository): ITourismRepository

}