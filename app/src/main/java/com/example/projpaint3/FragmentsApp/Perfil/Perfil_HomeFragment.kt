package com.example.projpaint3.FragmentsApp.Perfil

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.projpaint3.Adapter.EventoAdapter
import com.example.projpaint3.Model.Evento
import com.example.projpaint3.Model.Local
import com.example.projpaint3.Model.Usuario

import com.example.projpaint3.R
import kotlinx.android.synthetic.main.fragment_perfil__home.*
import java.sql.Time
import java.util.*

/**
 * A simple [Fragment] subclass.
 */
class Perfil_HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_perfil__home, container, false)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_editar_prefil.setOnClickListener{
            findNavController().navigate(R.id.action_perfil_HomeFragment_to_perfil_EditFragment)
        }

        var local1 = Local(1,"Tijuca","tijuca...","tijuca.com","9123120318")

        var usuario_host = Usuario(1,"elias","qwert","elias@uakti.com", 2,"Leblon","blablabla")

        var usuarios1 = mutableListOf<Usuario>(
            Usuario(2,"rodrigo","qwert","rod@uakti.com", 2,"Leblon2","blablabla2"),
            Usuario(3,"biel","qwert","biel@uakti.com", 2,"Leblon3","blablabla3")
            )

        var usuarios2 = mutableListOf<Usuario>(
            Usuario(4,"fjghjg","qwert","elias@uakti.com", 2,"Leblon","blablabla"),
            Usuario(5,"eqweqeq","qwert","rod@uakti.com", 2,"Leblon2","blablabla2"),
            Usuario(6,"biel","qwert","biel@uakti.com", 2,"Leblon3","blablabla3"),
            Usuario(7,"elsdaa","qwert","elias@uakti.com", 2,"Leblon","blablabla"),
            Usuario(8,"asdf","qwert","rod@uakti.com", 2,"Leblon2","blablabla2"),
            Usuario(9,"dgdh","qwert","biel@uakti.com", 2,"Leblon3","blablabla3")
        )

        var evento = Evento(1,"Tijuquinha",local1,usuarios1,usuarios2,usuario_host, Date(2020,7,27), Time(9,45,0),Time(12,0,0),10)

        var evento2 = Evento(2,"Usina",local1,usuarios1,usuarios2,usuario_host, Date(2020,7,27), Time(12,45,0),Time(15,0,0),10)

        var eventos = mutableListOf<Evento>(evento,evento2)

        rcy_meu_evento.adapter = EventoAdapter(eventos)
        rcy_meu_evento.layoutManager = LinearLayoutManager(activity!!.baseContext)

    }
}
