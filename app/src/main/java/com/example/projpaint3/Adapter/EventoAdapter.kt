package com.example.projpaint3.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.projpaint3.Main2Activity
import com.example.projpaint3.Model.Evento
import com.example.projpaint3.R
import kotlinx.android.synthetic.main.activity_main2.view.*
import kotlinx.android.synthetic.main.card_view_evento.view.*
import java.text.SimpleDateFormat
import android.content.Context
import kotlin.time.minutes

class EventoAdapter(var eventos : MutableList<Evento>) : RecyclerView.Adapter<EventoAdapter.EventoViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventoViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.card_view_evento,parent,false)
        return EventoViewHolder(view)
    }

    override fun getItemCount(): Int = eventos.size

    override fun onBindViewHolder(holder: EventoViewHolder, position: Int) {
        holder.bind(eventos[position])
        holder.onClick1(eventos[position])
    }

    inner class EventoViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        fun bind(evento : Evento){

            itemView.evento_nome_txt.text = evento.nome.toString()
            itemView.evento_local_txt.text = evento.local.nome.toString()
            itemView.data_evento_txt.text = "${evento.data.date.toString()}/${evento.data.month.toString()}"
            itemView.horario_evento_txt.text = "${SimpleDateFormat("H:mm").format(evento.horario_inicio)} - ${SimpleDateFormat("H:mm").format(evento.horario_termino)}"
            itemView.participantes_evento_txt.text = (evento.participantes_totais - evento.time_A.size - evento.time_B.size).toString()

        }

        fun onClick1(evento : Evento){
            itemView.setOnClickListener{

            }
        }
    }



}