package Modelo.bebida;

import Modelo.Producto;

public abstract class Bebida extends Producto{
    protected enum Formato {LATA, BOTELLA, COPA};
    
    public Bebida(String nombreProducto, String nombreMarca, int unidades, boolean mantenerFresco, String fechaAdd) {
        super(nombreProducto, nombreMarca, unidades, mantenerFresco, fechaAdd);
    }    
    
    
}
