package com.jqueue

import android.content.Context
import android.util.SparseArray
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

/*
 *
 * Created by ipanel@iPanel.cn
 * Date: 2019/7/17 
 * Desc：
 */

abstract class BaseAdapter<T>(val layoutId: Int, val context: Context) : RecyclerView.Adapter<VH>() {

    lateinit var list: List<T>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(LayoutInflater.from(context).inflate(layoutId, parent, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

}

class VH(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val sparseArray = SparseArray<View?>()
    fun <T : View> getView(id: Int): T {
        var view = sparseArray[id]
        view = view?.let { view } ?: itemView.findViewById(id)
        return view as T
    }
}
