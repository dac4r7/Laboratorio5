/*
 
 */
package com.lab1.laboratorio5.productos;

/**
 *
 * @author Diego Adrian Cesarin
 */
public class Vino extends Producto{
    
    private String tipoVino = null;
    
    public Vino(){
       //se harcodean los datos para realizar pruebas
       super(123, " Altocedro Gran Reserva", 110000.00,95000.00 , 20, 15.3);
       this.tipoVino = "Malbec";
       }
    
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
