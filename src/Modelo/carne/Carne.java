package Modelo.carne;

import Modelo.Producto;
import Utils.Colors;

public class Carne extends Producto {

    private boolean adobado = false;  // por defecto false
    private double peso;  // en kiloGramos
    private String animal;

    public Carne(String nombreProducto, String nombreMarca, int unidades, boolean conservarFresco, String fechaAdd, String proveedor, double precio, boolean adobado, double peso, String animal) {
        super(nombreProducto, nombreMarca, unidades, conservarFresco, fechaAdd, proveedor, precio);

        this.adobado = adobado;
        this.peso = peso;
        this.animal = animal;
    }

    @Override
    public double totalPrecio(int unidades) {
        return precio * peso * unidades * IVA;
    }

    @Override
    public String toString() {
        return "Carne { nombre: " + Colors.ANSI_YELLOW + nombreProducto + Colors.ANSI_RESET + "; marca: " + Colors.ANSI_YELLOW + nombreMarca + Colors.ANSI_RESET + "; unidades: "
                + Colors.ANSI_YELLOW + unidades + Colors.ANSI_RESET + "; mantener fresco? " + Colors.ANSI_YELLOW + conservarFresco + Colors.ANSI_RESET + "; fecha: "
                + Colors.ANSI_YELLOW + fechaAdd + Colors.ANSI_RESET + "; proveedor: " + Colors.ANSI_YELLOW + proveedor + Colors.ANSI_RESET + "; precio: "
                + Colors.ANSI_YELLOW + precio + Colors.ANSI_RESET + "; adobado? " + Colors.ANSI_YELLOW + adobado + Colors.ANSI_RESET + "; peso: "
                + Colors.ANSI_YELLOW + peso + Colors.ANSI_RESET + "; tipo: " + Colors.ANSI_YELLOW + animal + Colors.ANSI_RESET + " }";
    }

}
