package com.aliahmed1973.statecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
        var count by rememberSaveable { mutableStateOf(0) }
    StatelessCounter(count, { count++ },modifier)
}

@Composable
private fun StatelessCounter( count: Int,onIncrement:()->Unit,modifier: Modifier) {
    var count1 = count
    Column(modifier = modifier.padding(16.dp)) {

        if (count1 > 0) {

            Text(text = "You've had $count1 glasses.", modifier = modifier)
        }

        Button(
            onClick = onIncrement,
            modifier = Modifier.padding(top = 8.dp),
            enabled = count1 < 10
        ) {
            Text(text = "Add one")
        }
    }
}