package com.example.projpaint3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_criar_evento.*

class CriarEventoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_criar_evento)

        btn_criar_evento_to_home.setOnClickListener {
            startActivity(Intent(this,Main2Activity::class.java))
        }
    }
}
