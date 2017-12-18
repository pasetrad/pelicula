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
public class Buscar {
    
    public boolean buscarPelicula(Integer codigo){
        
        Pelicula peli;
        peli = ServicioBD.metodo().buscarPelicula(codigo);
        if(peli.getCodigo() == null){
            System.out.println("registro no existe..");
            return false;
        }else{
            return true;
        }
    }
    
    
}
