package com.example.projpaint3.FragmentsApp.Perfil

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

import com.example.projpaint3.R
import kotlinx.android.synthetic.main.fragment_perfil__edit.*

/**
 * A simple [Fragment] subclass.
 */
class Perfil_EditFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_perfil__edit, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_confirmar_editar_perfil.setOnClickListener{
            findNavController().navigate(R.id.action_perfil_EditFragment_to_perfil_HomeFragment)
        }
    }
}
