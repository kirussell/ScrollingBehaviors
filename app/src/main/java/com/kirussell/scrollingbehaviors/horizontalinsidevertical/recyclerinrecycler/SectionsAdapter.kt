package com.kirussell.scrollingbehaviors.horizontalinsidevertical.recyclerinrecycler

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.kirussell.scrollingbehaviors.R
import com.kirussell.scrollingbehaviors.horizontalinsidevertical.nestedscrollview.initRecycler


data class Section(
    val title: String,
    val color: Int,
    val items: List<String>
)

class SectionVH(view: View) : RecyclerView.ViewHolder(view) {

    internal val title = view.findViewById<TextView>(R.id.title)
}

class SectionsAdapter(private val sections: List<Section>) : RecyclerView.Adapter<SectionVH>() {

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int) =
        SectionVH(
            LayoutInflater.from(parent.context).inflate(
                R.layout.section_layout,
                parent,
                false
            )
        )

    override fun getItemCount() = sections.size

    override fun onBindViewHolder(vh: SectionVH, position: Int) {
        val section = sections[position]
        vh.title.text = section.title
        initRecycler(
            vh.itemView,
            R.id.content_recycler,
            section.color,
            section.items
        )
    }

}
