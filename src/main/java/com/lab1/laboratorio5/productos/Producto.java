/*

Clase producto
Relaciones:
asociacion con Proveedor y DetallePedido
herencia hacia Vino , Cerveza y Whisky      
 */
package com.lab1.laboratorio5.productos;

/**
 *
 * @author Diego Adrian Cesarin
 */
public class Producto {
    
    private int idProducto;
    private String nombre = null;
    private double precio;
    private double ValorCosto;
    private int stock;
    private double graduacionAlcoholica;
    
    public Producto(){
        
    }

    public Producto(int idProducto, String nombre, double precio, double ValorCosto, int stock, double graduacionAlcoholica) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.ValorCosto = ValorCosto;
        this.stock = stock;
        this.graduacionAlcoholica = graduacionAlcoholica;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getValorCosto() {
        return ValorCosto;
    }

    public void setValorCosto(double ValorCosto) {
        this.ValorCosto = ValorCosto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getGraduacionAlcoholica() {
        return graduacionAlcoholica;
    }

    public void setGraduacionAlcoholica(double graduacionAlcoholica) {
        this.graduacionAlcoholica = graduacionAlcoholica;
    }
    
    
    
}
