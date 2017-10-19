/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import Modelo.Producto;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author HangjieHuang
 */
public class Funcion {
    public static void addDatos(ArrayList<Producto> producto) throws FileNotFoundException, IOException{
        BufferedReader br = new BufferedReader(new FileReader("productos.dat"));
        
        try {
            Producto auxProducto;
            String dato = br.readLine();
            for (int i = 0; dato != null; i++) {

                String[] datosCompleto = dato.split(",");
                //auxProducto = new Producto(datosCompleto[0], datosCompleto[1], datosCompleto[2], datosCompleto[3], Integer.parseInt(datosCompleto[4]));
                //producto.add(auxProducto);
                dato = br.readLine();

            }
            System.out.println("Datos cargado");

            for (int i = 0; i < producto.size(); i++) {
                auxProducto = producto.get(i);
                System.out.println(auxProducto.toString());
            }
            br.close();
        } catch (NumberFormatException e) {
            System.out.println("error formato de datos");
        }
        
        
    }
    
}
