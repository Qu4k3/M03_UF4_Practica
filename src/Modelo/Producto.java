package Modelo;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class  Producto implements Serializable{
    protected static final AtomicInteger count = new AtomicInteger();
    protected final int id;
    protected String nombreProducto;
    protected String nombreMarca;
    protected int unidades;
    protected boolean conservarFresco;
    protected String fechaAdd;
    final double IVA= 1.21;

    public Producto(String nombreProducto, String nombreMarca, int unidades, boolean mantenerFresco, String fechaAdd) {
        this.id = count.incrementAndGet();
        this.nombreProducto = nombreProducto;
        this.nombreMarca = nombreMarca;
        this.unidades = unidades;
        this.conservarFresco = mantenerFresco;
        this.fechaAdd = fechaAdd;
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

    public boolean isConservarFresco() {
        return conservarFresco;
    }

    public String getFechaAdd() {
        return fechaAdd;
    }


    public double getIVA() {
        return IVA;
    }

    public abstract double totalPrecio(int unidades);

    
}
