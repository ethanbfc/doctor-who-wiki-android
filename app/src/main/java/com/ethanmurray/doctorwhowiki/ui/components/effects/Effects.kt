package com.ethanmurray.doctorwhowiki.ui.components.effects

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.filterIsInstance

@Composable
inline fun <FlowType, reified FilterType: FlowType> ExecuteOnInstanceEffect(
    flow: Flow<FlowType>,
    crossinline callback: (value: FilterType) -> Unit
) = LaunchedEffect(key1 = Unit) {
    flow.filterIsInstance<FilterType>().collect {
        callback(it)
    }
}
