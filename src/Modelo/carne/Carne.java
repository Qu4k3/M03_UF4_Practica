package Modelo.carne;

import Modelo.Producto;

public class Carne extends Producto {
    
    private boolean adobado = false;  // por defecto false
    private double peso;  // en gramos
    private enum Animal {AVE, CERDO, VACUNO}

    public Carne(String nombreProducto, String nombreMarca, int unidades, boolean mantenerFresco, String fechaAdd) {
        super(nombreProducto, nombreMarca, unidades, mantenerFresco, fechaAdd);
    }

    @Override
    public double totalPrecio(int unidades) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }   
    
}
