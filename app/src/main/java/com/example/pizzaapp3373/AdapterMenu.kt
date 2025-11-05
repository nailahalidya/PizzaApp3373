package com.example.pizzaapp3373

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterMenu (private val listMenu: List<MenuModel>):
                    RecyclerView.Adapter<AdapterMenu.ViewHolder>(){
    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val imgGambar : ImageView
        val textNamaMenu : TextView
        val textHargaMenu : TextView
        val context = view.context;
        init {
            imgGambar = view.findViewById( R.id.imageViewGambarMenu)
            textNamaMenu = view.findViewById( R.id.textView10)
            textHargaMenu = view.findViewById(R.id.textView9)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder{
        val layoutInflater = LayoutInflater.from(parent?.context)
        val cellForRow = layoutInflater.inflate(R.layout.card_layout_menu,
            parent, false)
        return ViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val modelMenu = listMenu[position]
        holder.imgGambar.setImageResource(modelMenu.gambar)
        holder.textNamaMenu.text = modelMenu.nama
        holder.textHargaMenu.text = modelMenu.harga
    }

    override fun getItemCount(): Int {
        return listMenu.size
    }
}