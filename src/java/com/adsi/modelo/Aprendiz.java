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
public class Aprendiz {
    
    private Integer id_aprendices;
    private String documento;
    private String nombres;
    private String apellidos;
    private String edad;
    private String sexo;
    private Integer fk_curso;

    public Aprendiz() {
    }

    public Aprendiz(Integer id_aprendices, String documento, String nombres, String apellidos, String edad, String sexo, Integer fk_curso) {
        this.id_aprendices = id_aprendices;
        this.documento = documento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sexo = sexo;
        this.fk_curso = fk_curso;
    }

    public Integer getId_aprendices() {
        return id_aprendices;
    }

    public void setId_aprendices(Integer id_aprendices) {
        this.id_aprendices = id_aprendices;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getFk_curso() {
        return fk_curso;
    }

    public void setFk_curso(Integer fk_curso) {
        this.fk_curso = fk_curso;
    }

    public static Aprendiz load(ResultSet rs) throws SQLException{
       Aprendiz aprendiz = new Aprendiz();
       
       aprendiz.setId_aprendices(rs.getInt(1));
       aprendiz.setDocumento(rs.getString(2));
       aprendiz.setNombres(rs.getString(3));
       aprendiz.setApellidos(rs.getString(4));
       aprendiz.setEdad(rs.getString(5));
       aprendiz.setSexo(rs.getString(6));
       aprendiz.setFk_curso(rs.getInt(7));
       
       return aprendiz;
    }
}
