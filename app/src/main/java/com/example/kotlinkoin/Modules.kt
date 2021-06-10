package com.example.kotlinkoin

import org.koin.core.module.Module
import org.koin.dsl.module

val appModule: Module = module {
    // Maintain one instance of the class as a singleton
    single { SchoolCourse() }

    // Creates an instance each time the dependency is called
    factory { Friend() }

    // Creates a new instance each time
    factory { Student(get(), get()) }
}