package Modelo.verdura;

import Modelo.Producto;

public abstract class Verdura extends Producto {
    
    protected String origen;

    public Verdura(String nombreProducto, String nombreMarca, int unidades, boolean mantenerFresco, String fechaAdd) {
        super(nombreProducto, nombreMarca, unidades, mantenerFresco, fechaAdd);
    }

    
    
}
