package com.example.testviewpager2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.category_item.view.*

class ViewPagerAdapter(var list: List<Category>) : RecyclerView.Adapter<ViewPagerAdapter.CategoryViewHolder>() {

    class CategoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        constructor(parent: ViewGroup) : this(
            itemView = LayoutInflater.from(parent.context).inflate(
                R.layout.category_item,
                parent,
                false
            )
        )

        fun bind(category: Category) {
            itemView.categoryName.text = category.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = CategoryViewHolder(parent)

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.bind(list[position])
    }

    fun setItem(list: ArrayList<Category>) {
        this.list = list
        notifyDataSetChanged()
    }
}