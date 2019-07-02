package com.kirussell.scrollingbehaviors.horizontalinsidevertical

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class ItemVH(view: View) : RecyclerView.ViewHolder(view)

class ItemAdapter(
    private val items: List<String>,
    private val color: Int
) : RecyclerView.Adapter<ItemVH>() {

    private val margin = 5
    private val size = 500

    override fun onCreateViewHolder(parent: ViewGroup, type: Int): ItemVH {
        return ItemVH(
            TextView(parent.context).apply {
                layoutParams = ViewGroup.MarginLayoutParams(size, size).apply {
                    setMargins(margin, margin, margin, margin)
                }
                setBackgroundColor(color)
            }
        )
    }

    override fun getItemCount() = items.size
    override fun onBindViewHolder(vh: ItemVH, position: Int) {
        (vh.itemView as TextView).text = items[position]
    }

}