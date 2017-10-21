package Modelo.bebida;

public class SinAlcohol extends Bebida{
  
    private boolean azucarada;

    public SinAlcohol(String nombreProducto, String nombreMarca, int unidades, boolean conservarFresco, String fechaAdd, String proveedor, double precioPorUnidad, String formato, boolean azucarada) {
        super(nombreProducto, nombreMarca, unidades, conservarFresco, fechaAdd, proveedor, precioPorUnidad, formato);
                this.azucarada = azucarada;
    }





    @Override
    public double totalPrecio(int unidades) {
        return unidades*precioPorUnidad;
            }

    @Override
    public String toString() {
        return "Bebida sin alcohol{ nombre: "+nombreProducto+";marca: "+nombreMarca+";unidad: "+
                unidades+";mantener fresco? "+ conservarFresco+";fecha: "+fechaAdd+"proveedor: "+proveedor+"precio: "+precioPorUnidad+";azucarada? "+azucarada+"}";
    }


   
}
