package com.example.projpaint3.Model

class Usuario(
    var id : Int,
    var nome : String,
    var senha : String,
    var email : String,
    var icone : Int?,
    var telefone : String?,
    var partidas_ganhas : Int?,
    var partidas_perdidas : Int?,
    var evento_criado : Boolean = false
)