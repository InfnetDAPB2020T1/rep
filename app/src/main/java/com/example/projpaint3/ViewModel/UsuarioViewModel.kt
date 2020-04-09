package com.example.projpaint3.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.projpaint3.Model.Local
import com.example.projpaint3.Model.Usuario
import java.io.Serializable

class UsuarioViewModel : ViewModel(), Serializable{
    var usuario : Usuario? = null
}



