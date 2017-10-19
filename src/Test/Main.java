/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Modelo.Producto;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author paulg
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Producto.dat"));
        Vehiculo vhe1= new Coche("ABC123",5);
        Vehiculo vhe2= new Camion("ABC456",9);
        Vehiculo vhe3 = new Microbus("QWE123",6);
        
        oos.writeObject(vhe1);
        oos.writeObject(vhe2);
        oos.writeObject(vhe3);
        

        oos.close();*/
        
        
    }
        public static ArrayList<Producto> addVehiculosDesdeArchivo() throws IOException {
        ArrayList<Producto> coches = new ArrayList<>();
        FileInputStream fis = new FileInputStream("Producto.dat");
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
