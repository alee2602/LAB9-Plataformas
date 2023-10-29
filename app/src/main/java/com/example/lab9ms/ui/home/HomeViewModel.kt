package com.example.lab9ms.ui.home

import androidx.lifecycle.ViewModel
import com.example.lab9ms.data.Item

class HomeViewModel : ViewModel() {
    companion object {
        private const val TIMEOUT_MILLIS = 5_000L
    }
}

data class HomeUiState(val itemList: List<Item> = listOf())