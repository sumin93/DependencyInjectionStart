package com.example.dependencyinjectionstart.example1

import javax.inject.Inject

class Activity {

    private val component = DaggerMyComponent.create()

    val keyboard: Keyboard = component.getKeyboard()

    @Inject
    lateinit var mouse: Mouse

    val monitor: Monitor = component.getMonitor()

    init {
        DaggerMyComponent.create().inject(this)
    }
}