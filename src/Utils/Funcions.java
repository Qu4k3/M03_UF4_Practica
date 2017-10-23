package Utils;

import Modelo.Producto;
import Modelo.bebida.ConAlcohol;
import Modelo.bebida.SinAlcohol;
import Modelo.carne.Carne;
import Modelo.verdura.Hortaliza;
import Modelo.verdura.Seta;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Funcions {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Scanner leerUsuario = new Scanner(System.in);

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

    public static void addDatos(ArrayList<Producto> productos) throws IOException {
        int option;
        boolean salir = false;

        do {
            System.out.println("\n" + Colors.ANSI_CYAN + "// Ingresa el tipo de Producto que quieres introducir"
                    + Colors.ANSI_RESET + "\n\n-- Bebidas --\n1. Sin alcohol\n2. Con alcohol"
                    + "\n\n-- Carnes --\n3. Carne\n\n-- Verduras --\n4. Hortaliza\n5. Seta"
                    + "\n\n--\n6. Volver");
            Messages.inputData();
            option = leerUsuario.nextInt();
            switch (option) {
                case 1:

                    System.out.println("\nFormato: " + Colors.ANSI_YELLOW + "nombre;marca;unidades;mantener fresco?;fecha;proveedor;precio;formato;azucarada" + Colors.ANSI_RESET);

                    String linea = br.readLine();
                    String[] str = linea.split(";");
                    Producto p = new SinAlcohol(str[0], str[1], Integer.parseInt(str[2]), Boolean.parseBoolean(str[3]), str[4], str[5], Double.parseDouble(str[6]), str[7], Boolean.parseBoolean(str[8]));
                    productos.add(p);
                    System.out.println("Añadido con éxito");

                    break;
                case 2:
                    System.out.println("\nFormato: " + Colors.ANSI_YELLOW + "nombre;marca;unidades;mantener fresco?;fecha;proveedor;precio;formato" + Colors.ANSI_RESET);
                    String conAlcohol = br.readLine();
                    String[] strConAlcohol = conAlcohol.split(";");
                    Producto productoConAlcohol = new ConAlcohol(strConAlcohol[0], strConAlcohol[1], Integer.parseInt(strConAlcohol[2]), Boolean.parseBoolean(strConAlcohol[3]), strConAlcohol[4], strConAlcohol[5], Double.parseDouble(strConAlcohol[6]), strConAlcohol[7]);
                    productos.add(productoConAlcohol);
                    System.out.println("Añadido con éxito");
                    break;

                case 3:
                    System.out.println("\nFormato: " + Colors.ANSI_YELLOW + "nombre;marca;unidades;mantener fresco?;fecha;proveedor;precio;adobado? ;peso; animal" + Colors.ANSI_RESET);
                    String carne = br.readLine();
                    String[] strCarne = carne.split(";");
                    // String nombreProducto, String nombreMarca, int unidades, boolean conservarFresco, String fechaAdd, String proveedor, double precioPorKilo, boolean adobado, double peso, String animal
                    Producto productoCarne = new Carne(strCarne[0], strCarne[1], Integer.parseInt(strCarne[2]), Boolean.parseBoolean(strCarne[3]), strCarne[4], strCarne[5], Double.parseDouble(strCarne[6]), Boolean.parseBoolean(strCarne[7]), Double.parseDouble(strCarne[8]), strCarne[9]);
                    productos.add(productoCarne);
                    System.out.println("Añadido con éxito");
                    break;
                case 4:
                    System.out.println("\nFormato: " + Colors.ANSI_YELLOW + "nombre;marca;unidades;mantener fresco?;fecha;proveedor;precio; peso; origen; preparadoParaCocido" + Colors.ANSI_RESET);
                    String hortaliza = br.readLine();
                    String[] strHortaliza = hortaliza.split(";");
                    // String nombreProducto, String nombreMarca, int unidades, boolean conservarFresco, String fechaAdd, String proveedor, double precioPorKilo, double peso, String origen, boolean preparadoParaCocido
                    Producto productoHortaliza = new Hortaliza(strHortaliza[0], strHortaliza[1], Integer.parseInt(strHortaliza[2]), Boolean.parseBoolean(strHortaliza[3]), strHortaliza[4], strHortaliza[5], Double.parseDouble(strHortaliza[6]), Double.parseDouble(strHortaliza[7]), strHortaliza[8], Boolean.parseBoolean(strHortaliza[9]));
                    productos.add(productoHortaliza);
                    System.out.println("Añadido con éxito");
                    break;
                case 5:
                    System.out.println("\nFormato: " + Colors.ANSI_YELLOW + "nombre;marca;unidades;mantener fresco?;fecha;proveedor;precio; peso; origen" + Colors.ANSI_RESET);
                    String seta = br.readLine();
                    String[] strSeta = seta.split(";");
                    // nombreProducto, nombreMarca, unidades, conservarFresco, fechaAdd, proveedor, precioPorKilo, peso, origen 
                    Producto productoSeta = new Seta(strSeta[0], strSeta[1], Integer.parseInt(strSeta[2]), Boolean.parseBoolean(strSeta[3]), strSeta[4], strSeta[5], Double.parseDouble(strSeta[6]), Double.parseDouble(strSeta[7]), strSeta[8]);
                    productos.add(productoSeta);
                    System.out.println("Añadido con éxito");
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("Introduce numero 1-3");
                    break;
            }
        } while (salir == false);
    }

    public static void listarTodoProducto(ArrayList<Producto> productos) {
        System.out.println("");
        int count = 0;
        for (Producto elem : productos) {
            System.out.println(elem.toString());
            count++;
        }
        System.out.println(Colors.ANSI_YELLOW + "\nTotal productos: " + count + Colors.ANSI_RESET);
    }

    public static void listarPorTipoProducto(ArrayList<Producto> productos) throws IOException {
        String opt;
        int count = 0;
        boolean contiene = false;
        System.out.println("\n" + Colors.ANSI_CYAN + "// Que tipo de producto quieres listar?" + Colors.ANSI_RESET);
        Messages.inputData();
        opt = br.readLine().toLowerCase();

        System.out.println("");
        for (Producto elem : productos) {
            if (elem.toString().toLowerCase().contains(opt)) {
                System.out.println(elem.toString());
                contiene = true;
                count++;
            }
        }
        if (contiene == false) {
            System.out.println(Colors.ANSI_RED + "No existe ningun producto con ese nombre" + Colors.ANSI_RESET);
        } else {

            System.out.println(Colors.ANSI_YELLOW + "\nTotal productos: " + count + Colors.ANSI_RESET);
        }
    }

    public static void listarPorProveedor(ArrayList<Producto> productos) throws IOException {
        String opt;
        int count = 0;
        boolean contiene = false;
        System.out.println("\n" + Colors.ANSI_CYAN + "// De qué proveedor quieres ver sus productos? " + Colors.ANSI_RESET);
        Messages.inputData();
        opt = br.readLine().toLowerCase();

        System.out.println("");
        for (Producto elem : productos) {
            if (elem.getProveedor().toLowerCase().contains(opt)) {
                System.out.println(elem.toString());
                contiene = true;
                count++;
            }
        }
        if (contiene == false) {
            System.out.println(Colors.ANSI_RED + "No existe ningun producto con ese nombre" + Colors.ANSI_RESET);
        } else {

            System.out.println(Colors.ANSI_YELLOW + "\nTotal productos: " + count + Colors.ANSI_RESET);
        }

    }

    public static void borrarPorProveedor(ArrayList<Producto> productos) throws IOException {
        Producto auxProducto;
        String opt;
        boolean contiene = false;
        System.out.println("\n" + Colors.ANSI_CYAN + "// De qué proveedor quieres borrar los productos?" + Colors.ANSI_RESET);
        Messages.inputData();
        opt = br.readLine();

        for (int i = 0; i < productos.size(); i++) {
            auxProducto = productos.get(i);
            if (auxProducto.getProveedor().equalsIgnoreCase(opt)) {
                productos.remove(i);
                contiene = true;
                System.out.println("\nSe han eliminado todos los productos de " + Colors.ANSI_YELLOW + opt + Colors.ANSI_RESET);
            }
        }

        if (contiene == false) {
            System.out.println("\n" + Colors.ANSI_RED + "No existe ningun proveedor con ese nombre" + Colors.ANSI_RESET);
        }
    }

    public static void borrarPorNombre(ArrayList<Producto> productos) throws IOException {
        Producto auxProducto;
        String opt;
        boolean contiene = false;
        System.out.println("\n" + Colors.ANSI_CYAN + "// Qué producto quieres borrar?" + Colors.ANSI_RESET);
        Messages.inputData();
        opt = br.readLine();

        for (int i = 0; i < productos.size(); i++) {
            auxProducto = productos.get(i);
            if (auxProducto.getNombreProducto().equalsIgnoreCase(opt)) {
                productos.remove(i);
                contiene = true;
                System.out.println("\nSe ha eliminado el producto con nombre " + Colors.ANSI_YELLOW + opt + Colors.ANSI_RESET);
            }
        }

        if (contiene == false) {
            System.out.println("\n" + Colors.ANSI_RED + "No existe ningun producto con ese nombre" + Colors.ANSI_RESET);
        }

    }

    public static void editarCantidad(ArrayList<Producto> productos) throws IOException {
        
        String nombreProducto;
        int cantidad;
        boolean existe = false;
        
        System.out.println("\n" + Colors.ANSI_CYAN + "// Que producto quieres editar?" + Colors.ANSI_RESET);
        Messages.inputData(); 
        nombreProducto = br.readLine();
        
        System.out.println("");
        for (Producto elem : productos) {
            if (elem.getNombreProducto().equalsIgnoreCase(nombreProducto)) {
                existe = true;
                System.out.println(elem.toString());
                
                System.out.println("\n" + Colors.ANSI_CYAN + "// Introduce nuevo stock" + Colors.ANSI_RESET);
                Messages.inputData();
                cantidad = Integer.parseInt(br.readLine());
                
                elem.setUnidades(elem.getUnidades() + cantidad);
                
                System.out.println("\nNuevo sotck: " + Colors.ANSI_GREEN + elem.getUnidades() + Colors.ANSI_RESET);
            } 
        }
        if (existe == false) {
            System.out.println(Colors.ANSI_RED + "No existe ningun producto con ese nombre" + Colors.ANSI_RESET);
        }
    }

    public static void editarPrecio(ArrayList<Producto> productos) throws IOException {
        
        String nombreProducto;
        double precio;
        boolean existe = false;
        
        System.out.println("\n" + Colors.ANSI_CYAN + "// Que producto quieres editar?" + Colors.ANSI_RESET);
        Messages.inputData(); 
        nombreProducto = br.readLine();
        
        System.out.println("");
        for (Producto elem : productos) {
            if (elem.getNombreProducto().equalsIgnoreCase(nombreProducto)) {
                existe = true;
                System.out.println(elem.toString());
                
                System.out.println("\n" + Colors.ANSI_CYAN + "// Introduce nuevo precio" + Colors.ANSI_RESET);
                Messages.inputData();
                precio = Double.parseDouble(br.readLine());
                elem.setPrecio(precio);
                System.out.println("\nPrecio editado correctamente "+elem.getPrecio());
            } 
        }
        if (existe == false) {
            System.out.println(Colors.ANSI_RED + "No existe ningun producto con ese nombre" + Colors.ANSI_RESET);
        }
    }

    public static void editarProveedor(ArrayList<Producto> productos) throws IOException {
 
        String nombreProducto, proveedor;
        boolean existe = false;
        
        System.out.println("\n" + Colors.ANSI_CYAN + "// Que producto quieres editar?" + Colors.ANSI_RESET);
        Messages.inputData(); 
        nombreProducto = br.readLine();
        
        System.out.println("");
        for (Producto elem : productos) {
            if (elem.getNombreProducto().equalsIgnoreCase(nombreProducto)) {
                existe = true;
                
                System.out.println(elem.toString());
                
                System.out.println("\n" + Colors.ANSI_CYAN + "// Introduce nuevo nombre de proveedor" + Colors.ANSI_RESET);
                Messages.inputData();
                proveedor = br.readLine();
                
                elem.setProveedor(proveedor);
                
                System.out.println("\nProveedor editado correctamente");
            }
        }
        if (existe == false) {
            System.out.println(Colors.ANSI_RED + "No existe ningun producto con ese nombre" + Colors.ANSI_RESET);
        }
    }

}
