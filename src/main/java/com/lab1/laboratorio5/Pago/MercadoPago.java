/*
 
 */
package com.lab1.laboratorio5.Pago;

import java.util.Date;

/**
 *
 * @author Diego Adrian Cesarin
 */
public class MercadoPago extends Pago {

     private String aliasCuenta = null;
    
    public MercadoPago(String aliasCuenta, int idPago, double monto, Date fechaPago) {
        super(idPago, monto, fechaPago);
        this.aliasCuenta = aliasCuenta;
    } 
    public MercadoPago(){
        System.out.println("Opcion seleccionada Mercado Pago...");
        this.aliasCuenta = "Usuario X";
        if(validarCuenta()){
            procesarPago();
        }else{
            System.out.println("No se pudo procesar el pago.");
        }
     }
    
    private boolean validarCuenta()
    {   System.out.println("Enviando datos para validacion..");
        System.out.println(" Validando Cuenta** ");
        if(this.aliasCuenta != null){//&& continuarian las condiciones..
        System.out.println("**Cuenta Validada ");
        return true;
        }else{
           System.out.println("Hubo un error durante la Validacion de la Cuenta. "); 
        }
        return false;
    }
    
    public boolean procesarPago(){
        boolean transaccionCorrecta = true;
        if(transaccionCorrecta){
                System.out.println("..Pago realizado");
            return true;
        }
        return false;
    }
}
