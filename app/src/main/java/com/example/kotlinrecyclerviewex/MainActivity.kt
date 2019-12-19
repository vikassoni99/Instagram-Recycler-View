package com.example.kotlinrecyclerviewex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import android.widget.Toolbar
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlinrecyclerviewex.R.drawable.ic_like_after
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout_blog_list_item.*

class MainActivity : AppCompatActivity() {

    private lateinit var blogadapter  :BlogRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecyclerView()
        addDataSet()
        //setSupportActionBar(myToolbar as androidx.appcompat.widget.Toolbar?)


//        like_icon.setOnClickListener {
//            Toast.makeText(this@MainActivity,"Liked !",Toast.LENGTH_SHORT).show()
//        }


    }

    private fun addDataSet(){
        var data=DataSource.createDataSet()
        blogadapter.submitList(data)
    }

    private fun initRecyclerView(){
        recycler_view.apply {
            layoutManager=LinearLayoutManager(this@MainActivity)
            val itemDecoration = TopSpacingItemDecoration(10)
            addItemDecoration(itemDecoration)
            blogadapter= BlogRecyclerAdapter()
            adapter=blogadapter

        }
    }

}
