package Utils;

import Modelo.Producto;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Funcions {

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


            /*ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("productos.dat"));

            Producto vhe1 = new SinAlcohol("cola", "coca", 5, true, "15/12/2017", 1,"lata",true);


            oos.writeObject(vhe1);*/

            /*
            SinAlcohol
            nombreProducto, nombreMarca, unidades, conservarFresco, fechaAdd, precioPorUnidad, azucarada;



            */

        }

    


}
