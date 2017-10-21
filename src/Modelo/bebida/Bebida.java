/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.bebida;

import Modelo.Producto;


/**
 *
 * @author HangjieHuang
 */
public abstract class Bebida extends Producto{
    protected String formato;

    public Bebida(String nombreProducto, String nombreMarca, int unidades, boolean mantenerFresco, String fechaAdd, String formato) {
        super(nombreProducto, nombreMarca, unidades, mantenerFresco, fechaAdd);
        this.formato=formato;
    }

    


    
    
    
}
