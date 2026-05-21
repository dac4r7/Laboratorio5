/*
 
Clase cliente
hereda hacia ClientePreferencial
tiene asociacion 0,* con Pedido

*/
package com.lab1.laboratorio5.Cliente;

import com.lab1.laboratorio5.Pedido;

/**
 *
 * @author Diego A. Cesarin
 */
public class Cliente {
    
   private final int idCliente;
   private final String nombre;
   private final String apellido;
   private String email;
   private String direccion;
   private String instagram;
   private String facebook;

    public Cliente(int idCliente, String nombre, String apellido, String email, String direccion, String instagram, String facebook) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.direccion = direccion;
        this.instagram = instagram;
        this.facebook = facebook;
    }
   
   public Pedido realizarPedido()
   {   //Aqui se crea el pedido
       // Pedidos pedido1 = new (idPedido, new Date() , total, EstadoPedido.EN_PREPARACION);
       // pedidos.add(pedido1);
      //return  pedido1;
       
       return new Pedido();
   }
   
   
   public void verHistorialPedidos()
   {
       //necesitaria un array de pedidos generados para poder ver su historial
       //como variable miembro :  ArrayList<Pedido> pedidos = new ArrayList<>();
        //System.out.println("Pedidos realizados : "+ pedido.);
        // for(Pedido pedido : pedidos ){
       // System.out.println("Pedido : "+ pedido.idPedido);
       // System.out.println("Fecha : "+ pedido.fecha);
       // System.out.println("Total : "+ pedido.total);
       // System.out.println("Estado : "+ pedido.estado);
   }
   
 }

