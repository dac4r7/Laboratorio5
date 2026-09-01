/*
 
Clase DetallePedido
tiene asociacion con Producto
composicion con Pedido

 */
package com.lab1.laboratorio5;

import com.lab1.laboratorio5.productos.Producto;

/**
 *
 * @author Diego Adrian Cesarin
 */
public class DetallePedido {
    private int cantidad;
    private double subtotal;

    public DetallePedido(int cantidad, double subtotal,Producto producto) {
        this.cantidad = cantidad;
        this.subtotal = calcularSubtotal( producto);
    }
    
    public double calcularSubtotal( Producto producto){
        
        return producto.getPrecio()*cantidad;
    }
}
