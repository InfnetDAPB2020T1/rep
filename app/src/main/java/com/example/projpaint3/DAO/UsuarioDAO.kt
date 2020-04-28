//package com.example.projpaint3.DAO
//
//import androidx.room.*
//import com.example.projpaint3.Model.Usuario
//
//@Dao
//interface UsuarioDAO {
//    @Insert
//    fun store(usuario: Usuario)
//    @Update
//    fun update(usuario: Usuario)
//    @Delete
//    fun delete(usuario: Usuario)
//
//    @Query("SELECT * FROM Usuario")
//    fun all(): Array<Usuario>
//    @Query("SELECT * FROM Usuario WHERE id = :indicador")
//    fun show(indicador: Int): Array<Usuario>
//}