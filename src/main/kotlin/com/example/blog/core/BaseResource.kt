package com.example.blog.core

abstract class BaseResource {
    fun <T> call(successMessage: String? = null, failureMessage: String? = null, function: () -> T): Response<T> {
        return try {
            Response(data = function(), successMessage ?: "success")
        } catch (e: Exception) {
            Response(data = null, failureMessage ?: e.message ?: "something went wrong")
        }
    }
}