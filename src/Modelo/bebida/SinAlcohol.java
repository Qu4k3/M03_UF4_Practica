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


    public SinAlcohol(String nombreProducto, String nombreMarca, int unidades, boolean mantenerFresco, String fechaAdd, float precio, String formato) {
        super(nombreProducto, nombreMarca, unidades, mantenerFresco, fechaAdd, precio, formato);
    }

    @Override
    public double totalPrecio(int unidades) {
        return unidades*precio;
    }

   

     
    
    @Override
    public String toString() {
        return "SinAlcohol{"+id+nombreProducto + '}';
    }
}
