package com.example.projpaint3

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.projpaint3.Model.Usuario
import com.example.projpaint3.ViewModel.UsuarioViewModel
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

//        var usuario = intent.getSerializableExtra("usuario") as Usuario

        btn_nav_app.setupWithNavController(findNavController(R.id.nav_host_app))






    }




//    fun Mudar_btn_azul(item: MenuItem) {
//        btn_nav_app.setBackgroundResource(R.drawable.btn_shape2)
//    }
}
