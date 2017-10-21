package Modelo.verdura;

public class Seta extends Verdura {

    public Seta(String nombreProducto, String nombreMarca, int unidades, boolean conservarFresco, String fechaAdd, double precioPorKilo, double peso, String origen) {
        super(nombreProducto, nombreMarca, unidades, conservarFresco, fechaAdd, precioPorKilo, peso, origen);
    }


    @Override
    public double totalPrecio(int unidades) {
        return precioPorKilo*unidades;
    }
    
        @Override
    public String toString() {
        return "SinAlcohol{ nombre: " + nombreProducto + "marca: " + nombreMarca + "unidad: "
                + unidades + "mantener fresco? " + conservarFresco + "fecha: " + fechaAdd + "precio: " + precioPorKilo + "peso: " + peso + "}";
    }
    
}
