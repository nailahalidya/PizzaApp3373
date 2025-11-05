package com.example.pizzaapp3373

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterTransaction (private val ListOrder:List<TransactionModel>):
                            RecyclerView.Adapter<AdapterTransaction.ViewHolderOrder>() {
    class ViewHolderOrder(view: View) : RecyclerView.ViewHolder(view){
        val txtNama : TextView
        val txtHarga : TextView
        val textQty : TextView
        val imgOrder : ImageView
        val context = view.context;
        init {
            txtNama = view.findViewById(R.id.textNamaMenu)
            txtHarga = view.findViewById(R.id.textHargaMenu)
            textQty = view.findViewById(R.id.textTitleQty)
            imgOrder = view.findViewById(R.id.imageMenu)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int
    ): AdapterTransaction.ViewHolderOrder {
        val li = LayoutInflater.from( parent.context)
        val cfr = li.inflate( R.layout.card_layout_order, parent,false)
        return ViewHolderOrder(cfr)
    }

    override fun onBindViewHolder(
        holder: AdapterTransaction.ViewHolderOrder,
        position: Int
    ) {
        val modelTrx = ListOrder[position]
        holder.txtNama.text = modelTrx.nama
        holder.txtHarga.text = modelTrx.harga
        holder.textQty.text = modelTrx.qty.toString()
        holder.imgOrder.setImageResource(modelTrx.foto)
    }

    override fun getItemCount(): Int {
    return ListOrder.size
    }
}