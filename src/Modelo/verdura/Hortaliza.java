package Modelo.verdura;

import Utils.Colors;

public class Hortaliza extends Verdura {

    private boolean preparadoParaCocido = false;

    public Hortaliza(String nombreProducto, String nombreMarca, int unidades, boolean conservarFresco, String fechaAdd, String proveedor, double precioPorKilo, double peso, String origen, boolean preparadoParaCocido) {
        super(nombreProducto, nombreMarca, unidades, conservarFresco, fechaAdd, proveedor, precioPorKilo, peso, origen);
        this.preparadoParaCocido = preparadoParaCocido;

    }

    @Override
    public double totalPrecio(int unidades) {
        return precioPorKilo * peso * unidades;
    }

    @Override
    public String toString() {
        return "Verdura/Hortaliza { nombre: " + Colors.ANSI_YELLOW + nombreProducto + Colors.ANSI_RESET + "; marca: " + Colors.ANSI_YELLOW + nombreMarca + Colors.ANSI_RESET + "; unidades: "
                + Colors.ANSI_YELLOW + unidades + Colors.ANSI_RESET + "; mantener fresco? " + Colors.ANSI_YELLOW + conservarFresco + Colors.ANSI_RESET + "; fecha: "
                + Colors.ANSI_YELLOW + fechaAdd + Colors.ANSI_RESET + "; proveedor: " + Colors.ANSI_YELLOW + proveedor + Colors.ANSI_RESET + "; precio: "
                + Colors.ANSI_YELLOW + precioPorKilo + Colors.ANSI_RESET + "; adobado? " + Colors.ANSI_YELLOW + preparadoParaCocido + Colors.ANSI_RESET + "; peso: " 
                + Colors.ANSI_YELLOW + peso + Colors.ANSI_RESET + " }";
    }

}
