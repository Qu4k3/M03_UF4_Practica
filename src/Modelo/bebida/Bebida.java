package Modelo.bebida;

import Modelo.Producto;

public abstract class Bebida extends Producto{

    protected double precioPorUnidad;
    protected String formato;

    public Bebida(String nombreProducto, String nombreMarca, int unidades, boolean conservarFresco, String fechaAdd, String proveedor, double precioPorUnidad, String formato) {
        super(nombreProducto, nombreMarca, unidades, conservarFresco, fechaAdd, proveedor);
        this.precioPorUnidad = precioPorUnidad;
        this.formato = formato;
    }    
    
}
