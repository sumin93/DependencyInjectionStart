package com.example.dependencyinjectionstart.example1

import dagger.Component

@Component(modules = [ComputerModule::class])
interface MyComponent {

    fun inject(activity: Activity)
}