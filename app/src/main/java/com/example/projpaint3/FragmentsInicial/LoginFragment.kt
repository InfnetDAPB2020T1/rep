package com.example.projpaint3.FragmentsInicial

import android.content.Intent
import android.opengl.Visibility
import android.os.Bundle
import android.os.CountDownTimer
import android.text.method.TextKeyListener.clear
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.core.view.isInvisible
import androidx.navigation.fragment.findNavController
import com.airbnb.lottie.LottieComposition
import com.airbnb.lottie.LottieCompositionFactory
import com.example.projpaint3.Main2Activity

import com.example.projpaint3.R
import kotlinx.android.synthetic.main.fragment_login.*
import kotlin.concurrent.timer

/**
 * A simple [Fragment] subclass.
 */
class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        anim_usuarioInvalido_login.isInvisible = true




        txt_cadastrar_login.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_cadastroFragment)
        }

        btn_acessar.setOnClickListener {

            if(edt_usuario_login.text.toString() == "elias" && edt_senha_login.text.toString() == "qwert"){
                Usuario_Valido_Login()
            }
            else{
                Usuario_Invalido_Login()
            }

        }
    }

    fun Usuario_Valido_Login(){

        txt_usuario_invalido_login.isInvisible = true
        anim_usuarioInvalido_login.isInvisible = true

        anim_edt_usuario_login.playAnimation()

        object : CountDownTimer(500,250){
            override fun onFinish() {
                anim_edt_senha_login.playAnimation()
            }
            override fun onTick(millisUntilFinished: Long) {
            }

        }.start()
    }

    fun Usuario_Invalido_Login(){

        val anim1 = AnimationUtils.loadAnimation(this.context,R.anim.anim_alpha_txt)
        txt_usuario_invalido_login.isInvisible = false
        anim_usuarioInvalido_login.isInvisible = false
        txt_usuario_invalido_login.startAnimation(anim1)
        anim_usuarioInvalido_login.playAnimation()

    }
}
