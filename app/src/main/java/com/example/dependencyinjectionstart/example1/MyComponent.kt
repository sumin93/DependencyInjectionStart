package com.example.dependencyinjectionstart.example1

import dagger.Component

@Component
interface MyComponent {

    fun getMonitor(): Monitor

    fun getKeyboard(): Keyboard

    fun inject(activity: Activity)
}