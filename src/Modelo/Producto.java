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
    protected String proveedor;
    protected final double IVA= 1.21;

    public Producto(String nombreProducto, String nombreMarca, int unidades, boolean conservarFresco, String fechaAdd, String proveedor) {
        this.id = count.incrementAndGet();
        this.nombreProducto = nombreProducto;
        this.nombreMarca = nombreMarca;
        this.unidades = unidades;
        this.conservarFresco = conservarFresco;
        this.fechaAdd = fechaAdd;
        this.proveedor=proveedor;
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

    public String getProveedor() {
        return proveedor;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }



    public abstract double totalPrecio(int unidades);

    
}
