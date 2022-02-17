package com.example.constellations.adapater

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.constellations.R
import com.example.constellations.model.ZodiacSigns

class Adapter(

    private val context: Context,
    private val dataset: List<ZodiacSigns>


) : RecyclerView.Adapter<Adapter.ViewHolder>() {


    class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

        val textView: TextView = view.findViewById(R.id.list_item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder{
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item,parent,false)
        return ViewHolder(adapterLayout)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int){
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
    }

    override fun getItemCount(): Int = dataset.size
}

