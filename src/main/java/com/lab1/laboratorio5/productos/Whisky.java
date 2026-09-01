/*
  */
package com.lab1.laboratorio5.productos;

/**
 *
 * @author Diego Adrian Cesarin
 */
public class Whisky extends Producto{
   
    private int aniosAnejamiento ;

    public Whisky(){
     //se harcodean los datos para realizar pruebas
    super(125, "Johnnie Walker Black", 63000.0, 39200.00, 25,40.0);
    this.aniosAnejamiento = 10;   
    }
    
    public Whisky(int aniosAnejamiento, int idProducto, String nombre, double precio, double ValorCosto, int stock, double graduacionAlcoholica) {
        super(idProducto, nombre, precio, ValorCosto, stock, graduacionAlcoholica);
        this.aniosAnejamiento = aniosAnejamiento;
    }

    public int getAniosAnejamiento() {
        return aniosAnejamiento;
    }
    
    public void mostrarAntiguedad(){
        System.out.println("Este whisky tienen una antiguedad de : "+ aniosAnejamiento);
    }
    
}
