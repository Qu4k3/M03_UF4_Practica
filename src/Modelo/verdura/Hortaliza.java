package Modelo.verdura;

import java.util.Date;

public class Hortaliza extends Verdura {

    private boolean preparadoParaCocido = false;

    public Hortaliza(String nombreProducto, String nombreMarca, int unidades, boolean mantenerFresco, String fechaAdd) {
        super(nombreProducto, nombreMarca, unidades, mantenerFresco, fechaAdd);
    }



    @Override
    public double totalPrecio(int unidades) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
