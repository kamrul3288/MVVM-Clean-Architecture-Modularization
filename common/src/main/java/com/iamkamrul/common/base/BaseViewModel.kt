package com.iamkamrul.common.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

open class BaseViewModel(
    private val coroutineDispatcher: CoroutineDispatcher = Dispatchers.IO
) : ViewModel(){
     fun execute(job: suspend () -> Unit){
         viewModelScope.launch {
             job.invoke()
         }
     }
}