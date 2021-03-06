package com.chaveze.affirmationsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.chaveze.affirmationsapp.adapter.ItemAdapter
import com.chaveze.affirmationsapp.data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myDataSet = DataSource().loadAffirmations()
        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)

//        recyclerView.layoutManager = GridLayoutManager(this, 3)
        recyclerView.adapter = ItemAdapter(this, myDataSet, recyclerView.layoutManager is GridLayoutManager)
        recyclerView.setHasFixedSize(true)
    }
}