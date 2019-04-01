/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adsi.modelo;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author JUANK
 */
public class Curso {
    
    private Integer id_cursos;
    private String nombre_curso;
    private String jornada;

    public Curso() {
    }

    public Curso(Integer id_cursos, String nombre_curso, String jornada) {
        this.id_cursos = id_cursos;
        this.nombre_curso = nombre_curso;
        this.jornada = jornada;
    }

    public Integer getId_cursos() {
        return id_cursos;
    }

    public void setId_cursos(Integer id_cursos) {
        this.id_cursos = id_cursos;
    }

    public String getNombre_curso() {
        return nombre_curso;
    }

    public void setNombre_curso(String nombre_curso) {
        this.nombre_curso = nombre_curso;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }
    
    public static Curso load(ResultSet rs) throws SQLException{
        Curso curso = new Curso();
        
        curso.setId_cursos(rs.getInt(1));
        curso.setNombre_curso(rs.getString(2));
        curso.setJornada(rs.getString(3));
        
        return curso;
    }
}
