package com.sunnyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

/***
 由于从ViewModel层开始就不再持有Activity的引用了，
 因此经常会出现“缺Context”的情况，
 给SunnyWeather项目提供一种全局获取Context的方式。
***/

class SunnyWeatherApplication :Application(){

    companion object {

        const val TOKEN = "M5EC4uusR8my1nd0" // 填入你申请到的令牌值方便之后获取

        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}