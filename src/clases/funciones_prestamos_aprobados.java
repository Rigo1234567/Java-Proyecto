
package clases;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.function.Predicate;

public class funciones_prestamos_aprobados {
    private static ArrayList<cotizacion> clientes_aprobados = new ArrayList();

    public static ArrayList<cotizacion> getClientes_aprobados() {
        return clientes_aprobados;
    }

    public static void setClientes_aprobados(ArrayList<cotizacion> clientes_aprobados) {
        funciones_prestamos_aprobados.clientes_aprobados = clientes_aprobados;
    }
    
    
    
    
    public static void GuardarClientes() {
        try {
            FileOutputStream file = new FileOutputStream("src/prestamos_aprobados.dat");
            ObjectOutputStream writer = new ObjectOutputStream(file);
            writer.writeObject(clientes_aprobados);
            writer.close();

        } catch (Exception e) {
            //nothing
        }
    }
    
    public static void AgregarClientes(cotizacion cliente) {
        clientes_aprobados.add(cliente);
        GuardarClientes();
    }
    
    
    
    public static void CargarClientes() {
        try {
            FileInputStream file = new FileInputStream("src/prestamos_aprobados.dat");
            ObjectInputStream reader = new ObjectInputStream(file);
            clientes_aprobados = (ArrayList<cotizacion>) reader.readObject();
            reader.close();

        } catch (Exception e) {
            //nothing
        }
    }
    
    
    public static void Eliminar(String id) {
        clientes_aprobados.removeIf(client -> client.getIdentificacion().equals(id));
        GuardarClientes();
    }
    
    public static cotizacion Obtenerlientes(String id) {
        return clientes_aprobados.stream().filter(cliente -> cliente.getIdentificacion().equals(id)).findFirst().get();
    }
    
    public static boolean BuscarClientes(String id) {
        return clientes_aprobados.stream().anyMatch(cliente -> cliente.getIdentificacion().equals(id));
    }
    
    //hace clon del archivo y remueve el viejo buscando los tipos de prestamos
     public static ArrayList<cotizacion> FiltrarAnuncios(Predicate<cotizacion> predicado) {
        ArrayList<cotizacion> copy = (ArrayList<cotizacion>)clientes_aprobados.clone();
        copy.removeIf(predicado);
        return copy;
    }
}
