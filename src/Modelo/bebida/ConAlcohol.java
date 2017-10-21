/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.bebida;

/**
 *
 * @author HangjieHuang
 */
public class ConAlcohol extends Bebida{
        private double precioPorUnidad;

    public ConAlcohol(String nombreProducto, String nombreMarca, int unidades, boolean mantenerFresco, String fechaAdd, String formato, double precioPorUnidad) {
        super(nombreProducto, nombreMarca, unidades, mantenerFresco, fechaAdd, formato);
        this.precioPorUnidad=this.precioPorUnidad;
    }

    @Override
    public double totalPrecio(int unidades) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
