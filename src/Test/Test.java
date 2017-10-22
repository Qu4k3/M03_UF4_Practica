package Test;

import Modelo.Producto;
import Modelo.bebida.ConAlcohol;
import Modelo.bebida.SinAlcohol;
import Modelo.carne.Carne;
import Modelo.verdura.Hortaliza;
import Modelo.verdura.Seta;
import Utils.Colors;
import Utils.Funcions;

import Utils.Messages;
import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    /**
     * @param args the command line arguments
     */
    static Scanner leerUsuario = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException, IOException {
        /*
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("productos.dat"));

        Producto bebidaSinAlcohol = new SinAlcohol("cola", "coca", 5, true, "15/12/2017", "cocacola", 1, "lata", true);
        Producto bebidaConAlcohol = new ConAlcohol("vino blanco", "perro verde", 6, false, "15/12/2017", "vino perro", 5, "vidrio");
        Producto carne = new Carne( "Alitas de pollo", "Mercadona", 3, true, "15/12/2017", "proveedor-pollo", 1.2, false, 3.1,"pollo");

        Producto verduraHortaliza = new Hortaliza("repollo", "repo-vetdura", 10, true, "15/12/2017", "proveedor-repo", 0.3, 0.8, "España", false);
        Producto verduraSeta = new Seta("mushrooms", "seta-vetdura", 12, true, "15/12/2017", "proveedor-seta", 0.3, 0.5, "España");

        oos.writeObject(bebidaSinAlcohol);
        oos.writeObject(bebidaConAlcohol);
        oos.writeObject(carne);
        oos.writeObject(verduraHortaliza);
        oos.writeObject(verduraSeta);
         */

 /*
            SinAlcohol
            nombreProducto, nombreMarca, unidades, conservarFresco, fechaAdd, proveedor, precioPorUnidad, formato, azucarada;
            ConAlcohol
            nombreProducto, nombreMarca, unidades, conservarFresco, fechaAdd, proveedor, precioPorUnidad, formato
            Carne
            animal, nombreProducto, nombreMarca, unidades, conservarFresco, fechaAdd, proveedor, precioPorKilo, adobado, peso;
            Hortaliza
            nombreProducto, nombreMarca, unidades, conservarFresco, fechaAdd, proveedor, precioPorKilo, peso, origen, preparadoParaCocido;
            Seta
            nombreProducto, nombreMarca, unidades, conservarFresco, fechaAdd, proveedor, precioPorKilo, peso, origen
         */
        ArrayList<Producto> productos = Funcions.addProductosDesdeArchivo();

        if (productos.isEmpty()) {
            System.out.println("No se han cargado los datos correctamente");
        } else {
            System.out.println(Colors.ANSI_GREEN_BACKGROUND + " Datos cargados correctamente " + Colors.ANSI_RESET + "\n\nContenido:\n-");
            for (Producto elem : productos) {
                System.out.println(elem.toString());
            }
            System.out.println("");
        }

        menuPrincipal(productos);

    }

    public static void menuPrincipal(ArrayList<Producto> productos) throws IOException {

        int option;
        boolean salir = false;

        do {
            System.out.println(Colors.ANSI_PURPLE + "----------MENU----------" + Colors.ANSI_RESET);
            System.out.println("1. Añadir productos");
            System.out.println("2. Ver/listar productos");
            System.out.println("3. Editar productos");
            System.out.println("4. Borrar datos");
            System.out.println("5. Vender");
            System.out.println("6. Salir");
            System.out.println("\n" + Colors.ANSI_CYAN + "// Que desea realizar?\n" + Colors.ANSI_RESET);
            System.out.print(Colors.ANSI_PURPLE + "> " + Colors.ANSI_RESET);

            option = leerUsuario.nextInt();

            switch (option) {
                case 1:
                    menuAddDatos(productos);
                    break;
                case 2:
                    menuListar(productos);
                    break;
                case 3:
                    //menuEditarDatos(productos);
                    break;
                case 4:
                    menuBorrarDatos(productos);
                    break;
                case 5:
                    menuVender(productos);
                    break;
                case 6:

                    char secExit;
                    Messages.exitSec();
                    secExit = leerUsuario.next().charAt(0);

                    if (secExit == 's') {
                        salir = true;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    for (Producto elem : productos) {
                        System.out.println(elem.toString());
                    }
                    break;
                default:
                    System.out.println("Introduce numero 1-6");
                    break;
            }

        } while (salir != true);

    }

    public static void menuAddDatos(ArrayList<Producto> productos) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int option;
        boolean salir = false;

        do {
            System.out.println("\n" + Colors.ANSI_CYAN + "// Ingresa el tipo de Producto que quieres introducir"
                    + Colors.ANSI_RESET + "\n(1) Bebida sin alcohol\n(2) Bebida con alcohol\n(3) Carne\n(4) Verdura hortaliza\n(5) Verdura seta");
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

    public static void menuListar(ArrayList<Producto> productos) throws IOException {
        int option;
        boolean salir = false;

        do {
            System.out.println("1. Listar todos los producto");
            System.out.println("2. listar por tipo");
            System.out.println("3. listar por proveedor");
            System.out.println("4. Volver");
            option = leerUsuario.nextInt();

            switch (option) {
                case 1:
                    Funcions.listarTotoProducto(productos);

                    break;
                case 2:
                    Funcions.listarPorTipoProducto(productos);
                    break;

                case 3:
                    Funcions.listarPorProveedor(productos);
                    break;
                case 4:
                    salir = true;

                    break;
                default:
                    System.out.println("Introduce numero 1-4");
                    break;
            }

        } while (salir == false);

    }

    public static void menuEditarDatos(ArrayList<Producto> productos) {

        int option;
        boolean salir = false;

        do {
            System.out.println("1. Editar candidad de producto");
            System.out.println("2. Editar precio del producto");
            System.out.println("3. Editar proveedor");
            System.out.println("4. Volver");
            option = leerUsuario.nextInt();

            switch (option) {
                case 1:

                    break;
                case 2:

                    break;

                case 3:

                    break;
                case 4:
                    salir = true;

                    break;
                default:
                    System.out.println("Introduce numero 1-4");
                    break;
            }

        } while (salir == false);

    }

    public static void menuBorrarDatos(ArrayList<Producto> productos) throws IOException {

        int opt;
        boolean salir = false;

        do {

            System.out.println("1. Borrar todos los productos");
            System.out.println("2. Borrar por proveedor");
            System.out.println("3. Salir");
            opt = leerUsuario.nextInt();

            switch (opt) {
                case 1:
                    productos.removeAll(productos);
                    if (productos.isEmpty()) {
                        System.out.println("Borrado todos productos");
                    }

                    break;
                case 2:
                    //ERROR: solo funcion con proveedor-repo
                    Funcions.borrarPorproveedor(productos);

                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Introduce numero 1-3");
                    break;
            }

        } while (salir == false);

    }

    public static void menuVender(ArrayList<Producto> productos) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int candidad;
        double precioFinal = 0;
        boolean existe = true, quieroMas = true;
        String nombre, mas = null;
        for (Producto elem : productos) {
            System.out.println(elem.toString());
        }
        for (int i = 0; i < productos.size() && quieroMas == true; i++) {
            System.out.println("Introduce la nombre del producto.");
            nombre = br.readLine();

            for (Producto elem : productos) {

                if (elem.getNombreProducto().equalsIgnoreCase(nombre)) {
                    existe = true;
                    System.out.println("Introduce cantidad de comprar");
                    candidad = Integer.parseInt(br.readLine());
                    if (candidad <= 0) {
                        System.out.println("El cantidad de comprar tiene que mayor que 0");
                    } else if (elem.getUnidades() >= candidad) {
                        elem.setUnidades(elem.getUnidades() - candidad);
                        System.out.println("El precio es: " + elem.totalPrecio(candidad));
                        precioFinal += elem.totalPrecio(candidad);
                        System.out.println("Quieres algo más?(s/n)");
                        mas = br.readLine().toLowerCase();

                        switch (mas) {
                            case "s":
                                quieroMas = true;
                                break;
                            case "n":
                                quieroMas = false;

                                System.out.println("El precio total es: " + precioFinal);

                                break;
                            default:
                                System.out.println("s/n");
                                break;

                        }
                    } else if (elem.getUnidades() < candidad) {
                        System.out.println("el producto no tiene cantidad de " + candidad);
                    }

                }

            }

        }
    }
}
