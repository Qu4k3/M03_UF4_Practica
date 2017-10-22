package Modelo.bebida;

import Utils.Colors;

public class SinAlcohol extends Bebida{
  
    private boolean azucarada;

    public SinAlcohol(String nombreProducto, String nombreMarca, int unidades, boolean conservarFresco, String fechaAdd, String proveedor, double precioPorUnidad, String formato, boolean azucarada) {
        super(nombreProducto, nombreMarca, unidades, conservarFresco, fechaAdd, proveedor, precioPorUnidad, formato);
                this.azucarada = azucarada;
    }





    @Override
    public double totalPrecio(int unidades) {
        return unidades*precioPorUnidad*IVA;
            }

    @Override
    public String toString() {
        return "Bebida sin alcohol { nombre: " + Colors.ANSI_YELLOW + nombreProducto + Colors.ANSI_RESET + "; marca: " + Colors.ANSI_YELLOW + nombreMarca + Colors.ANSI_RESET+"; unidad: "
                + Colors.ANSI_YELLOW + unidades + Colors.ANSI_RESET+"; mantener fresco? "+ Colors.ANSI_YELLOW + conservarFresco + Colors.ANSI_RESET+"; fecha: "
                +Colors.ANSI_YELLOW + fechaAdd + Colors.ANSI_RESET+"; proveedor: "+Colors.ANSI_YELLOW + proveedor + Colors.ANSI_RESET+"; precio: "+Colors.ANSI_YELLOW + precioPorUnidad + Colors.ANSI_RESET+"; azucarada? "
                +Colors.ANSI_YELLOW + azucarada + Colors.ANSI_RESET+" }";
    }


   
}
