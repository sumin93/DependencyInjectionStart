package com.example.dependencyinjectionstart.example1

import javax.inject.Inject

class Computer constructor(
    val monitor: Monitor,
    val computerTower: ComputerTower,
    val keyboard: Keyboard,
    val mouse: Mouse
)
