package com.dicoding.tourismapp.di

import androidx.lifecycle.ViewModel
import dagger.MapKey
import kotlin.reflect.KClass

/** custom MapKey untuk membaca ViewModel */
@MustBeDocumented
@Target(
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY_SETTER
)

/**Untuk membuat Key Anda dapat membuat Custom Annotations dengan tipe @MapKey seperti berikut:*/
@Retention(AnnotationRetention.RUNTIME)
@MapKey
annotation class ViewModelKey(val value: KClass<out ViewModel>)