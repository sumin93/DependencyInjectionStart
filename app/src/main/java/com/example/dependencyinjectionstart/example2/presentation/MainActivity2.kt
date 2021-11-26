package com.example.dependencyinjectionstart.example2.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.dependencyinjectionstart.R
import com.example.dependencyinjectionstart.example2.ExampleApp
import javax.inject.Inject

class MainActivity2 : AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private val viewModel by lazy {
        ViewModelProvider(this, viewModelFactory)[ExampleViewModel::class.java]
    }

    private val viewModel2 by lazy {
        ViewModelProvider(this, viewModelFactory)[ExampleViewModel2::class.java]
    }

    private val component by lazy {
        (application as ExampleApp).component
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.method()
        viewModel2.method()
    }
}
