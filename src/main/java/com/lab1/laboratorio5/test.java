package com.lab1.laboratorio5;

import com.lab1.laboratorio5.Cliente.Cliente;
import com.lab1.laboratorio5.Cliente.ClientePreferencial;
import com.lab1.laboratorio5.Pago.Pago;
import java.util.Date;

/*

 */



/**
 *
 * @author Alumno
 */
public class test {

    public static void main(String[] args) {
      
        Cliente cliente1 = new Cliente(1, "Pedro", "Alvarez", "pa2002@gmail.com", "los patos 3344", "palvarez", "pedroalvar");
        ClientePreferencial cliente2 = new ClientePreferencial(5.0, 0, 2, "Juana", "Veltran", "carvel@hotmail.com", "artesanos 543", "veljuana", "juanaveltran");
        Pedido pedido1 =  cliente1.realizarPedido();
        Pedido pedido2 = cliente2.realizarPedido();
        
        Pago pagopedido1 = pedido1.generarPago();
        pagopedido1.procesarPago();
        cliente2.acumularPuntos();
        cliente2.aplicarDescuento();
        Pago pagopedido2 = pedido2.generarPago();
        pagopedido2.procesarPago();
        
        
    }
}

