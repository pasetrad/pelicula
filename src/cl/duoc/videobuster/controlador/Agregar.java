/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.videobuster.controlador;

import cl.duoc.videobuster.modelo.Pelicula;
import cl.duoc.videobuster.modelo.ServicioBD;

/**
 *
 * @author GarlefS
 */
public class Agregar {
    
    
public boolean agregarPelicula(Integer codigo,Integer precio,String descripcion, 
                           String formato4k,String nombre,Integer id_categoria){
        
    Buscar aux =new Buscar();
    if(codigo>9999 && codigo<100000 && nombre.length()>2 && precio>1000){
        if(!aux.buscarPelicula(codigo)){//!
        Pelicula peli =new Pelicula(codigo,precio,descripcion,formato4k,nombre);
        ServicioBD.metodo().agregarPelicula(peli,id_categoria);
      return true;
    }}

    System.out.println("no se agregó..");
    return false;
}
    
}
