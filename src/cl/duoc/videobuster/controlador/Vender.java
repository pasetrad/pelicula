/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.videobuster.controlador;

import cl.duoc.videobuster.modelo.Pelicula;
import cl.duoc.videobuster.modelo.ServicioBD;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author LEARNING CENTER
 */
public class Vender {
    public ResultSet obtenerPelis () throws SQLException{
       ServicioBD conexionPelis = new ServicioBD();
       ResultSet rs1 = conexionPelis.obtenerPelis();
       return rs1;
    }
    
    public ResultSet obtenerOtrosAtributos() throws SQLException {
        ServicioBD conexionPelis = new ServicioBD();
        ResultSet rs2= conexionPelis.obtenerOtrosAtributos();
        return ;
    }
    
}
