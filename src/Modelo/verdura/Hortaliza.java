package Modelo.verdura;

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
        return "Hortaliza{ nombre: " + nombreProducto + "marca: " + nombreMarca + "unidad: "
                + unidades + "mantener fresco? " + conservarFresco + "fecha: " + fechaAdd + "proveedor: " + proveedor + "precio: " + precioPorKilo + "adobado? " + preparadoParaCocido + "peso: " + peso + "}";
    }

}
