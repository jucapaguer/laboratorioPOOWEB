/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adsi.control;

import com.adsi.modelo.Aprendiz;
import com.adsi.modelo.Curso;
import com.adsi.modelo.Materia;
import com.adsi.modelo.MateriaCurso;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Controlador extends Conexion {

    //Comienzo CRUD basico de las tablas Aprendiz,Curso,Materia y MateriaCurso
    public LinkedList findAllAprendices() throws SQLException {
        if (!hayConexion()) {
            throw new SQLException(" No existe conexion abierta ");
        }

        PreparedStatement pst = null;
        ResultSet rst = null;
        LinkedList lista = new LinkedList();
        try {
            String query;
            query = "select * from aprendices ";    //Definir la consulta
            pst = con.prepareStatement(query);                      //Prepararla

            rst = pst.executeQuery();                               //Ejecutarla 

            while (rst.next()) {
                lista.add(Aprendiz.load(rst));     //Recorre el RS y llena una lista
            }
            System.out.println("El Query " + query);

        } finally {
            if (pst != null) {
                pst.close();
                pst = null;
            }
            if (rst != null) {
                rst.close();
                rst = null;
            }
        }
        return lista;                            //Retorna la lista llena
    }

    public LinkedList findAllMateria() throws SQLException {
        if (!hayConexion()) {
            throw new SQLException(" No existe conexion abierta ");
        }

        PreparedStatement pst = null;
        ResultSet rst = null;
        LinkedList lista = new LinkedList();
        try {
            String query;
            query = "select * from materias ";    //Definir la consulta
            pst = con.prepareStatement(query);                      //Prepararla
            //pst.setInt(1, p_curso);
            rst = pst.executeQuery();                               //Ejecutarla 

            while (rst.next()) {
                lista.add(Materia.load(rst));     //Recorre el RS y llena una lista
            }
            System.out.println("El Query " + query);

        } finally {
            if (pst != null) {
                pst.close();
                pst = null;
            }
            if (rst != null) {
                rst.close();
                rst = null;
            }
        }
        return lista;                            //Retorna la lista llena
    }

    public LinkedList findAllCursos() throws SQLException {
        if (!hayConexion()) {
            throw new SQLException(" No existe conexion abierta ");
        }

        PreparedStatement pst = null;
        ResultSet rst = null;
        LinkedList lista = new LinkedList();
        try {
            String query;
            query = "select * from cursos ";    //Definir la consulta
            pst = con.prepareStatement(query);                      //Prepararla
            //pst.setInt(1, p_curso);
            rst = pst.executeQuery();                               //Ejecutarla 

            while (rst.next()) {
                lista.add(Curso.load(rst));     //Recorre el RS y llena una lista
            }
            System.out.println("El Query " + query);

        } finally {
            if (pst != null) {
                pst.close();
                pst = null;
            }
            if (rst != null) {
                rst.close();
                rst = null;
            }
        }
        return lista;                            //Retorna la lista llena
    }

    public LinkedList findAllMateriasCursos() throws SQLException {
        if (!hayConexion()) {
            throw new SQLException(" No existe conexion abierta ");
        }

        PreparedStatement pst = null;
        ResultSet rst = null;
        LinkedList lista = new LinkedList();
        try {
            String query;
            query = "select * from materias_curso ";    //Definir la consulta
            pst = con.prepareStatement(query);                      //Prepararla
            //pst.setInt(1, p_curso);
            rst = pst.executeQuery();                               //Ejecutarla 

            while (rst.next()) {
                lista.add(MateriaCurso.load(rst));     //Recorre el RS y llena una lista
            }
            System.out.println("El Query " + query);

        } finally {
            if (pst != null) {
                pst.close();
                pst = null;
            }
            if (rst != null) {
                rst.close();
                rst = null;
            }
        }
        return lista;                            //Retorna la lista llena
    }

    public void adicionarAprendiz(Aprendiz aprendiz) throws SQLException {
        if (!hayConexion()) {
            throw new SQLException(" No existe conexion abierta ");
        }

        PreparedStatement pst = null;
        ResultSet rst = null;

        try {
            pst = con.prepareStatement("INSERT INTO `aprendices` "
                    + "(`documento`, `nombres`, `apellidos`, `edad`, `sexo`, `fk_curso`) "
                    + " VALUES (?, ?, ?, ?, ?, ?);  ");    //Definir la consulta
            pst.setString(1, aprendiz.getDocumento());
            pst.setString(2, aprendiz.getNombres());
            pst.setString(3, aprendiz.getApellidos());
            pst.setString(4, aprendiz.getEdad());
            pst.setString(5, aprendiz.getSexo());
            pst.setInt(6, aprendiz.getFk_curso());
            pst.execute();                              //Ejecutarla 

        } catch (Exception Ex) {
            System.out.println("Error en Adicionar Dato : \n" + Ex);
        } finally {
            if (pst != null) {
                pst.close();
            }
            if (rst != null) {
                rst.close();
            }
        }
    }

    public void adicionarCurso(Curso curso) throws SQLException {
        if (!hayConexion()) {
            throw new SQLException(" No existe conexion abierta ");
        }

        PreparedStatement pst = null;
        ResultSet rst = null;

        try {
            pst = con.prepareStatement("INSERT INTO `cursos` "
                    + "(`nombre_curso`, `jornada`) "
                    + " VALUES (?, ?);  ");    //Definir la consulta
            pst.setString(1, curso.getNombre_curso());
            pst.setString(2, curso.getJornada());

            pst.execute();                              //Ejecutarla 

        } catch (Exception Ex) {
            System.out.println("Error en Adicionar Dato : \n" + Ex);
        } finally {
            if (pst != null) {
                pst.close();
            }
            if (rst != null) {
                rst.close();
            }
        }
    }

    public void adicionarMateria(Materia materia) throws SQLException {
        if (!hayConexion()) {
            throw new SQLException(" No existe conexion abierta ");
        }

        PreparedStatement pst = null;
        ResultSet rst = null;

        try {
            pst = con.prepareStatement("INSERT INTO `materias` "
                    + "(`nombre_materia`, `intensidad`) "
                    + " VALUES (?, ?);  ");    //Definir la consulta
            pst.setString(1, materia.getNombre_materia());
            pst.setInt(2, materia.getIntensidad());

            pst.execute();                              //Ejecutarla 

        } catch (Exception Ex) {
            System.out.println("Error en Adicionar Dato : \n" + Ex);
        } finally {
            if (pst != null) {
                pst.close();
            }
            if (rst != null) {
                rst.close();
            }
        }
    }
    
    public void adicionarMateriaCurso(MateriaCurso materiaCurso) throws SQLException {
        if (!hayConexion()) {
            throw new SQLException(" No existe conexion abierta ");
        }

        PreparedStatement pst = null;
        ResultSet rst = null;

        try {
            pst = con.prepareStatement("INSERT INTO `materias_curso` "
                    + "(`fk_curso`, `fk_materia`) "
                    + "VALUES (?, ?)" );    //Definir la consulta
            pst.setInt(1, materiaCurso.getFk_curso());
            pst.setInt(2, materiaCurso.getFk_materia());

            pst.execute();                              //Ejecutarla 

        } catch (Exception Ex) {
            System.out.println("Error en Adicionar Dato : \n" + Ex);
        } finally {
            if (pst != null) {
                pst.close();
            }
            if (rst != null) {
                rst.close();
            }
        }
    }

    public void eliminarAprendiz(Aprendiz aprendiz) throws SQLException {
        if (!hayConexion()) {
            throw new SQLException(" No existe conexion abierta ");
        }

        PreparedStatement pst = null;
        
        try {
            pst = con.prepareStatement("DELETE FROM `aprendices` "
                    + "WHERE (`id_aprendices` = ?);");    //Definir la consulta
            pst.setInt(1, aprendiz.getId_aprendices());

            pst.execute();                              //Ejecutarla 

        } catch (Exception Ex) {
            System.out.println("Error en Borrar Dato : \n" + Ex);
        } finally {
            if (pst != null) {
                pst.close();
            }
            
        }
    }

    public void eliminarCurso(Curso curso) throws SQLException {
        if (!hayConexion()) {
            throw new SQLException(" No existe conexion abierta ");
        }

        PreparedStatement pst = null;
        ResultSet rst = null;

        try {
            pst = con.prepareStatement("DELETE FROM `cursos` "
                    + "WHERE (`id_cursos` = ?);");    //Definir la consulta
            pst.setInt(1, curso.getId_cursos());

            pst.execute();                              //Ejecutarla 

        } catch (Exception Ex) {
            System.out.println("Error en Borrar Dato : \n" + Ex);
        } finally {
            if (pst != null) {
                pst.close();
            }
            if (rst != null) {
                rst.close();
            }
        }
    }

    public void eliminarMateria(Materia materia) throws SQLException {
        if (!hayConexion()) {
            throw new SQLException(" No existe conexion abierta ");
        }

        PreparedStatement pst = null;
        ResultSet rst = null;

        try {
            pst = con.prepareStatement("DELETE FROM `materias` "
                    + "WHERE (`id_materias` = ?);");    //Definir la consulta
            pst.setInt(1, materia.getId_materias());

            pst.execute();                              //Ejecutarla 

        } catch (Exception Ex) {
            System.out.println("Error en Borrar Dato : \n" + Ex);
        } finally {
            if (pst != null) {
                pst.close();
            }
            if (rst != null) {
                rst.close();
            }
        }
    }
    
    public void eliminarMateriaCurso(MateriaCurso materiaCurso) throws SQLException {
        if (!hayConexion()) {
            throw new SQLException(" No existe conexion abierta ");
        }

        PreparedStatement pst = null;
        ResultSet rst = null;

        try {
            pst = con.prepareStatement("DELETE FROM `materias_curso` "
                    + "WHERE (`id_materias_curso` = ?);");    //Definir la consulta
            pst.setInt(1, materiaCurso.getId_materias_curso());

            pst.execute();                              //Ejecutarla 

        } catch (Exception Ex) {
            System.out.println("Error en Borrar Dato : \n" + Ex);
        } finally {
            if (pst != null) {
                pst.close();
            }
            if (rst != null) {
                rst.close();
            }
        }
    }

    public void editarAprendiz(Aprendiz aprendiz) throws SQLException {
        if (!hayConexion()) {
            throw new SQLException(" No existe conexion abierta ");
        }

        PreparedStatement pst = null;

        try {
            String query;
            query = "UPDATE `aprendices` SET `documento`=?,`nombres`= ?,`apellidos`=?, `edad`=? , `sexo`= ?, `fk_curso`= ? WHERE (`id_aprendices` = ?)";    //Definir la consulta
            pst = con.prepareStatement(query);                      //Prepararla
            pst.setInt(7, aprendiz.getId_aprendices());
            pst.setString(1, aprendiz.getDocumento());
            pst.setString(2, aprendiz.getNombres());
            pst.setString(3, aprendiz.getApellidos());
            pst.setString(4, aprendiz.getEdad());
            pst.setString(5, aprendiz.getSexo());
            pst.setInt(6, aprendiz.getFk_curso());

            pst.execute();                               //Ejecutarla 

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            if (pst != null) {
                pst.close();
                pst = null;
            }
        }
    }

    public void editarCurso(Curso curso) throws SQLException {
        if (!hayConexion()) {
            throw new SQLException(" No existe conexion abierta ");
        }

        PreparedStatement pst = null;
              
        try {
            String query;
            query = "UPDATE `cursos` SET `nombre_curso` = ?, `jornada` = ? WHERE (`id_cursos` = ?)";    //Definir la consulta
            pst = con.prepareStatement(query);                      //Prepararla
            pst.setInt(3, curso.getId_cursos());
            pst.setString(1, curso.getNombre_curso());
            pst.setString(2, curso.getJornada());

            pst.execute();                               //Ejecutarla 

            System.out.println("El Query " + query);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }finally {
            if (pst != null) {
                pst.close();
                pst = null;
            }
          
        }
    }

    public void editarMateria(Materia materia) throws SQLException {
        if (!hayConexion()) {
            throw new SQLException(" No existe conexion abierta ");
        }

        PreparedStatement pst = null;
        
        try {
            String query;
            query = "UPDATE `materias` SET `nombre_materia`= ? , `intensidad`=? WHERE (`id_materias`=?) ";    //Definir la consulta
            pst = con.prepareStatement(query);                      //Prepararla
            pst.setInt(3, materia.getId_materias());
            pst.setString(1, materia.getNombre_materia());
            pst.setInt(2, materia.getIntensidad());

            pst.execute();                               //Ejecutarla 

            
            System.out.println("El Query " + query);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }finally {
            if (pst != null) {
                pst.close();
                pst = null;
            }
            
        }
    }
    
    public void editarMateriaCurso(MateriaCurso materiaCurso) throws SQLException {
        if (!hayConexion()) {
            throw new SQLException(" No existe conexion abierta ");
        }

        PreparedStatement pst = null;
        
        try {
            String query;
            query = "UPDATE `materias_curso` SET `fk_curso`=? , `fk_materia`=? WHERE (`id_materias_curso`=?)";    //Definir la consulta
            pst = con.prepareStatement(query);                      //Prepararla
            pst.setInt(3, materiaCurso.getId_materias_curso());
            pst.setInt(1, materiaCurso.getFk_curso());
            pst.setInt(2, materiaCurso.getFk_materia());

            pst.executeQuery();                               //Ejecutarla 

            System.out.println("El Query " + query);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }finally {
            if (pst != null) {
                pst.close();
                pst = null;
            }
           
        }
    }
    //Fin CRUD basico

    //Metodos de ayuda
    public LinkedList findAprendicesCurso(int p_curso) throws SQLException {
        if (!hayConexion()) {
            throw new SQLException(" No existe conexion abierta ");
        }

        PreparedStatement pst = null;
        ResultSet rst = null;
        LinkedList lista = new LinkedList();
        try {
            String query;
            query = "select * from aprendices where fk_curso = ?  ";    //Definir la consulta
            pst = con.prepareStatement(query);                      //Prepararla
            pst.setInt(1, p_curso);

            rst = pst.executeQuery();                               //Ejecutarla 

            while (rst.next()) {
                lista.add(Aprendiz.load(rst));     //Recorre el RS y llena una lista
            }
            System.out.println("El Query " + query);

        } finally {
            if (pst != null) {
                pst.close();
                pst = null;
            }
            if (rst != null) {
                rst.close();
                rst = null;
            }
        }
        return lista;                            //Retorna la lista llena
    }

    public LinkedList findCursoByIdCurso(int p_curso) throws SQLException {
        if (!hayConexion()) {
            throw new SQLException(" No existe conexion abierta ");
        }

        PreparedStatement pst = null;
        ResultSet rst = null;
        LinkedList lista = new LinkedList();
        try {
            String query;
            query = "select * from cursos where id_cursos = ? ";    //Definir la consulta
            pst = con.prepareStatement(query);                      //Prepararla
            pst.setInt(1, p_curso);

            rst = pst.executeQuery();                               //Ejecutarla 

            while (rst.next()) {
                lista.add(Curso.load(rst));     //Recorre el RS y llena una lista
            }
            System.out.println("El Query " + query);

        } finally {
            if (pst != null) {
                pst.close();
                pst = null;
            }
            if (rst != null) {
                rst.close();
                rst = null;
            }
        }
        return lista;                            //Retorna la lista llena
    }

    public LinkedList grupoCursoByIdCurso(int p_curso) throws SQLException {
        if (!hayConexion()) {
            throw new SQLException(" No existe conexion abierta ");
        }

        PreparedStatement pst = null;
        ResultSet rst = null;
        LinkedList lista = new LinkedList();
        try {
            String query;
            query = "SELECT fk_curso FROM materias_curso group by ? ";    //Definir la consulta
            pst = con.prepareStatement(query);                      //Prepararla
            pst.setInt(1, p_curso);

            rst = pst.executeQuery();                               //Ejecutarla 

            while (rst.next()) {
                lista.add(MateriaCurso.load(rst));     //Recorre el RS y llena una lista
            }
            System.out.println("El Query " + query);

        } finally {
            if (pst != null) {
                pst.close();
                pst = null;
            }
            if (rst != null) {
                rst.close();
                rst = null;
            }
        }
        return lista;                            //Retorna la lista llena
    }

    public LinkedList findMateriaByIdMateria(int p_materia) throws SQLException {
        if (!hayConexion()) {
            throw new SQLException(" No existe conexion abierta ");
        }

        PreparedStatement pst = null;
        ResultSet rst = null;
        LinkedList lista = new LinkedList();
        try {
            String query;
            query = "select * from materias where id_materias = ? ";    //Definir la consulta
            pst = con.prepareStatement(query);                      //Prepararla
            pst.setInt(1, p_materia);

            rst = pst.executeQuery();                               //Ejecutarla 

            while (rst.next()) {
                lista.add(Materia.load(rst));     //Recorre el RS y llena una lista
            }
            System.out.println("El Query " + query);

        } finally {
            if (pst != null) {
                pst.close();
                pst = null;
            }
            if (rst != null) {
                rst.close();
                rst = null;
            }
        }
        return lista;                            //Retorna la lista llena
    }

    public LinkedList findAprendicesCursoEdad(int p_curso, int edad) throws SQLException {
        if (!hayConexion()) {
            throw new SQLException(" No existe conexion abierta ");
        }

        PreparedStatement pst = null;
        ResultSet rst = null;
        LinkedList lista = new LinkedList();
        try {
            String query;
            query = "Select * from aprendices a where a.fk_curso = ? and edad> ? ";    //Definir la consulta
            pst = con.prepareStatement(query);                      //Prepararla
            pst.setInt(1, p_curso);
            pst.setInt(2, edad);

            rst = pst.executeQuery();                               //Ejecutarla 

            while (rst.next()) {
                lista.add(Aprendiz.load(rst));     //Recorre el RS y llena una lista
            }
            System.out.println("El Query " + query);

        } finally {
            if (pst != null) {
                pst.close();
                pst = null;
            }
            if (rst != null) {
                rst.close();
                rst = null;
            }
        }
        return lista;                            //Retorna la lista llena
    }
    
    //Metodos de Conteos
    public int contarAprendicesByEdadCurso(Aprendiz aprendiz)throws SQLException {
        if (!hayConexion()) {
            throw new SQLException(" No existe conexion abierta ");
        }

        PreparedStatement pst = null;
        try {
            String query;
            query = "SELECT edad,count(*) `aprendices` where `edad`=? and `fk_curso`=?";    //Definir la consulta
            pst = con.prepareStatement(query);                      //Prepararla
            pst.setString(1, aprendiz.getEdad());
            pst.setInt(2, aprendiz.getFk_curso());

            pst.execute();                               //Ejecutarla 

            System.out.println("El Query " + query);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }finally {
            if (pst != null) {
                pst.close();
                pst = null;
            }
          
        }
        return Aprendiz;
    }

}
