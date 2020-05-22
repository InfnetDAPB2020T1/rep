package com.example.projpaint3.FragmentsApp.Perfil

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.projpaint3.Model.Usuario

import com.example.projpaint3.R
import com.example.projpaint3.Repositorio.Repos
import kotlinx.android.synthetic.main.fragment_perfil__home.*

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

        var usuario = Usuario("Roberto","qwerty","roberto@gmail.com",3,
            sobre = "Ola meu nome eh roberto e sou avancado no paintball", icone = 7,telefone = "3192381102")

        ft_perfil.setImageResource(Repos().iconeIdToResource(usuario.icone))
        nome_txt_perfil.setText(usuario.nome)
        txt_localidade_perfil.setText(usuario.localidade)
        partidas_totais_txt_perfil.setText(usuario.partidas_totais().toString())
        partidas_ganhas_txt_perfil.setText(usuario.partidas_ganhas.toString())
        desempenho_txt_perfil2.setText(usuario.desempenho().toString())
        txt_sobre_perfil.setText(usuario.sobre)
        txt_nivel.setText(Repos().nivel_usuario_toString(usuario.nivel))
        txt_telefone.setText(usuario.telefone)

    }
}
