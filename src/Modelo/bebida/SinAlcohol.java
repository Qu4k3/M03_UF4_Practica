package Modelo.bebida;

public class SinAlcohol extends Bebida{
    private String sabor;
    private boolean azucarada;

    public SinAlcohol(String nombreProducto, String nombreMarca, int unidades, boolean conservarFresco, String fechaAdd, Formato tipoFormato, double precioPorUnidad, String sabor, boolean azucarada) {
        super(nombreProducto, nombreMarca, unidades, conservarFresco, fechaAdd, tipoFormato, precioPorUnidad);
        this.precioPorUnidad=precioPorUnidad;
        this.sabor = sabor;
        this.conservarFresco = conservarFresco;
    }

    @Override
    public double totalPrecio(int unidades) {
        return unidades*precioPorUnidad;
    }

   

     
    
    @Override
    public String toString() {
        return "SinAlcohol{"+id+nombreProducto + '}';
    }
}
