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
public class SinAlcohol extends Bebida{
    private double precioPorUnidad;

    public SinAlcohol(String nombreProducto, String nombreMarca, int unidades, boolean mantenerFresco, String fechaAdd, String formato,double precioPorUnidad) {
        super(nombreProducto, nombreMarca, unidades, mantenerFresco, fechaAdd, formato);
        this.precioPorUnidad=precioPorUnidad;
    }

    @Override
    public double totalPrecio(int unidades) {
        return unidades*precioPorUnidad;
    }

   

     
    
    @Override
    public String toString() {
        return "SinAlcohol{"+id+nombreProducto + '}';
    }
}
