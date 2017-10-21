package Modelo.verdura;

import Modelo.Producto;

public abstract class Verdura extends Producto {

    protected double precioPorKilo;
    protected double peso;
    protected String origen;

    public Verdura(String nombreProducto, String nombreMarca, int unidades, boolean conservarFresco, String fechaAdd, double precioPorKilo, double peso, String origen) {
        super(nombreProducto, nombreMarca, unidades, conservarFresco, fechaAdd);
        this.precioPorKilo = precioPorKilo;
        this.peso=peso;
        this.origen = origen;
    }

}
