package com.datasoft.kotlintemplate.core.base

sealed class BaseResult <out T : Any, out U : Any> {
    data class Success<T: Any> (val data : T) : BaseResult<T, Nothing>()
    data class Error<U : Any> (val error : U) : BaseResult<Nothing, U>()
}