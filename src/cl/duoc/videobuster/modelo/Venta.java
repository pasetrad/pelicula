/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.videobuster.modelo;

/**
 *
 * @author LEARNING CENTER
 */
public class Venta extends Transaccion {
    private Integer numeroProductos;

    
    
    public Venta(Integer numeroProductos) {
        this.numeroProductos = numeroProductos;
    }

    public Integer getNumeroProductos() {
        return numeroProductos;
    }

    public void setNumeroProductos(Integer numeroProductos) {
        this.numeroProductos = numeroProductos;
    }
    
    
    
    
}
