package com.order.mostgreen.basiclistview

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    //創建數據
    val data = listOf<String>("A","B","C","D","E", "F","G","H","I","J","K","L","M","N","A1","B1","C1","D1","E1", "F1","G1","H1","I1","J1","K1","L1","M1","N1")
    lateinit var my_listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //init 關聯
        my_listView = this.findViewById(R.id.my_listView)

        //創建適配器
        val adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data)

        //將適配器對相傳入 listView , 從而建立 listView 和數據聯繫
        my_listView.adapter = adapter
    }
}