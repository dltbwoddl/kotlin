package com.example.recyclerview

import android.view.View

//데이터 클래스는 데이터 저장용 클래스
data class Item(val idx:String, val content:String)
//data class Item(val idx:String, val content:String, val onClickListener: View.OnClickListener)