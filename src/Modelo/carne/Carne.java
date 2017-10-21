package Modelo.carne;

import Modelo.Producto;

public class Carne extends Producto {
    private double precioPorKilo;
    private boolean adobado = false;  // por defecto false
    private double peso;  // en kiloGramos

    public Carne(String nombreProducto, String nombreMarca, int unidades, boolean conservarFresco, String fechaAdd) {
        super(nombreProducto, nombreMarca, unidades, conservarFresco, fechaAdd);
    }



    @Override
    public double totalPrecio(int unidades) {
        return precioPorKilo*peso*unidades;
    }   
    
}
