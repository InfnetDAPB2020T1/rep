package com.example.projpaint3.FragmentsApp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.projpaint3.Adapter.EventoAdapter
import com.example.projpaint3.Model.Evento
import com.example.projpaint3.Model.Local
import com.example.projpaint3.Model.Usuario

import com.example.projpaint3.R
import kotlinx.android.synthetic.main.fragment_home.*
import java.sql.Time
import java.util.*

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



//        var rcy_home_evento : RecyclerView = view.findViewById(R.id.rcy_home_eventos)
//
//        rcy_home_evento.adapter = EventoAdapter(eventos)
//        rcy_home_evento.layoutManager = LinearLayoutManager(activity!!.baseContext)
    }
}
