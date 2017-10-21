package Modelo.bebida;

public class ConAlcohol extends Bebida{
    

    public ConAlcohol(String nombreProducto, String nombreMarca, int unidades, boolean mantenerFresco, String fechaAdd, double precioPorUnidad, Formato tipoFormato) {
        super(nombreProducto, nombreMarca, unidades, mantenerFresco, fechaAdd, tipoFormato, precioPorUnidad);
    }

    @Override
    public double totalPrecio(int unidades) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
