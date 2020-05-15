package com.example.projpaint3.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.projpaint3.Model.Local
import com.example.projpaint3.R
import kotlinx.android.synthetic.main.card_view_local.view.*
import java.text.SimpleDateFormat

class LocalAdapter (var locais : MutableList<Local>) : RecyclerView.Adapter<LocalAdapter.LocalViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LocalViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.card_view_local,parent,false)
        return LocalViewHolder(view)
    }

    override fun getItemCount(): Int = locais.size

    override fun onBindViewHolder(holder: LocalViewHolder, position: Int) {
        holder.bind(locais[position])
    }

    inner class LocalViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        fun bind(local : Local){

            itemView.nome_local_txt.text = local.nome
            itemView.endereco_local_txt.text = local.endereco
            itemView.telefone_local_txt.text = local.telefone

            if (local.link != null){
                itemView.link_local_txt.text = local.link
            }


        }
    }



}