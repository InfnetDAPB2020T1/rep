package com.example.projpaint3.Model

import android.provider.ContactsContract
import com.example.projpaint3.Throws.UsuarioEmailException
import com.example.projpaint3.Throws.UsuarioNomeException
import com.example.projpaint3.Throws.UsuarioSenhaException
import java.io.Serializable
import java.util.regex.Pattern

class Usuario(

    var id : Int,
    var nome : String,
    var senha : String,
    var email : String,
    var nivel : Int = 1,
    var localidade : String? = null,
    var sobre : String? = null,
    var icone : Int? = null,
    var telefone : String? = null,
    var partidas_ganhas : Int? = null,
    var partidas_perdidas : Int? = null,
    var meu_evento : Evento? = null,
    var participante_eventos : MutableList<Evento>? = null

) : Serializable {
    init {
        if (nome.length !in 4..18) throw UsuarioNomeException()
        if (senha.length !in 4..18) throw UsuarioSenhaException()
        if(!email.contains("@")) throw UsuarioEmailException()
    }
}