package com.aliahmed1973.statecodelab

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@Composable
fun WellnessTaskList(
    list: List<WellnessTask>,
    onClose: (WellnessTask) -> Unit,
    onChecked: (WellnessTask, Boolean) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn(modifier = modifier)
    {
        items(items = list, key = { item -> item.id })
        { item ->
            WellnesTaskItem(
                taskName = item.label,
                checked = item.checked.value,
                onChecked = { checkValue -> onChecked(item, checkValue) },
                onClose = { onClose(item) })
        }
    }
}

