package com.example.dependencyinjectionstart.example1

import javax.inject.Inject

class ComputerTower constructor(
    val storage: Storage,
    val memory: Memory,
    val processor: Processor
)
