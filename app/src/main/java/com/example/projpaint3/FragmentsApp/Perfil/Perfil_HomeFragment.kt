package com.example.projpaint3.FragmentsApp.Perfil

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

import com.example.projpaint3.R
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

        btn_editar_perfil.setOnClickListener{
            findNavController().navigate(R.id.action_perfil_HomeFragment_to_perfil_EditFragment)
        }



    }
}
