package com.android.birthdaygreeting

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class CustomAdapter(private val context: Context, private val images: List<model>, val listener:(model) ->Unit) :
    RecyclerView.Adapter<CustomAdapter.ImageViewHolder>() {

    class ImageViewHolder(view:View): RecyclerView.ViewHolder(view) {

        val img=itemView.findViewById<ImageView>(R.id.image)
        val imgTitle=itemView.findViewById<TextView>(R.id.title)
        fun bindView(image: model,listener:(model) ->Unit) {
            img.setImageResource(image.imagesrc)
            //imgTitle.text= image.title
            itemView.setOnClickListener{listener(image)}
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomAdapter.ImageViewHolder {
        val v= LayoutInflater.from(context).inflate(R.layout.photo_layout,parent,false)
        val viewHolder=ImageViewHolder(v)
//        v.setOnClickListener(
//            listener.OnItemClicked(images(viewHolder.adapterPosition))
//        )
        return viewHolder

    }

    override fun onBindViewHolder(holder: CustomAdapter.ImageViewHolder, position: Int) {
       holder.bindView(images[position],listener)


    }

    override fun getItemCount(): Int {
        return images.size
    }


}

