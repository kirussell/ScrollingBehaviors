package com.kirussell.scrollingbehaviors.horizontalinsidevertical.nestedscrollview

import android.annotation.SuppressLint
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.support.v7.widget.RecyclerView
import com.kirussell.scrollingbehaviors.horizontalinsidevertical.ItemAdapter
import com.kirussell.scrollingbehaviors.R


class HorizontalRecyclerInsideNestedScrollViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nested_scrollview_activity)

        val rootView = findViewById<View>(R.id.rootView)
        initRecycler(
            rootView,
            R.id.recycler_one,
            Color.RED,
            listOf("One", "Two", "Three")
        )
        initRecycler(
            rootView,
            R.id.recycler_two,
            Color.GREEN,
            listOf("One", "Two", "Three", "Four")
        )
        initRecycler(
            rootView,
            R.id.recycler_three,
            Color.BLUE,
            listOf("One", "Two", "Three", "Four", "Five")
        )
    }
}

@SuppressLint("ClickableViewAccessibility")
internal fun initRecycler(view: View, recyclerId: Int, color: Int, items: List<String>) {
    val recycler = view.findViewById<RecyclerView>(recyclerId)
    recycler.layoutManager = LinearLayoutManager(view.context, RecyclerView.HORIZONTAL, false)
    recycler.adapter = ItemAdapter(
        items, color
    )

    // CHECKING Nested scrolling
    recycler.setHasFixedSize(false)
    recycler.isNestedScrollingEnabled = false
}