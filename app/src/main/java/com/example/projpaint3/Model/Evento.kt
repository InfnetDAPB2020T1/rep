package com.example.projpaint3.Model

import java.io.Serializable
import java.sql.Time
import java.util.*

class Evento(
    var id : Int,
    var nome : String,
    var local : String,
    var time_A : MutableList<Usuario>,
    var time_B : MutableList<Usuario>,
    var descricao : String,
    var host : Usuario,
    var data : String,
    var horario_inicio : String
) : Serializable{
    fun participantesTotais() : Int{
        return time_A.size + time_B.size
    }

//    fun eventoConcluido() : Boolean{
//        return
//    }
}

