/*
  */
package com.lab1.laboratorio5.productos;

/**
 *
 * @author Diego Adrian Cesarin
 */
public class Cerveza extends Producto {
    
    private String tipoCerveza = null;
    
    public Cerveza(){
     //se harcodean los datos para realizar pruebas
     super(124,"Imperial Cream Stout",3100.0, 2600.0, 60, 6.5); 
     this.tipoCerveza = "Cerveza Negra ";  
    }

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
