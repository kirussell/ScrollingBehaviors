package com.kirussell.scrollingbehaviors

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.kirussell.scrollingbehaviors.horizontalinsidevertical.nestedscrollview.HorizontalRecyclerInsideNestedScrollViewActivity
import com.kirussell.scrollingbehaviors.horizontalinsidevertical.recyclerinrecycler.RecyclerInsideRecycler


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
    }

    fun onRecyclerInNestedScrollView(view: View) {
        startActivity(Intent(this, HorizontalRecyclerInsideNestedScrollViewActivity::class.java))
    }

    fun onRecyclerInRecycler(view: View) {
        startActivity(Intent(this, RecyclerInsideRecycler::class.java))
    }
}