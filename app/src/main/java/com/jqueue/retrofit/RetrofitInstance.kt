package com.jqueue.retrofit

import com.jqueue.imusic.rank.album.ApiServices.AlbumServices
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/*
 *
 * Created by ipanel@iPanel.cn
 * Date: 2019/7/17 
 * Desc：
 */

object RetrofitInstance {
    val RetrofitClient =
        Retrofit.Builder().baseUrl("https://api.apiopen.top/").addConverterFactory(GsonConverterFactory.create()).build().create(
            AlbumServices::class.java
        )
}