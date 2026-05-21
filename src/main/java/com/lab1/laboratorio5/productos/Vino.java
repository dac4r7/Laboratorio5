/*
 
 */
package com.lab1.laboratorio5.productos;

/**
 *
 * @author Alumno
 */
public class Vino extends Producto{
    
    private String tipoVino;

    public Vino(String tipoVino, int idProducto, String nombre, double precio, double ValorCosto, int stock, double graduacionAlcoholica) {
        super(idProducto, nombre, precio, ValorCosto, stock, graduacionAlcoholica);
        this.tipoVino = tipoVino;
    }

    public String getTipoVino() {
        return tipoVino;
    }

   
    public void mostrarMaridaje(){
        System.out.println("Este vino por su afinidad puede combinarse con platos ligejos");
        System.out.println("o tambien suele equilibrase con salsas dulces..  ");
    }
}
