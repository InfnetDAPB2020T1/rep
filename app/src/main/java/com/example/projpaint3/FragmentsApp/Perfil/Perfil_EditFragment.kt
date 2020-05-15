package com.example.projpaint3.FragmentsApp.Perfil

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.core.graphics.drawable.toBitmap
import androidx.core.view.forEach
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

        var imagem_selecionada = 1

        var nivel_selecionado = 1

        btn_edit_to_home_perfil.setOnClickListener {
            findNavController().navigate(R.id.action_perfil_EditFragment_to_perfil_HomeFragment)
        }

        btn_confirmar_edt_perfil.setOnClickListener {
            findNavController().navigate(R.id.action_perfil_EditFragment_to_perfil_HomeFragment)
        }

















        amador_txt_perfil_edt.setOnClickListener {
            rlt_lyo_nivel_perfil_edt.forEach {
                it.setBackgroundResource(R.drawable.edt_txt_format2)
            }
            it.setBackgroundResource(R.drawable.ft_selected_edit_perfil)

            nivel_selecionado = 1
        }

        intermediario_txt_perfil_edt.setOnClickListener {
            rlt_lyo_nivel_perfil_edt.forEach {
                it.setBackgroundResource(R.drawable.edt_txt_format2)
            }
            it.setBackgroundResource(R.drawable.ft_selected_edit_perfil)

            nivel_selecionado = 2
        }

        avancado_txt_perfil_edt.setOnClickListener {
            rlt_lyo_nivel_perfil_edt.forEach {
                it.setBackgroundResource(R.drawable.edt_txt_format2)
            }
            it.setBackgroundResource(R.drawable.ft_selected_edit_perfil)

            nivel_selecionado = 3
        }



        ft_edt_perfil_1.setOnClickListener {
            rlt_lyo_edt_perfil_ft_1.forEach {
                it.setBackgroundColor(Color.TRANSPARENT)
            }

            it.setBackgroundResource(R.drawable.ft_selected_edit_perfil)

            imagem_selecionada = 1
        }

        ft_edt_perfil_2.setOnClickListener {
            rlt_lyo_edt_perfil_ft_1.forEach {
                it.setBackgroundColor(Color.TRANSPARENT)
            }

            it.setBackgroundResource(R.drawable.ft_selected_edit_perfil)

            imagem_selecionada = 2
        }

        ft_edt_perfil_3.setOnClickListener {
            rlt_lyo_edt_perfil_ft_1.forEach {
                it.setBackgroundColor(Color.TRANSPARENT)
            }

            it.setBackgroundResource(R.drawable.ft_selected_edit_perfil)

            imagem_selecionada = 3
        }

        ft_edt_perfil_4.setOnClickListener {
            rlt_lyo_edt_perfil_ft_1.forEach {
                it.setBackgroundColor(Color.TRANSPARENT)
            }

            it.setBackgroundResource(R.drawable.ft_selected_edit_perfil)

            imagem_selecionada = 4
        }

        ft_edt_perfil_5.setOnClickListener {
            rlt_lyo_edt_perfil_ft_1.forEach {
                it.setBackgroundColor(Color.TRANSPARENT)
            }

            it.setBackgroundResource(R.drawable.ft_selected_edit_perfil)

            imagem_selecionada = 5
        }

        ft_edt_perfil_6.setOnClickListener {
            rlt_lyo_edt_perfil_ft_1.forEach {
                it.setBackgroundColor(Color.TRANSPARENT)
            }

            it.setBackgroundResource(R.drawable.ft_selected_edit_perfil)

            imagem_selecionada = 6
        }

        ft_edt_perfil_7.setOnClickListener {
            rlt_lyo_edt_perfil_ft_1.forEach {
                it.setBackgroundColor(Color.TRANSPARENT)
            }

            it.setBackgroundResource(R.drawable.ft_selected_edit_perfil)

            imagem_selecionada = 7
        }

        ft_edt_perfil_8.setOnClickListener {
            rlt_lyo_edt_perfil_ft_1.forEach {
                it.setBackgroundColor(Color.TRANSPARENT)
            }

            it.setBackgroundResource(R.drawable.ft_selected_edit_perfil)

            imagem_selecionada = 8
        }

        ft_edt_perfil_9.setOnClickListener {
            rlt_lyo_edt_perfil_ft_1.forEach {
                it.setBackgroundColor(Color.TRANSPARENT)
            }

            it.setBackgroundResource(R.drawable.ft_selected_edit_perfil)

            imagem_selecionada = 9
        }

        ft_edt_perfil_10.setOnClickListener {
            rlt_lyo_edt_perfil_ft_1.forEach {
                it.setBackgroundColor(Color.TRANSPARENT)
            }

            it.setBackgroundResource(R.drawable.ft_selected_edit_perfil)

            imagem_selecionada = 10
        }

        ft_edt_perfil_11.setOnClickListener {
            rlt_lyo_edt_perfil_ft_1.forEach {
                it.setBackgroundColor(Color.TRANSPARENT)
            }

            it.setBackgroundResource(R.drawable.ft_selected_edit_perfil)

            imagem_selecionada = 11
        }

        ft_edt_perfil_12.setOnClickListener {
            rlt_lyo_edt_perfil_ft_1.forEach {
                it.setBackgroundColor(Color.TRANSPARENT)
            }

            it.setBackgroundResource(R.drawable.ft_selected_edit_perfil)

            imagem_selecionada = 12
        }
    }




}
