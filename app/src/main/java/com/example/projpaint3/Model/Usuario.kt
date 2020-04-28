package com.example.projpaint3.Model

import android.provider.ContactsContract
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.projpaint3.Throws.UsuarioEmailException
import com.example.projpaint3.Throws.UsuarioNomeException
import com.example.projpaint3.Throws.UsuarioSenhaException
import java.io.Serializable
import java.util.regex.Pattern

//@Entity
class Usuario(

//    @PrimaryKey(autoGenerate = true)
    var id:  Int?= null,
    var nome : String,
    var senha : String,
    var email : String,
    var nivel : Int = 1,
    var localidade : String? = null,
    var sobre : String? = null,
    var icone : Int? = null,
    var telefone : String? = null,
    var partidas_ganhas : Int = 0,
    var partidas_perdidas : Int = 0,
    var meu_evento : Evento? = null,
    var participante_eventos : MutableList<Evento>? = null




) : Serializable {
    init {
        if (nome.length !in 4..18) throw UsuarioNomeException()
        if (senha.length !in 4..18) throw UsuarioSenhaException()
        if(!email.contains("@")) throw UsuarioEmailException()
    }

    fun partidas_totais () : Int{
        return partidas_ganhas + partidas_perdidas
    }
}

