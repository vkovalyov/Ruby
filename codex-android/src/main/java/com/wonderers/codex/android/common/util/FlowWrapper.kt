package com.wonderers.codex.android.common.util

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class StateFlowWrapper<T : Any>(
    val scope: CoroutineScope,
    val actual: StateFlow<T>
) : StateFlow<T> by actual {

    fun collectIos(collector: (T) -> Unit) {
        scope.launch {
            actual.collect(collector)
        }
    }

    override val value: T
        get() = actual.value
}

class FlowWrapper<T : Any>(
    val scope: CoroutineScope,
    val actual: Flow<T>
) : Flow<T> by actual {

    fun collectIos(collector: (T) -> Unit) {
        scope.launch {
            actual.collect(collector)
        }
    }
}

fun <T : Any> StateFlow<T>.hideIn(vm: ViewModel) = StateFlowWrapper(scope = vm.scope, actual = this)
fun <T : Any> Flow<T>.hideIn(vm: ViewModel) = FlowWrapper(scope = vm.scope, actual = this)
fun <T : Any> StateFlow<T>.hide(scope: CoroutineScope) = StateFlowWrapper(scope = scope, actual = this)
fun <T : Any> Flow<T>.hide(scope: CoroutineScope) = FlowWrapper(scope = scope, actual = this)
