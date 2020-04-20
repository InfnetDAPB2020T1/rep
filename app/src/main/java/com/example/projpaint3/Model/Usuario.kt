package com.example.projpaint3.Model

import java.io.Serializable

class Usuario(
    var id : Int,
    var nome : String,
    var senha : String,
    var email : String,
    var localidade : String? = null,
    var sobre : String? = null,
    var icone : Int? = null,
    var telefone : String? = null,
    var partidas_ganhas : Int? = null,
    var partidas_perdidas : Int? = null,
    var evento_criado : Boolean = false
) : Serializable