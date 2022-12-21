package com.example.spravochnikrybaka.uscases

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.spravochnikrybaka.R
import com.example.spravochnikrybaka.databinding.MainContentBinding
import com.example.spravochnikrybaka.domain.ListItem

class MyAdapter(listArray: ArrayList<ListItem>,context:Context): RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    var listArrayR = listArray
    var contextR = context

    class ViewHolder(view: View):RecyclerView.ViewHolder(view) {

        val tvTitl = view.findViewById<TextView>(R.id.tv_title)
        val tvContent = view.findViewById<TextView>(R.id.tvContent)
        val tvView = view.findViewById<ImageView>(R.id.imageViewFish)
        fun bind(listItem: ListItem, context:Context){
            tvTitl.text = listItem.textTitle
            tvContent.text = listItem.contentText
            tvView.setImageResource(listItem.image_id)
            itemView.setOnClickListener(){
                Toast.makeText(context," Presserd: ${tvTitl.text}",Toast.LENGTH_SHORT).show()
            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(contextR)//получили класс который будет рисовать
        return ViewHolder(inflater.inflate(R.layout.item_layout,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var listItem = listArrayR.get(position)
        holder.bind(listItem,contextR)
    }

    override fun getItemCount(): Int {//кол во элементов в массиве
        return listArrayR.size
    }


}