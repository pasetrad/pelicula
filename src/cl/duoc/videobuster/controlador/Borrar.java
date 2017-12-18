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
public class Borrar {
    
    public boolean borrarPelicula(Integer codigo){
        
    Buscar aux =new Buscar();
    if(aux.buscarPelicula(codigo)){
      
      ServicioBD.metodo().borrarPelicula(codigo);
      return true;
    }
    System.out.println("código no existe..");
        
    return false;
    }
}
