package Modelo.bebida;

import Modelo.Producto;

public abstract class Bebida extends Producto{

    protected String formato;

    public Bebida(String nombreProducto, String nombreMarca, int unidades, boolean conservarFresco, String fechaAdd, String proveedor, double precio, String formato) {
        super(nombreProducto, nombreMarca, unidades, conservarFresco, fechaAdd, proveedor, precio);
        this.formato = formato;
    }    
    
}
