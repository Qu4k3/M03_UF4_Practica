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
        Producto carne = new Carne("Pollo" , "Alitas de pollo", "Mercadona", 3, true, "15/12/2017", "proveedor-pollo", 1.2, false, 3.1);
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

    public static void menuAddDatos(ArrayList<Producto> productos) {

        int option;
        boolean salir = false;

        do {
            System.out.println("\n" + Colors.ANSI_CYAN + "// Ingresa el tipo de Producto que quieres introducir"
                    + Colors.ANSI_RESET + "\n(1) Bebida con alcohol\n(2) Bebida sin alcohol\n");
            option = leerUsuario.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Formato\n-\n" + Colors.ANSI_YELLOW + "nombre;marca;unidades;mantener fresco?;fecha;proveedor;precio" + Colors.ANSI_RESET);
                    String linea = leerUsuario.nextLine();
                    
                    String[] str = linea.split(";");
                    try {
                        Producto v = new ConAlcohol(str[0], str[1], Integer.parseInt(str[2]), Boolean.parseBoolean(str[3]), str[4], str[5], Double.parseDouble(str[6]), str[7]);
                        productos.add(v);
                    } catch (Exception e) {
                        System.out.println("\n" + Colors.ANSI_RED + "No se ha añadido producto correctamente" + Colors.ANSI_RESET);
                    }
                    

                    break;
                case 2:

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

}
