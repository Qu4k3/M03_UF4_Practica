/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author HangjieHuang
 */
public abstract class  Producto implements Serializable{
    protected static final AtomicInteger count = new AtomicInteger();
    protected final int id;
    protected String nombreProducto;
    protected String nombreMarca;
    protected int unidades;
    protected boolean mantenerFresco;
    protected String fechaAdd;
    protected float precio;
    final double IVA= 1.21;

    public Producto(String nombreProducto, String nombreMarca, int unidades, boolean mantenerFresco, String fechaAdd, float precio) {
        this.id = count.incrementAndGet();
        this.nombreProducto = nombreProducto;
        this.nombreMarca = nombreMarca;
        this.unidades = unidades;
        this.mantenerFresco = mantenerFresco;
        this.fechaAdd = fechaAdd;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public String getNombreMarca() {
        return nombreMarca;
    }

    public int getUnidades() {
        return unidades;
    }

    public boolean isMantenerFresco() {
        return mantenerFresco;
    }

    public String getFechaAdd() {
        return fechaAdd;
    }

    public float getPrecio() {
        return precio;
    }

    public double getIVA() {
        return IVA;
    }

    public abstract double totalPrecio(int unidades);

    
}
