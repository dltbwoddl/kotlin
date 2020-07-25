package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_recycleviewactivity.*
import kotlinx.android.synthetic.main.buttonlayout.*
import kotlinx.android.synthetic.main.recycleitem.*
//버튼을 누르면 버튼이 사라지게 하기.
class recycleviewactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycleviewactivity)
        /**
         * 1.리사이클러뷰 추가
         * 2.아이템뷰 생성
         * 3.데이터 정의
         * 4.뷰홀더
         * 5.어댑터
         * 6.리사이클러뷰에 어댑터 레이아웃에 할당.
         */
        val adapter = ItemAdapter()
        adapter.items = setData()
        recyclerview.adapter=adapter
        recyclerview.layoutManager = LinearLayoutManager(this)
//        recyclerview.layoutManager = GridLayoutManager(this,3)


    }
//private fun setData():MutableList<Item>{
//    var data = mutableListOf<Item>()
//
//    for (i:Int in 0..100){
//        val item = Item("$i","this is my content $i")
////        Log.d("Item::",item.toString())
//        data.add(item)
//    }
//    return data
//}
//fun oc():View.OnClickListener {
//
//    alertBtn.setOnClickListener{
//        alertBtn.text="hi".toString()
//    }
//}
    private fun setData():MutableList<Item>{
    var data = mutableListOf<Item>()

    for (i:Int in 0..100){
        val item = Item("$i","this is my content $i")
//        Log.d("Item::",item.toString())
        data.add(item)

    }

    return data
}
}