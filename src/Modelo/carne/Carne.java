package Modelo.carne;

import Modelo.Producto;

public class Carne extends Producto {
    private double precioPorKilo;
    private boolean adobado = false;  // por defecto false
    private double peso;  // en kiloGramos

    public Carne(String nombreProducto, String nombreMarca, int unidades, boolean conservarFresco, String fechaAdd, String proveedor, double precioPorKilo, boolean adobado, double peso) {
        super(nombreProducto, nombreMarca, unidades, conservarFresco, fechaAdd, proveedor);
        this.precioPorKilo=precioPorKilo;
        this.adobado=adobado;
        this.peso=peso;
    }


    @Override
    public double totalPrecio(int unidades) {
        return precioPorKilo*peso*unidades;
    }   
    
        @Override
    public String toString() {
        return "SinAlcohol{ nombre: " + nombreProducto + "marca: " + nombreMarca + "unidad: "
                + unidades + "mantener fresco? " + conservarFresco + "fecha: " + fechaAdd + "proveedor: "+proveedor+"precio: " + precioPorKilo + "adobado? "+adobado+"peso: "+peso+"}";
    }
    
}
