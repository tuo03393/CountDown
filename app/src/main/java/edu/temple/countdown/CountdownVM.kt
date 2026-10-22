package edu.temple.countdown

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.time.Duration.Companion.milliseconds

class CountdownVM : ViewModel() {

    var counter by mutableIntStateOf(100)

    fun startCountdown() {

        viewModelScope.launch {
            repeat(100) {
                counter = (100 - it) //100 should be a value somewhere, instead of being hardcoded.
                delay(1000.milliseconds)
            }
        }

    }


}