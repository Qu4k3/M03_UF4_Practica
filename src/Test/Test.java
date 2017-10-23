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

import java.io.IOException;
import java.io.InputStreamReader;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    /**
     * @param args the command line arguments
     */
    static Scanner leerUsuario = new Scanner(System.in);
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws FileNotFoundException, IOException {

        // Código de testing para añadir contenido en el fichero
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
        }

        menuPrincipal(productos);

        br.close();
    }

    public static void menuPrincipal(ArrayList<Producto> productos) throws IOException {

        int option;
        boolean salir = false;

        do {
            System.out.println("\n" + Colors.ANSI_PURPLE + "----------MENU----------" + Colors.ANSI_RESET);
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
                    menuEditarDatos(productos);
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
                /*case 7:
                    for (Producto elem : productos) {
                        System.out.println(elem.toString());
                    }
                    break;*/
                default:
                    System.out.println("Introduce numero 1-6");
                    break;
            }

        } while (salir != true);

    }

    public static void menuAddDatos(ArrayList<Producto> productos) throws IOException {
        try {
            Funcions.addDatos(productos);
        } catch (Exception e) {
            System.out.println("\n" + Colors.ANSI_RED + "> Ha habido un error al intentar añadir datos" + Colors.ANSI_RESET);
            System.out.println(Colors.ANSI_RED + "> Verifica que lo has escrito en el formato correcto" + Colors.ANSI_RESET + "\n");

        }

    }

    public static void menuListar(ArrayList<Producto> productos) throws IOException {
        int option;
        boolean salir = false;

        do {
            System.out.println("\n" + Colors.ANSI_PURPLE + "-------VER/LISTAR-------" + Colors.ANSI_RESET);
            System.out.println("1. Listar todos los producto");
            System.out.println("2. listar por tipo");
            System.out.println("3. listar por proveedor");
            System.out.println("4. Volver");
            System.out.println("\n" + Colors.ANSI_CYAN + "// Que desea realizar?\n" + Colors.ANSI_RESET);
            System.out.print(Colors.ANSI_PURPLE + "> " + Colors.ANSI_RESET);
            option = leerUsuario.nextInt();

            switch (option) {
                case 1:
                    Funcions.listarTodoProducto(productos);
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
                    System.out.println("\n" + Colors.ANSI_RED + "Introduce numero 1-4" + Colors.ANSI_RESET);
                    break;
            }

        } while (salir == false);

    }

    public static void menuEditarDatos(ArrayList<Producto> productos) throws IOException {

        int option;
        boolean salir = false;

        do {
            System.out.println("\n" + Colors.ANSI_PURPLE + "--------EDITAR--------" + Colors.ANSI_RESET);
            System.out.println("1. Editar stock de producto");
            System.out.println("2. Editar precio del producto");
            System.out.println("3. Editar proveedor");
            System.out.println("4. Volver");
            System.out.println("\n" + Colors.ANSI_CYAN + "// Que desea realizar?\n" + Colors.ANSI_RESET);
            System.out.print(Colors.ANSI_PURPLE + "> " + Colors.ANSI_RESET);
            option = leerUsuario.nextInt();

            switch (option) {
                case 1:
                    Funcions.editarCantidad(productos);
                    break;
                case 2:
                    Funcions.editarPrecio(productos);
                    break;
                case 3:
                    Funcions.editarProveedor(productos);
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
            System.out.println("\n" + Colors.ANSI_PURPLE + "--------BORRAR--------" + Colors.ANSI_RESET);
            System.out.println("1. Borrar todos los productos");
            System.out.println("2. Borrar todos los productos de proveedor");
            System.out.println("3. Borrar producto por nombre");
            System.out.println("4. Volver");
            System.out.println("\n" + Colors.ANSI_CYAN + "// Que desea realizar?\n" + Colors.ANSI_RESET);
            System.out.print(Colors.ANSI_PURPLE + "> " + Colors.ANSI_RESET);
            opt = leerUsuario.nextInt();

            switch (opt) {
                case 1:
                    char secDelete;
                    Messages.deleteSec();
                    Messages.inputData();
                    secDelete = leerUsuario.next().charAt(0);

                    if (secDelete == 's') {
                        productos.removeAll(productos);
                        if (productos.isEmpty()) {
                            System.out.println("\n" + Colors.ANSI_BLUE_BACKGROUND + " Se han borrado todos los productos " + Colors.ANSI_RESET);
                        }
                    } else {
                        break;
                    }

                    break;
                case 2:
                    Funcions.borrarPorProveedor(productos);

                    break;
                case 3:
                    Funcions.borrarPorNombre(productos);

                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Introduce numero 1-3");
                    break;
            }

        } while (salir == false);

    }

    public static void menuVender(ArrayList<Producto> productos) throws IOException {

        int candidad;
        double precioFinal = 0;
        boolean contiene = false;
        boolean existe = true, quieroMas = true;
        String nombre, mas = null;
        System.out.println("\nContenido:\n-");
        for (Producto elem : productos) {
            System.out.println(elem.toString());
        }

        do {

            System.out.println("\n" + Colors.ANSI_CYAN + "// Introduce nombre del producto" + Colors.ANSI_RESET);
            Messages.inputData();
            nombre = br.readLine();

            for (Producto elem : productos) {

                if (elem.getNombreProducto().equalsIgnoreCase(nombre)) {
                    existe = true;
                    contiene = true;
                    System.out.println("\n" + Colors.ANSI_CYAN + "// Cuantos quieres comprar ?" + Colors.ANSI_RESET);
                    Messages.inputData();
                    candidad = Integer.parseInt(br.readLine());

                    if (candidad <= 0) {
                        System.out.println("\n" + Colors.ANSI_RED + "Solo se pueden ingresar cantidades positivas superiores a 0" + Colors.ANSI_RESET);
                    } else if (elem.getUnidades() >= candidad) {
                        elem.setUnidades(elem.getUnidades() - candidad);
                        contiene = true;

                        System.out.println("\nCoste actual: " + elem.totalPrecio(candidad));

                        precioFinal += elem.totalPrecio(candidad);
                        System.out.println("\n" + Colors.ANSI_CYAN + "// Quieres algo más?(s/n)" + Colors.ANSI_RESET);
                        Messages.inputData();
                        mas = br.readLine().toLowerCase();

                        switch (mas) {
                            case "s":
                                quieroMas = true;
                                break;
                            case "n":
                                quieroMas = false;

                                System.out.println("\nCoste total: " + Colors.ANSI_PURPLE_BACKGROUND + " " + precioFinal + " " + Colors.ANSI_RESET);

                                break;
                            default:
                                System.out.println(Colors.ANSI_RED + "\nIngresa letra s/n" + Colors.ANSI_RESET);
                                break;

                        }
                    } else if (elem.getUnidades() < candidad) {
                        System.out.println("\nNo existen tantas existencias del producto solicitado, stock: " + Colors.ANSI_GREEN + elem.getUnidades() + Colors.ANSI_RESET + " pedido: " + Colors.ANSI_RED + candidad + Colors.ANSI_RESET);
                    }

                }

            }

            if (contiene == false) {
                System.out.println("\n" + Colors.ANSI_RED + "No existe ningun producto con ese nombre" + Colors.ANSI_RESET);
            }
        } while (quieroMas != false);
    }

}
