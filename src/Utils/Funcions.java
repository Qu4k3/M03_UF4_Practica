package Utils;

import Modelo.Producto;
import Modelo.bebida.*;
import Modelo.carne.Carne;
import Modelo.verdura.*;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collection;

public class Funcions {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static ArrayList<Producto> addProductosDesdeArchivo() throws IOException {
        ArrayList<Producto> productos = new ArrayList<>();
        FileInputStream fis = new FileInputStream("productos.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        try {
            while (true) {
                Producto auxProducto = (Producto) ois.readObject();
                productos.add(auxProducto);
            }
        } catch (EOFException e) {
            ois.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return productos;

    }

    public static void listarTotoProducto(ArrayList<Producto> productos) {
        for (Producto elem : productos) {
            System.out.println(elem.toString());
        }
    }

    public static void listarPorTipoProducto(ArrayList<Producto> productos) throws IOException {
        String opt;
        System.out.println("Que tipo de producto quieres listar?");
        opt = br.readLine().toLowerCase();

        for (Producto elem : productos) {
            if (elem.toString().toLowerCase().contains(opt)) {
                System.out.println(elem.toString());
            }
        }
        br.close();
    }

    public static void listarPorProveedor(ArrayList<Producto> productos) throws IOException {
        String opt;
        System.out.println("De qué proveedor quieres ver? ");
        opt = br.readLine().toLowerCase();
        for (Producto elem : productos) {
            if (elem.getProveedor().toLowerCase().contains(opt)) {
                System.out.println(elem.toString());
            }
        }
        br.close();
    }

    public static void borrarPorproveedor(ArrayList<Producto> productos) throws IOException {
        String opt;
        System.out.println("De qué proveedor quieres borrar? ");
        opt = br.readLine();
        for (Producto elem : productos) {
            if (elem.getProveedor().equalsIgnoreCase(opt)) {
                productos.remove(elem);
            }
        }
    }

    public static void editarCantidad(ArrayList<Producto> productos) throws IOException {
        System.out.println("Que producto quieres etidar?");
        String nombreProducto;
        int cantidad;
        boolean existe = true;
        nombreProducto = br.readLine();
        for (Producto elem : productos) {
            if (elem.getNombreProducto().equalsIgnoreCase(nombreProducto)) {
                System.out.println(elem.toString());
                System.out.println("Introduce la cantidad quieres aumentar");
                cantidad = Integer.parseInt(br.readLine());
                elem.setUnidades(elem.getUnidades() + cantidad);
                System.out.println("cantidad aumentado");
            } else {
                existe = false;
            }
        }
        if (existe == false) {
            System.out.println("producto no existe");
        }
    }

    public static void editarPrecio(ArrayList<Producto> productos) throws IOException {
        System.out.println("Que producto quieres etidar?");
        String nombreProducto;
        double precio;
        boolean existe = true;
        nombreProducto = br.readLine();
        for (Producto elem : productos) {
            if (elem.getNombreProducto().equalsIgnoreCase(nombreProducto)) {
                System.out.println(elem.toString());
                System.out.println("Introduce el precio");
                precio = Double.parseDouble(br.readLine());
                elem.setPrecio(precio);
                System.out.println("precio editado");
            } else {
                existe = false;
            }
        }
        if (existe == false) {
            System.out.println("producto no existe");
        }
    }
    
    
    public static void editarProveedor(ArrayList<Producto> productos) throws IOException {
        System.out.println("Que producto quieres etidar?");
        String nombreProducto,proveedor;
        
        boolean existe = true;
        nombreProducto = br.readLine();
        for (Producto elem : productos) {
            if (elem.getNombreProducto().equalsIgnoreCase(nombreProducto)) {
                System.out.println(elem.toString());
                System.out.println("Introduce el nombre de proveedor");
                proveedor=br.readLine();
                elem.setProveedor(proveedor);
                System.out.println("proveedor editado");
            } else {
                existe = false;
            }
        }
        if (existe == false) {
            System.out.println("producto no existe");
        }
    }

}
