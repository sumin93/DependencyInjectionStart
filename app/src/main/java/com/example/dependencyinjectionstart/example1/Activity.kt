package com.example.dependencyinjectionstart.example1

import javax.inject.Inject

class Activity {
    val keyboard: Keyboard = DaggerNewComponent.create().getKeyboard()
    val mouse: Mouse = DaggerNewComponent.create().getMouse()
    val monitor: Monitor = DaggerNewComponent.create().getMonitor()
}
