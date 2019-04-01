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
public class Materia {
    
    private Integer id_materias;
    private String nombre_materia;
    private Integer intensidad;

    public Materia() {
    }

    public Materia(Integer id_materias, String nombre_materia, Integer intensidad) {
        this.id_materias = id_materias;
        this.nombre_materia = nombre_materia;
        this.intensidad = intensidad;
    }

    public Integer getId_materias() {
        return id_materias;
    }

    public void setId_materias(Integer id_materias) {
        this.id_materias = id_materias;
    }

    public String getNombre_materia() {
        return nombre_materia;
    }

    public void setNombre_materia(String nombre_materia) {
        this.nombre_materia = nombre_materia;
    }

    public Integer getIntensidad() {
        return intensidad;
    }

    public void setIntensidad(Integer intensidad) {
        this.intensidad = intensidad;
    }
    
    public static Materia load(ResultSet rs) throws SQLException{
        Materia materia = new Materia();
        
        materia.setId_materias(rs.getInt(1));
        materia.setNombre_materia(rs.getString(2));
        materia.setIntensidad(rs.getInt(3));
        
        return materia;
    }
    
}
