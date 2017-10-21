package Test;

import Modelo.Producto;
import Modelo.bebida.SinAlcohol;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        ArrayList<Producto> arrayProducto = addVehiculosDesdeArchivo();
        for (Producto elem : arrayProducto) {
            System.out.println(elem.toString());
        }
        
        /*ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("productos.dat"));
        Producto vhe1 = new SinAlcohol("cola", "coca", 5, true, "15/12/2017", 1,"lata",true);
        
        

        oos.writeObject(vhe1);*/

        //nombreProducto, nombreMarca, unidades, conservarFresco, fechaAdd, precioPorUnidad, azucarada;
        

    }

    public static ArrayList<Producto> addVehiculosDesdeArchivo() throws IOException {
        ArrayList<Producto> coches = new ArrayList<>();
        FileInputStream fis = new FileInputStream("productos.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        try {
            while (true) {
                Producto auxVehiculo = (Producto) ois.readObject();
                coches.add(auxVehiculo);
            }
        } catch (EOFException e) {
            ois.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return coches;
    }
}
