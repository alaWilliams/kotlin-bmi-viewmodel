package com.example.bmi_viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class BmiViewModel : ViewModel() {
    var heightInput by mutableStateOf("")
    var weightInput by mutableStateOf("")

    val bmi: Float
        get() {
            val height = heightInput.toFloatOrNull() ?: 0f
            val weight = weightInput.toFloatOrNull() ?: 0f
            return if (height > 0 && weight > 0) weight / (height * height) else 0f
        }
}
