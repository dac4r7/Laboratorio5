/*
  */
package com.lab1.laboratorio5.productos;

/**
 *
 * @author Alumno
 */
public class Cerveza extends Producto {
    
    private String tipoCerveza;

    public Cerveza(String tipoCerveza, int idProducto, String nombre, double precio, double ValorCosto, int stock, double graduacionAlcoholica) {
        super(idProducto, nombre, precio, ValorCosto, stock, graduacionAlcoholica);
        this.tipoCerveza = tipoCerveza;
    }

    public String getTipoCerveza() {
        return tipoCerveza;
    }
   public void servirFria(){
    System.out.println("La "+ tipoCerveza +" se sirvio en su punto mas frio.. ");
}     
}
