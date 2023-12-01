package com.roks.navapp.base

interface IBaseActivityContract {
    fun init()
    fun initViews()
    fun initObservers()
    fun getLayout(): Int
}