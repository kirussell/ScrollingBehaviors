package com.kirussell.scrollingbehaviors.horizontalinsidevertical.recyclerinrecycler

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.kirussell.scrollingbehaviors.R


class RecyclerInsideRecycler : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recycler_view_activity)

        initRecycler();
    }

    private fun initRecycler() {
        val recycler = findViewById<RecyclerView>(R.id.recycler)
        recycler.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        recycler.adapter = SectionsAdapter(
            listOf(
                Section(
                    "Title 1",
                    Color.RED,
                    listOf("One", "Two", "Three")
                ),
                Section(
                    "Title 2",
                    Color.GREEN,
                    listOf("One", "Two", "Three", "Four")
                ),
                Section(
                    "Title 3",
                    Color.BLUE,
                    listOf("One", "Two", "Three", "Four", "Five")
                )
            )
        )
    }
}

