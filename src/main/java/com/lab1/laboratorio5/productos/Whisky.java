/*
  */
package com.lab1.laboratorio5.productos;

/**
 *
 * @author Alumno
 */
public class Whisky extends Producto{
   
    private int aniosAnejamiento;

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
