/*
 
 */
package com.lab1.laboratorio5.Pago;

import java.util.Date;

/**
 *
 * @author Alumno
 */
public class MercadoPago extends Pago {

     private String aliasCuenta = null;
    
    public MercadoPago(String aliasCuenta, int idPago, double monto, Date fechaPago) {
        super(idPago, monto, fechaPago);
        this.aliasCuenta = aliasCuenta;
    } 
    
    private boolean validarCuenta()
    {   System.out.println("Enviando datos para validacion..");
        System.out.println("* Validando Cuenta ");
        if(this.aliasCuenta != null){//&& continuarian las condiciones..
            return true;
        }
        return false;
    }
}
