package Test;

import Modelo.*;

import static Utils.Funcions.*;
import static Utils.Menus.*;

import java.io.FileNotFoundException;

import java.io.IOException;

import java.util.ArrayList;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
            /*ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("productos.dat"));

            Producto vhe1 = new SinAlcohol("cola", "coca", 5, true, "15/12/2017", 1,"lata",true);


            oos.writeObject(vhe1);*/

            /*
            SinAlcohol
            nombreProducto, nombreMarca, unidades, conservarFresco, fechaAdd, precioPorUnidad, azucarada;
            */
        
        ArrayList<Producto> arrayProducto = addProductosDesdeArchivo();
        
        if (arrayProducto.isEmpty()) {
            System.out.println("No se han cargado los datos correctamente");
        } else {
            System.out.println("Datos cargados correctamente\n\nContenido:");
            for (Producto elem : arrayProducto) {
                System.out.println(elem.toString());
            }
            System.out.println("");
        }
        
        menuPrincipal();

    }


}
