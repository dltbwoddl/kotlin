package com.example.recyclerview

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.buttonlayout.view.*
import kotlinx.android.synthetic.main.recycleitem.view.*


class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    //    fun bindItem(item:Item){
//        itemView.idxTV.text = item.idx
//        itemView.contentTV.text = item.content
////    }
//    fun setid(id: String){
//
//    }
    fun bindItem(item: Item) {
        itemView.numBtn.text = item.idx
        }
}

class ItemAdapter() : RecyclerView.Adapter<Holder>() {

    var items = mutableListOf<Item>()

    /**
     * 레이아웃 매니저가 호출하여 뷰 홀더기 컨텐츠를 표시하기 위해 사용하는 뷰를 생성.
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        // Inflater 특정 xml을 클래스로 변환할 수 있도록 해준다.
        val itemView: View =
            LayoutInflater.from(parent.context).inflate(R.layout.buttonlayout, parent, false)
        return Holder(itemView)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    /*
    *레이아웃 매니저가 호출하여 리사이클러뷰에 뷰 홀더의 위치를 전달하여 생성된 아이템을 레이아웃에 바인딩하는 것
     */
    override fun onBindViewHolder(holder: Holder, position: Int) {
        val item: Item = items[position]
        holder.bindItem(item)
    }
}