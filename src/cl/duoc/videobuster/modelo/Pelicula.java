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
public class Pelicula {
    private Integer codigo,precio;
    private String formato4k,nombre,descripcion;

    public Pelicula() {
    }

    public Pelicula(Integer codigo, Integer precio, String descripcion, String formato4k, String nombre) {
        this.codigo = codigo;
        this.precio = precio;
        this.descripcion = descripcion;
        this.formato4k = formato4k;
        this.nombre = nombre;
    }

    
    
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFormato4k(String formato4k) {
        this.formato4k = formato4k;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    

    public Integer getCodigo() {
        return codigo;
    }

    public Integer getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFormato4k() {
        return formato4k;
    }

    public String getNombre() {
        return nombre;
    }

    
    
    @Override
    public String toString() {
        return "Pelicula " + "Codigo: " + codigo + " Precio: " + precio + 
                "Categoria:" + descripcion + " Formato 4k: " + formato4k + 
                " Nombre: " + nombre;
    }
    
    
    
}
