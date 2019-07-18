package com.jqueue.imusic.rank.album

import com.jqueue.imusic.IBaseView
import com.jqueue.imusic.rank.album.bean.Result

/*
 *
 * Created by ipanel@iPanel.cn
 * Date: 2019/7/17 
 * Desc：
 */

interface AlbumBaseView :IBaseView<AlbumPresenter> {
    fun showAlbumList(result: List<Result>)
}