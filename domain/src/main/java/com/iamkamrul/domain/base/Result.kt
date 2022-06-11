package com.iamkamrul.domain.base

sealed class Result<out R> {
    data class Success<out T>(val data: T) : Result<T>()
    data class Error(val message: String,val code:Int) : Result<Nothing>()
}