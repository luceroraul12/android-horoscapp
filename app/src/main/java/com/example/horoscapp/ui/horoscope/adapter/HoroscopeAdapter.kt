package com.example.horoscapp.ui.horoscope.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.horoscapp.R
import com.example.horoscapp.domain.model.HoroscopeInfo

class HoroscopeAdapter(private var list: List<HoroscopeInfo> = emptyList(),
                       private val onItemSelected:(item: HoroscopeInfo) -> Unit): RecyclerView.Adapter<HoroscopeViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HoroscopeViewHolder {
        return HoroscopeViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_horoscope,parent, false)
        )
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: HoroscopeViewHolder, position: Int) {
        holder.render(list.get(position)) {onItemSelected(it)}
    }

    fun updateList(list: List<HoroscopeInfo>){
        this.list = list

        notifyDataSetChanged()
    }
}