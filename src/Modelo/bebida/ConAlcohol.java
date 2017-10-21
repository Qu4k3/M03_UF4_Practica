package Modelo.bebida;

public class ConAlcohol extends Bebida{
        private double precioPorUnidad;

    public ConAlcohol(String nombreProducto, String nombreMarca, int unidades, boolean mantenerFresco, String fechaAdd, double precioPorUnidad) {
        super(nombreProducto, nombreMarca, unidades, mantenerFresco, fechaAdd);
        this.precioPorUnidad=this.precioPorUnidad;
    }

    @Override
    public double totalPrecio(int unidades) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
