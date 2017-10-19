package Modelo.verdura;

import Modelo.Producto;
import java.util.Date;

public abstract class Verdura extends Producto {
    
    protected String origen;
    
    public Verdura(String nombreProducto, String nombreMarca, int unidades, boolean mantenerFresco, Date fechaAdd, float precio) {
        super(nombreProducto, nombreMarca, unidades, mantenerFresco, fechaAdd, precio);
    }
    
}
