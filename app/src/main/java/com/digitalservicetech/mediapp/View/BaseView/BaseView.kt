package com.digitalservicetech.mediapp.View.BaseView

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class BaseView : ViewModel() {

    val empty = MutableLiveData<Boolean>().apply { value = false }

    val dataLoading = MutableLiveData<Boolean>().apply { value = false }

    val toastMessage = MutableLiveData<String>()
}