package com.aliahmed1973.statecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun WellnessScreen(
    modifier: Modifier = Modifier,
    wellnessViewModel: WellnessViewModel = viewModel()
) {
    Column(modifier = modifier) {
        WaterCounter()

        WellnessTaskList(
            list = wellnessViewModel.tasks,
            onChecked = { task,checked->wellnessViewModel.changeTaskChecked(task,checked) },
            onClose = { task -> wellnessViewModel.remove(task) })
    }
}


