package Modelo.bebida;

public class ConAlcohol extends Bebida {

    public ConAlcohol(String nombreProducto, String nombreMarca, int unidades, boolean conservarFresco, String fechaAdd, double precioPorUnidad, String formato) {
        super(nombreProducto, nombreMarca, unidades, conservarFresco, fechaAdd, precioPorUnidad, formato);
    }

    @Override
    public double totalPrecio(int unidades) {
        return unidades * precioPorUnidad;
    }

    @Override
    public String toString() {
        return "Bebida con alcohol{ nombre: " + nombreProducto + ";marca: " + nombreMarca + ";unidad: "
                + unidades + ";mantener fresco? " + conservarFresco + ";fecha: " + fechaAdd + ";precio: " + precioPorUnidad + "}";
    }

}
