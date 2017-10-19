package Modelo.carne;

import java.util.Date;

public class Vacuno extends Carne {

    public Vacuno(String nombreProducto, String nombreMarca, int unidades, boolean mantenerFresco, Date fechaAdd, float precio) {
        super(nombreProducto, nombreMarca, unidades, mantenerFresco, fechaAdd, precio);
    }

    @Override
    public double totalPrecio(int unidades) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
