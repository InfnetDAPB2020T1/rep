package com.example.projpaint3.FragmentsApp.Local

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.projpaint3.R

/**
 * A simple [Fragment] subclass.
 */
class Local_IndexFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_local__index, container, false)
    }

}
