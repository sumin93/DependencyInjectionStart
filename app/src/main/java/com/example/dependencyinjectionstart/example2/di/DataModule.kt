package com.example.dependencyinjectionstart.example2.di

import com.example.dependencyinjectionstart.example2.data.datasource.ExampleLocalDataSource
import com.example.dependencyinjectionstart.example2.data.datasource.ExampleLocalDataSourceImpl
import com.example.dependencyinjectionstart.example2.data.datasource.ExampleRemoteDataSource
import com.example.dependencyinjectionstart.example2.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Binds
import dagger.Module


@Module
interface DataModule {

    @ApplicationScope
    @Binds
    fun bindLocalDataSource(
        localDataSource: ExampleLocalDataSourceImpl
    ): ExampleLocalDataSource

    @ApplicationScope
    @Binds
    fun bindExampleRemoteDataSource (
        remoteDataSource: ExampleRemoteDataSourceImpl
    ): ExampleRemoteDataSource
}