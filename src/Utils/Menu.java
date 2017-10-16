/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.util.Scanner;

/**
 *
 * @author HangjieHuang
 */
public class Menu {

    static Scanner leerUsuario = new Scanner(System.in);

    public static void menuPrincipal() {

        int option;
        boolean salir = false;

        do {
            System.out.println("----------MENU----------");
            System.out.println("1. Carga datos de inicio");
            System.out.println("2. Añadir productos");
            System.out.println("3. Ver/listar productos");
            System.out.println("4. Editar productos");
            System.out.println("5. Borrar datos");
            System.out.println("6. Vender");
            System.out.println("7. Salir");

            option = leerUsuario.nextInt();

            switch (option) {
                case 1:
                    menuAddDatos();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:
                    salir = true;

                    break;
                default:
                    System.out.println("Introduce numero 1-7");
                    break;
            }

        } while (salir == false);

    }

    public static void menuAddDatos() {

        int option;
        boolean salir = false;

        do {
            System.out.println("1. Añadir producto");
            System.out.println("2. Añadir proveedore");
            System.out.println("3. Volver");
            option = leerUsuario.nextInt();

            switch (option) {
                case 1:

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

    public static void menuListar() {

        int option;
        boolean salir = false;

        do {
            System.out.println("1. Listar todos los producto");
            System.out.println("2. listar por tipo");
            System.out.println("3. listar todos los proveedores");
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

    public static void menuEditarDatos() {

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

    public static void menuBorrarDatos() {

        int option;
        boolean salir = false;

        do {
            System.out.println("1. Borrar todos los productos");
            System.out.println("2. Borrar por tipo de producto");
            System.out.println("3. Borrar por nombre de producto");
            System.out.println("4. Borrar proveedor por nombre");
            System.out.println("5. Salir");
            option = leerUsuario.nextInt();

            switch (option) {
                case 1:

                    break;
                case 2:

                    break;

                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Introduce numero 1-4");
                    break;
            }

        } while (salir == false);
        
    }
    
    
}
