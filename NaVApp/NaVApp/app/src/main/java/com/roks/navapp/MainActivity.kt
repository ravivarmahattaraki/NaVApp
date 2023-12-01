package com.roks.navapp

import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.roks.navapp.base.BaseActivity
import com.roks.navapp.databinding.ActivityMainBinding

class MainActivity : BaseActivity(){
    lateinit var mainActivityVM : MainActivityVM
    lateinit var mBinding: ActivityMainBinding
    companion object{
        val TAG = "MainActivity"
    }

    override fun init() {
        Log.d(TAG, "init: ")

        mainActivityVM = ViewModelProvider(this)[MainActivityVM::class.java]
        mBinding = baseBinding as ActivityMainBinding
        mBinding.lifecycleOwner = this
        mBinding.mainViewModel = mainActivityVM

    }

    override fun initViews() {
        Log.d(TAG, "initViews: ")
    }

    override fun initObservers() {
        mainActivityVM.sayHiClickLD.observe(this, Observer { boolean ->
            if(boolean) {
                mBinding.textView.text = "HI ROKS"
            }
        })
    }

    override fun getLayout(): Int {
        Log.d(TAG, "getLayout: ")
        return R.layout.activity_main
    }
}