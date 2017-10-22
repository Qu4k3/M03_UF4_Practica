package Modelo.verdura;

import Utils.Colors;

public class Seta extends Verdura {

    public Seta(String nombreProducto, String nombreMarca, int unidades, boolean conservarFresco, String fechaAdd, String proveedor, double precioPorKilo, double peso, String origen) {
        super(nombreProducto, nombreMarca, unidades, conservarFresco, fechaAdd, proveedor, precioPorKilo, peso, origen);

    }

    @Override
    public double totalPrecio(int unidades) {
        return precioPorKilo * unidades;
    }

    @Override
    public String toString() {
        return "Verdura/Seta { nombre: " + Colors.ANSI_YELLOW + nombreProducto + Colors.ANSI_RESET + "; marca: " + Colors.ANSI_YELLOW + nombreMarca + Colors.ANSI_RESET + "; unidades: " 
                + Colors.ANSI_YELLOW + unidades + Colors.ANSI_RESET + "; mantener fresco? " + Colors.ANSI_YELLOW + conservarFresco + Colors.ANSI_RESET + "; fecha: "
                + Colors.ANSI_YELLOW + fechaAdd + Colors.ANSI_RESET + "; proveedor: " + Colors.ANSI_YELLOW + proveedor + Colors.ANSI_RESET + "; precio: " 
                + Colors.ANSI_YELLOW + precioPorKilo + Colors.ANSI_RESET + "; peso: " + Colors.ANSI_YELLOW + peso + Colors.ANSI_RESET + " }";
    }

}
