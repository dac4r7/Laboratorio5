/*
  */
package com.lab1.laboratorio5;

import com.lab1.laboratorio5.Pago.MercadoPago;
import com.lab1.laboratorio5.Pago.Pago;
import com.lab1.laboratorio5.Pago.TarjetaCredito;
import com.lab1.laboratorio5.productos.Producto;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Diego Adrian Cesarin
 */
public class Pedido {
    
    private int idPedido ;
    private Date fecha = null;
    private double total;
    private EstadoPedido estado = null;
    private DetallePedido detallepedido = null;

    public Pedido(int idPedido,Producto producto) {
         this.idPedido = idPedido;
        Scanner c = new Scanner(System.in);
        int cantidad=0;      
        //Se toma la fecha actual
         LocalDateTime f = LocalDateTime.now();
        this.fecha = (Date)Date.from(f.atZone(ZoneId.systemDefault()).toInstant()); 
        this.estado = estado.EN_PREPARACION;
        System.out.print("INGRESE LA CANTIDAD UNIDADES DE "+ producto.getNombre()+"-> ");
        cantidad = c.nextInt();
         this.total = cantidad*producto.getPrecio();   
        //se crea el detallepedido
        detallepedido = new DetallePedido( cantidad, this.total, producto );
        agregarDetalle(detallepedido);
        System.out.println("Pedido creado.. ");
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
        Pago pago = null;
        Scanner e = new Scanner(System.in);
        int d=0;
        System.out.println("Ingrese el medio de pago-> 1.Tarjeta de Credito 2.MercadoPago");
       boolean validado = false;
        
        while(!validado){
       try{
         d = e.nextInt();
         if(d< 1 || d>2){
             throw new InputMismatchException();
         }
         validado = true;
       }catch(InputMismatchException ime){
           System.out.println("Debe ingresar una opcion valida");
           e.nextLine();
       }      
      }
       switch(d){ //los constructores vacios llevan los datos harcodeados
           case 1 -> pago = new TarjetaCredito();
           case 2 -> pago = new MercadoPago();
           default -> System.out.println("Producto inexistente");
       }     
        return pago;
    }
    
    public void cambiarEstado(){
        
    }
}
