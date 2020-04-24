package com.example.projpaint3.Model

import java.sql.Time
import java.util.*

class Evento(
    var id : Int,
    var nome : String,
    var local : Local,
    var time_A : MutableList<Usuario>,
    var time_B : MutableList<Usuario>,
    var host : Usuario,
    var data : Date,
    var horario_inicio : Time,
    var horario_termino : Time
)