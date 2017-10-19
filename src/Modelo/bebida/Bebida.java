/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.bebida;

import Modelo.Producto;
import java.util.Date;

/**
 *
 * @author HangjieHuang
 */
public abstract class Bebida extends Producto{
    protected String formato;

    public Bebida(String nombreProducto, String nombreMarca, int unidades, boolean mantenerFresco, Date fechaAdd, float precio) {
        super(nombreProducto, nombreMarca, unidades, mantenerFresco, fechaAdd, precio);
    }

    
    
    
}
