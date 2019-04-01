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
public class MateriaCurso {
    
    private Integer id_materias_curso;
    private Integer fk_curso;
    private Integer fk_materia;

    public MateriaCurso() {
    }

    public MateriaCurso(Integer id_materias_curso, Integer fk_curso, Integer fk_materia) {
        this.id_materias_curso = id_materias_curso;
        this.fk_curso = fk_curso;
        this.fk_materia = fk_materia;
    }

    public Integer getId_materias_curso() {
        return id_materias_curso;
    }

    public void setId_materias_curso(Integer id_materias_curso) {
        this.id_materias_curso = id_materias_curso;
    }

    public Integer getFk_curso() {
        return fk_curso;
    }

    public void setFk_curso(Integer fk_curso) {
        this.fk_curso = fk_curso;
    }

    public Integer getFk_materia() {
        return fk_materia;
    }

    public void setFk_materia(Integer fk_materia) {
        this.fk_materia = fk_materia;
    }
    
    public static MateriaCurso load(ResultSet rs) throws SQLException{
        MateriaCurso materiaCurso = new MateriaCurso();
        
        materiaCurso.setId_materias_curso(rs.getInt(1));
        materiaCurso.setFk_curso(rs.getInt(2));
        materiaCurso.setFk_materia(rs.getInt(3));
                
        return materiaCurso;
    }
    
}
