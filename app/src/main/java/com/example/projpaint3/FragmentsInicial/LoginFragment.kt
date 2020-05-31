package com.example.projpaint3.FragmentsInicial

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.annotation.MainThread
import androidx.core.view.isInvisible
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.example.projpaint3.Main2Activity
import com.example.projpaint3.Model.Usuario

import com.example.projpaint3.R
import com.example.projpaint3.ViewModel.UsuarioViewModel
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.fragment_login.*
import java.lang.Exception

/**
 * A simple [Fragment] subclass.
 */
class LoginFragment : Fragment() {

    private lateinit var usuarioViewModel: UsuarioViewModel

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



        activity?.let{
            usuarioViewModel = ViewModelProviders.of(it).get(UsuarioViewModel::class.java)
        }

        try{
            edt_usuario_login.setText(usuarioViewModel.usuario!!.email.toString())
            edt_senha_login.setText(usuarioViewModel.usuario!!.senha.toString())
        }
        catch(e : Exception){
        }



        txt_cadastrar_login.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_cadastroFragment)
        }
            btn_acessar.setOnClickListener {

                if(!edt_usuario_login.text.isNullOrEmpty() && !edt_senha_login.text.isNullOrEmpty()){
                    var firebaseAuth = FirebaseAuth.getInstance()
                    firebaseAuth.signInWithEmailAndPassword(edt_usuario_login.text.toString(),edt_senha_login.text.toString())
                        .addOnSuccessListener {

                            Usuario_Valido_Login()

                        }
                        .addOnFailureListener{

                            Usuario_Invalido_Login()
                        }
                }
                else{
                    Usuario_Invalido_Login()
                }

        }

        //btn_acessar.setOnClickListener {

//            try {
          //      var nome = usuarioViewModel.usuario!!.email.toString()
          //      var senha = usuarioViewModel.usuario!!.senha.toString()

                //if(edt_usuario_login.text.toString() == nome && edt_senha_login.text.toString() == senha){
//                var firebaseAuth = FirebaseAuth.getInstance()
//                firebaseAuth.signInWithEmailAndPassword(edt_usuario_login.text.toString(),edt_senha_login.text.toString())
//                    .addOnSuccessListener {

//                        startActivity(Intent(context,Main2Activity::class.java))
                       // Usuario_Valido_Login()

//                }
//                    .addOnFailureListener{
//                        Toast.makeText(context,it.message,Toast.LENGTH_SHORT).show()
//                  //  Usuario_Invalido_Login()
//                }
//            }
//            catch(e : Exception) {
//                Usuario_Invalido_Login()
//            }

        //}
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

        object : CountDownTimer(2000,250){
            override fun onFinish() {
                activity?.let{
                    var intent = Intent(it, Main2Activity::class.java)

//                    var usuario = Usuario(
//
//                        usuarioViewModel.usuario!!.nome.toString(),
//                        usuarioViewModel.usuario!!.senha.toString(),
//                        usuarioViewModel.usuario!!.email.toString())
//
//                    intent.putExtra("usuario", usuario.toString())
                    startActivity(intent)

                }
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
