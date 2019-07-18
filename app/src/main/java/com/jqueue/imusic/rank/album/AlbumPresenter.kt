package com.jqueue.imusic.rank.album

import com.jqueue.imusic.IBasePresenter
import com.jqueue.imusic.IBaseView
import com.jqueue.imusic.rank.album.bean.AlbumBean
import com.jqueue.retrofit.RetrofitInstance
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

/*
 *
 * Created by ipanel@iPanel.cn
 * Date: 2019/7/17 
 * Desc：
 */

class AlbumPresenter(val view: AlbumBaseView) : IBasePresenter {

    override fun start() {
        getAblumList()
    }

    fun getAblumList() {
        CoroutineScope(Dispatchers.Main).launch {
            val albumBean = RetrofitInstance.RetrofitClient.queryMusicRankings()
            view.showAlbumList(albumBean.result)
        }
    }

}