/*

Clase Proveedor
tiene una asociacio 0,* con Producto
*/
package com.lab1.laboratorio5.productos;

/**
 *
 * @author Diego Adrian Cesarin
 */
public class Proveedor {
    
    private int idProveedor;
    private String nombreEmpresa = null;
    private final String nombreContacto ="";
    private String telefono = null;
    private String email = null;

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
