package com.example.lab9ms

import android.app.Application
import com.example.lab9ms.data.AppContainer
import com.example.lab9ms.data.AppDataContainer

class InventoryApplication : Application() {

    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = AppDataContainer(this)
    }

}