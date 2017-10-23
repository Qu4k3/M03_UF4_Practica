package Modelo.bebida;

import Utils.Colors;

public class ConAlcohol extends Bebida {

    public ConAlcohol(String nombreProducto, String nombreMarca, int unidades, boolean conservarFresco, String fechaAdd, String proveedor, double precio, String formato) {
        super(nombreProducto, nombreMarca, unidades, conservarFresco, fechaAdd, proveedor, precio, formato);
    }

    @Override
    public double totalPrecio(int unidades) {
        return unidades * precio * IVA;
    }

    @Override
    public String toString() {
        return "Bebida con alcohol{ nombre: " + Colors.ANSI_YELLOW + nombreProducto + Colors.ANSI_RESET + "; marca: "
                + Colors.ANSI_YELLOW + nombreMarca + Colors.ANSI_RESET + "; unidades: " + Colors.ANSI_YELLOW + unidades + Colors.ANSI_RESET + "; mantener fresco? "
                + Colors.ANSI_YELLOW + conservarFresco + Colors.ANSI_RESET + "; fecha: " + Colors.ANSI_YELLOW + fechaAdd + Colors.ANSI_RESET + "; proveedor: "
                + Colors.ANSI_YELLOW + proveedor + Colors.ANSI_RESET + "; precio: " + Colors.ANSI_YELLOW + precio + Colors.ANSI_RESET + " }";
    }

}
