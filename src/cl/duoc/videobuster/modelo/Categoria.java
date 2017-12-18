/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.videobuster.modelo;

/**
 *
 * @author GarlefS
 */
public class Categoria {
    private Integer id;
    private String descripcion;

    public Categoria() {
    }

    public Categoria(Integer id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    
    
    public void setId(Integer id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    
    public Integer getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "Categoria:" + "Id: " + id + " Descripcion: " + descripcion;
    }
    
    
    
    
    
}
