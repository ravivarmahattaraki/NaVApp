package com.roks.navapp.base

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.roks.navapp.R

abstract class BaseActivity : AppCompatActivity(), IBaseActivityContract{
    companion object {
        val TAG = "BaseActivity"
    }

    lateinit var baseBinding : ViewDataBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "onCreate: ")
        super.onCreate(savedInstanceState)

        baseBinding = DataBindingUtil.setContentView(this, getLayout())
        this.init()
    }

    override fun onResume() {
        Log.d(TAG, "onResume: ")
        super.onResume()

        this.initViews()
        this.initObservers()
    }
}