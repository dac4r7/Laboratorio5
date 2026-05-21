/*
  */
package com.lab1.laboratorio5;

import com.lab1.laboratorio5.Pago.Pago;
import java.util.Date;

/**
 *
 * @author Alumno
 */
public class Pedido {
    private int idPedido;
    private Date fecha;
    private double total;
    private EstadoPedido estado;

    public Pedido(int idPedido, Date fecha, double total, EstadoPedido estado) {
        this.idPedido = idPedido;
        this.fecha = fecha;
        this.total = total;
        this.estado = estado;
    }

    public Pedido() {
        System.out.println("Pedido realizado ");
      }
    
        
    public void agregarDetalle(DetallePedido detalle){
        //Producto(int idProducto, String nombre, double precio, 
        //          double ValorCosto, int stock, double graduacionAlcoholica)
        // detalle.calcularSubtotal( new Producto  
    }
    
    public double calcularTotal(){
        return total;
    }
    
    public void confirmarPedido(){
        
    }
    
    public Pago generarPago(){
        
        //Aqui se crea el pago para el cliente
        // Date fechaactual = new Date();
        //Pago nuevoPago = new Pago(idPago, calcularTotal(), fechaactual)
        //return nuevoPago;
        return new Pago();
    }
    
    public void cambiarEstado(){
        
    }
}
