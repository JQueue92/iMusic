package com.jqueue.imusic.rank.album

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.bumptech.glide.Glide
import com.jqueue.BaseAdapter
import com.jqueue.VH
import com.jqueue.imusic.R
import com.jqueue.imusic.rank.album.bean.Result
import kotlinx.android.synthetic.main.activity_album_list.*

class AlbumListActivity : AppCompatActivity(),AlbumBaseView {

    override lateinit var presenter: AlbumPresenter
    lateinit var adapter: BaseAdapter<Result>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_album_list)
        presenter = AlbumPresenter(this)
        initView()
    }

    override fun onResume() {
        super.onResume()
        presenter.start()
    }

    override fun showAlbumList(result: List<Result>) {
        for(value in result){
            adapter.list = result
            adapter.notifyDataSetChanged()
        }
    }

    fun initView(){
        recycleView.layoutManager = GridLayoutManager(this,2)
        adapter = object : BaseAdapter<Result>(R.layout.list_album, this) {
            override fun onBindViewHolder(holder: VH, position: Int) {
                val data = list?.get(position)
                Glide.with(this@AlbumListActivity).load(data.pic_s192).into(holder.getView(R.id.albumPosterImg))
                holder.getView<TextView>(R.id.albumNameTxt).text = data.name
            }
        }
        adapter.list = emptyList<Result>()
        recycleView.adapter = adapter
    }
}
