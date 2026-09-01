/*
  */
package com.lab1.laboratorio5.Pago;

import java.util.Date;

/**
 *
 * @author Diego Adrian Cesarin
 */
public class TarjetaCredito extends Pago{
     private String numeroTarjeta=null;
     private String banco =null;

    public TarjetaCredito(String numeroTarjeta, String banco, int idPago, double monto, Date fechaPago) {
        super(idPago, monto, fechaPago);
        this.numeroTarjeta = numeroTarjeta;
        this.banco = banco;
    }

    public TarjetaCredito(){
        System.out.println("Opcion seleccionada Tarjeta de Credito..");
         this.numeroTarjeta = "123456789";
        this.banco = "Banco X";
       
        if(validarTarjeta()){
            procesarPago();
        }else{
            System.out.println("No se pudo validar la tarjeta.");
        }    
    }

    boolean validarTarjeta()
    {
        System.out.println("Enviando datos para validacion..");
        System.out.println(" Validando Targeta..");
        if(this.numeroTarjeta != null && this.banco != null){//&& continuarian las condiciones..
        System.out.println("..Tarjeta Validada ");
        return true;
        }else{
           System.out.println("Hubo un error durante la Validacion de la tarjeta. "); 
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
