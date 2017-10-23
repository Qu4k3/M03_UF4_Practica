package Modelo.verdura;

import Modelo.Producto;
import java.io.Serializable;

public abstract class Verdura extends Producto implements Serializable {

    protected double peso;
    protected String origen;

    public Verdura(String nombreProducto, String nombreMarca, int unidades, boolean conservarFresco, String fechaAdd, String proveedor, double precio, double peso, String origen) {
        super(nombreProducto, nombreMarca, unidades, conservarFresco, fechaAdd, proveedor, precio);

        this.peso = peso;
        this.origen = origen;
    }

}
