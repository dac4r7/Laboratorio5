/*
  */
package com.lab1.laboratorio5.Pago;

import java.util.Date;

/**
 *
 * @author Alumno
 */
public class TarjetaCredito extends Pago{
     private String numeroTarjeta=null;
     private String banco =null;

    public TarjetaCredito(String numeroTarjeta, String banco, int idPago, double monto, Date fechaPago) {
        super(idPago, monto, fechaPago);
        this.numeroTarjeta = numeroTarjeta;
        this.banco = banco;
    }


boolean validarTarjeta()
{
    System.out.println("Enviando datos para validacion..");
    System.out.println("* Validando Targeta ");
    if(this.numeroTarjeta != null && this.banco != null){//&& continuarian las condiciones..
       return true;
        }
    return false;
}

}
