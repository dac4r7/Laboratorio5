/*
 
Clase DetallePedido
tiene asociacion con Producto
composicion con Pedido

 */
package com.lab1.laboratorio5;

import com.lab1.laboratorio5.productos.Producto;

/**
 *
 * @author diego
 */
public class DetallePedido {
    private int cantidad;
    private double subtotal;

    public DetallePedido(int cantidad, double subtotal) {
        this.cantidad = cantidad;
        this.subtotal = subtotal;
    }
    
    public double calcularSubtotal( Producto producto){
        
        return producto.getPrecio()*cantidad;
    }
}
