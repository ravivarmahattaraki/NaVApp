package com.roks.navapp

import android.app.Application
import android.view.View
import androidx.lifecycle.MutableLiveData
import com.roks.navapp.base.BaseViewModel

class MainActivityVM(application: Application) : BaseViewModel(application) {

    var sayHiClickLD = MutableLiveData<Boolean>(false)
    val sayHiTv = MutableLiveData("Default")

    fun sayHiClick(view : View){
        sayHiClickLD.value = true
    }
}