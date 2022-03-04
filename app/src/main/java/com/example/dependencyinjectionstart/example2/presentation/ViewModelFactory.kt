package com.example.dependencyinjectionstart.example2.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject

class ViewModelFactory @Inject constructor(
    private val viewModels: @JvmSuppressWildcards Map<String, ViewModel>
): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return viewModels[modelClass.simpleName] as T
    }
}