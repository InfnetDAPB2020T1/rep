package com.example.projpaint3.FragmentsApp.Evento

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.projpaint3.R

/**
 * A simple [Fragment] subclass.
 */
class Evento_DeleteFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_evento__delete, container, false)
    }

}
