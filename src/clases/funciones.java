
package clases;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class funciones {
    
    
    private static ArrayList<cotizacion> clientes = new ArrayList();

    public static ArrayList<cotizacion> getClientes() {
        return clientes;
    }

    public static void setClientes(ArrayList<cotizacion> clientes) {
        funciones.clientes = clientes;
    }
   
    
               
            
            public static void GuardarClientes() {
        try {
            FileOutputStream file = new FileOutputStream("src/clientes.dat");
            ObjectOutputStream writer = new ObjectOutputStream(file);
            writer.writeObject(clientes);
            writer.close();

        } catch (Exception e) {
            //nothing
        }
    }
            
            
            
            
            public static void Actualizar(cotizacion cliente) {
        for (int i = 0; i < clientes.size(); i++) {
            if(clientes.get(i).getIdentificacion().equals(cliente.getIdentificacion())){
                clientes.set(i, cliente);
            }
        }
        GuardarClientes();
    }
            
          
        
        
        
        public static void CargarClientes() {
        try {
            FileInputStream file = new FileInputStream("src/clientes.dat");
            ObjectInputStream reader = new ObjectInputStream(file);
            clientes = (ArrayList<cotizacion>) reader.readObject();
            reader.close();

        } catch (Exception e) {
            //nothing
        }
    }
        
        public static cotizacion Obtenerlientes(String id) {
        return clientes.stream().filter(cliente -> cliente.getIdentificacion().equals(id)).findFirst().get();
    }
        
        public static void AgregarClientes(cotizacion cliente) {
        clientes.add(cliente);
        GuardarClientes();
    }
        
        public static void Eliminar(String id) {
        clientes.removeIf(client -> client.getIdentificacion().equals(id));
        GuardarClientes();
    }
        
    public static boolean BuscarClientes(String id) {
        return clientes.stream().anyMatch(cliente -> cliente.getIdentificacion().equals(id));
    }
}

