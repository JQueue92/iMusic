package com.jqueue.imusic.rank.album.bean

/*
 *
 * Created by ipanel@iPanel.cn
 * Date: 2019/7/17 
 * Desc：
 */

data class AlbumBean(
    val code: Int,
    val message: String,
    val result: List<Result>
)

data class Result(
    val bg_color: String,
    val bg_pic: String,
    val color: String,
    val comment: String,
    val content: List<Content>,
    val count: Int,
    val name: String,
    val pic_s192: String,
    val pic_s210: String,
    val pic_s260: String,
    val pic_s444: String,
    val type: Int,
    val web_url: String
)

data class Content(
    val album_id: String,
    val album_title: String,
    val all_rate: String,
    val author: String,
    val biaoshi: String,
    val pic_big: String,
    val pic_small: String,
    val rank_change: String,
    val song_id: String,
    val title: String
)