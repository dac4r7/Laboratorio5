/*
Clase ClientePreferencial , clase padre Cliente

 */
package com.lab1.laboratorio5.Cliente;

import java.util.Scanner;

/**
 *
 * @author Diego A. Cesarin
 */
public class ClientePreferencial extends Cliente{
    
    private double porcentajeDescuento;
    private int puntosAcumulados;
    
    public ClientePreferencial(double porcentajeDescuento, int puntosAcumulados, int idCliente, String nombre, String apellido, String email, String direccion, String instagram, String facebook) {
        super(idCliente, nombre, apellido, email, direccion, instagram, facebook);
        this.porcentajeDescuento = porcentajeDescuento;
        this.puntosAcumulados = puntosAcumulados;
    }
    
        
    public double aplicarDescuento(){
       int monto;
       Scanner dato = new Scanner(System.in);       
       System.out.print("Ingrese el monto de la compra-> ");
       monto = dato.nextInt();
       return monto*(porcentajeDescuento/100);
    }
    
    public void acumularPuntos(){
        int puntos;
       Scanner dato = new Scanner(System.in);   
        System.out.println("Ingrese los puntos acumulados-> " );
        puntos = dato.nextInt();
        
        this.puntosAcumulados += puntos ;
    }
    public void canjearBeneficios(){
        
    }
    
}
