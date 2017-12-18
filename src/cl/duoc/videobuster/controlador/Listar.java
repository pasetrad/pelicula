/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.videobuster.controlador;

import cl.duoc.videobuster.modelo.Pelicula;
import cl.duoc.videobuster.modelo.ServicioBD;
import java.util.ArrayList;

/**
 *
 * @author GarlefS
 */
public class Listar {

    ServicioBD aux;
    public Listar() {
    }
    
    public  ArrayList<Pelicula> listarPorCategoria(Integer id_){
        
        return ServicioBD.metodo().listarPorCategoria(id_);
    }
    
    public  ArrayList<Pelicula> listarPeliculas(){
        
        return ServicioBD.metodo().listarPeliculas();
    }
    
    public  Pelicula listarPelicula(Integer id_){
        
        return ServicioBD.metodo().buscarPelicula(id_);
    }

}
