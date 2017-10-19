/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author HangjieHuang
 */
public abstract class  Producto {
    protected int id;
    protected String nombreProducto;
    protected String nombreMarca;
    protected int unidades;
    protected boolean mantenerFresco;
    protected Date fechaAdd;
    protected float precio;
    final double IVA= 1.21;
    protected String formatoProducto;
    


    public Producto(String nombreProducto, String nombreMarca, int unidades, boolean mantenerFresco, Date fechaAdd, float precio, String formatoProducto) {
        this.nombreProducto = nombreProducto;
        this.nombreMarca = nombreMarca;
        this.unidades = unidades;
        this.mantenerFresco = mantenerFresco;
        this.fechaAdd = fechaAdd;
        this.precio = precio;
        this.formatoProducto = formatoProducto;
    }

    public abstract double totalPrecio(int unidades);
}