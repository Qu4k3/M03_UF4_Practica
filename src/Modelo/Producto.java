/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author HangjieHuang
 */
public abstract class  Producto {
    protected static final AtomicInteger count = new AtomicInteger();
    protected final int id;
    protected String nombreProducto;
    protected String nombreMarca;
    protected int unidades;
    protected boolean mantenerFresco;
    protected Date fechaAdd;
    protected float precio;
    final double IVA= 1.21;

    public Producto(String nombreProducto, String nombreMarca, int unidades, boolean mantenerFresco, Date fechaAdd, float precio) {
        this.id = count.incrementAndGet();
        this.nombreProducto = nombreProducto;
        this.nombreMarca = nombreMarca;
        this.unidades = unidades;
        this.mantenerFresco = mantenerFresco;
        this.fechaAdd = fechaAdd;
        this.precio = precio;
    }
    



    public abstract double totalPrecio(int unidades);

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombreProducto=" + nombreProducto + ", nombreMarca=" + nombreMarca + ", unidades=" + unidades + ", mantenerFresco=" + mantenerFresco + ", fechaAdd=" + fechaAdd + ", precio=" + precio + ", IVA=" + IVA + '}';
    }
    
    
}
