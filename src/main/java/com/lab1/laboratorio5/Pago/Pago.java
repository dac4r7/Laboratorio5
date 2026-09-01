/*

Clase Pago
Relaciones:
asociacion composicion de Pedido
herencia hacia TargentaCreadito MercadoPago  

 */
package com.lab1.laboratorio5.Pago;

import java.util.Date;

/**
 *
 * @author Diego Adrian Cesarin
 */
public class Pago {
    
    private int idPago;
    private double monto;
    private Date fechaPago = null;
    
    public Pago(int idPago, double monto, Date fechaPago) {
        this.idPago = idPago;
        this.monto = monto;
        this.fechaPago = fechaPago;
    }

    public Pago() {
     }
    
    public boolean procesarPago(){
        System.out.println("Procesando el pago....");
        return true;
        }
    
    public void emitirComprobante(){
        System.out.println("Comprobante de pago");
        System.out.println("----------------------------");
        System.out.println("Id de Pago : "+ idPago);
        System.out.println("Monto : " + monto);
        System.out.println("Fecha de Pago : "+ fechaPago);
    }
    
}
