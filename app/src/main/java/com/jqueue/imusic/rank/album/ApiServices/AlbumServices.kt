package com.jqueue.imusic.rank.album.ApiServices

import com.jqueue.imusic.rank.album.bean.AlbumBean
import retrofit2.http.GET

/*
 *
 * Created by ipanel@iPanel.cn
 * Date: 2019/7/17 
 * Desc：
 */

interface AlbumServices {

    @GET("musicRankings")
    suspend fun queryMusicRankings(): AlbumBean
}