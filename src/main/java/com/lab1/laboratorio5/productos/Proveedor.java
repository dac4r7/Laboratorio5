/*

Clase Proveedor
tiene una asociacio 0,* con Producto
*/
package com.lab1.laboratorio5.productos;

/**
 *
 * @author Diego A. Cesarin
 */
public class Proveedor {
    
    private int idProveedor;
    private String nombreEmpresa;
    private final String nombreContacto ="";
    private String telefono;
    private String email;

    public Proveedor(int idProveedor, String nombreEmpresa, String telefono, String email) {
        this.idProveedor = idProveedor;
        this.nombreEmpresa = nombreEmpresa;
        this.telefono = telefono;
        this.email = email;
    }
    
    public void suministrarProducto(Producto producto){
        
    }
    
    public void actualizarCatalogo(){
        
    }
    
    public void contactarProveedor(){
        
        
    }
    
    
}
