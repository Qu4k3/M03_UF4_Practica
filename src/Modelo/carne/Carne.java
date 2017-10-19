package Modelo.carne;

import Modelo.Producto;
import java.util.Date;

public abstract class Carne extends Producto {
    
    protected boolean adobado = false;  // por defecto false
    protected double peso;  // en gramos
    
    public Carne(String nombreProducto, String nombreMarca, int unidades, boolean mantenerFresco, Date fechaAdd, float precio) {
        super(nombreProducto, nombreMarca, unidades, mantenerFresco, fechaAdd, precio);
    }
   
    
}
