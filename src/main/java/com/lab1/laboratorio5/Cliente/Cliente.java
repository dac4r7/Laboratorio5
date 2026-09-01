/*
 
Clase cliente
hereda hacia ClientePreferencial
tiene asociacion 0,* con Pedido

*/
package com.lab1.laboratorio5.Cliente;

import com.lab1.laboratorio5.Pedido;
import com.lab1.laboratorio5.productos.Cerveza;
import com.lab1.laboratorio5.productos.Producto;
import com.lab1.laboratorio5.productos.Vino;
import com.lab1.laboratorio5.productos.Whisky;
import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Diego Adrian Cesarin
 */
public class Cliente {
    
   private  int idCliente;
   private  String nombre = null;
   private  String apellido = null;
   private String email = null;
   private String direccion = null;
   private String instagram = null;
   private String facebook = null;

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
       Producto producto = null;
       boolean validado =false;
       int d = 0;
       Scanner eleccion = new Scanner(System.in);
       System.out.print("INGRESE EL TIPO DE PEDIDO ");
       System.out.print("1.Vino 2.Cerveza 3.Whisky -> ");
       while(!validado){
       try{
         d= eleccion.nextInt();
         if(d< 1 || d>3){
             throw new InputMismatchException();
         }
         validado = true;
       }catch(InputMismatchException ime){
           System.out.println("Debe ingresar una opcion valida");
           eleccion.nextLine();
       }      
      }
       switch(d){ //los constructores vacios llevan los datos harcodeados
           case 1 -> producto = new Vino();
           case 2 -> producto = new Cerveza();
           case 3 -> producto = new Whisky();
           default -> System.out.println("Producto inexistente");
       }
       //datos de la hora actual para formar el id de pedido
       LocalDateTime fechahora = LocalDateTime.now();
       int dia = fechahora.getDayOfMonth();
       int mes = fechahora.getDayOfMonth();
       int anio = fechahora.getYear()%100;
       int hora = fechahora.getHour();
       //int minuto = fechahora.getMinute();
       //se concatenan los datos suponiendo el id de cliente va de 0 a 99
       //en caso de que sea mas grande habria que cambiar idpedido a un tipo long
       int idpedido = Integer.parseInt( 
               String.format("%02d%02d%02d%02d%02d",
                     this.idCliente,hora,dia,mes,
                     anio )
               );
       
       return new Pedido(idpedido,producto);
   }
   
   public void verHistorialPedidos()
   {
    
   }
   
 }

