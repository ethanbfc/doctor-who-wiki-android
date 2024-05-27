package com.ethanmurray.doctorwhowiki.engine

sealed class SharedResult<out A, out E> {
    fun isSuccess() = this is Success
    fun isFailure() = this is Failure

    data class Success<A>(val a: A) : SharedResult<A, Nothing>()
    data class Failure<E>(val e: E): SharedResult<Nothing, E>()

    companion object {
        fun <A, E, T>fold(
            result: SharedResult<A, E>,
            fe: (E) -> T,
            fa: (A) -> T
        ): T = when (result) {
            is Failure -> fe(result.e)
            is Success -> fa(result.a)
        }
    }
}
