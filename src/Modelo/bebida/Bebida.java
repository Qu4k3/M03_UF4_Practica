package Modelo.bebida;

import Modelo.Producto;

public abstract class Bebida extends Producto{
    protected enum Formato {LATA, BOTELLA, COPA};
    protected double precioPorUnidad;
    
    Formato tipoFormato;
    
    public Bebida(String nombreProducto, String nombreMarca, int unidades, boolean mantenerFresco, String fechaAdd, Formato tipoFormato, double precioPorUnidad) {
        super(nombreProducto, nombreMarca, unidades, mantenerFresco, fechaAdd);
        this.tipoFormato = tipoFormato;
        this.precioPorUnidad = precioPorUnidad;
    }    
   
    
    
}
