
package clases;

import java.io.Serializable;
import java.time.LocalDate;


public class cotizacion implements Serializable {
    protected String identificacion;
    protected String nombre;
    protected String primerapellido;
    protected String segundoapellido;
    protected int edad;
    protected double ingresomensual;
    protected int identificacioncotizacion;
    protected LocalDate fechadecotizacion;
    protected int montoprestamo;
    protected int numeromesescancelar;

    public cotizacion(String identificacion, String nombre, String primerapellido, String segundoapellido, int edad, double ingresomensual) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.primerapellido = primerapellido;
        this.segundoapellido = segundoapellido;
        this.edad = edad;
        this.ingresomensual = ingresomensual;
    }
    
    

    public cotizacion(String identificacion, String nombre, String primerapellido, String segundoapellido, int edad, double ingresomensual, int identificacioncotizacion, LocalDate fechadecotizacion, int montoprestamo, int numeromesescancelar) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.primerapellido = primerapellido;
        this.segundoapellido = segundoapellido;
        this.edad = edad;
        this.ingresomensual = ingresomensual;
        this.identificacioncotizacion = identificacioncotizacion;
        this.fechadecotizacion = fechadecotizacion;
        this.montoprestamo = montoprestamo;
        this.numeromesescancelar = numeromesescancelar;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerapellido() {
        return primerapellido;
    }

    public void setPrimerapellido(String primerapellido) {
        this.primerapellido = primerapellido;
    }

    public String getSegundoapellido() {
        return segundoapellido;
    }

    public void setSegundoapellido(String segundoapellido) {
        this.segundoapellido = segundoapellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getIngresomensual() {
        return ingresomensual;
    }

    public void setIngresomensual(double ingresomensual) {
        this.ingresomensual = ingresomensual;
    }

    public int getIdentificacioncotizacion() {
        return identificacioncotizacion;
    }

    public void setIdentificacioncotizacion(int identificacioncotizacion) {
        this.identificacioncotizacion = identificacioncotizacion;
    }

    public LocalDate getFechadecotizacion() {
        return fechadecotizacion;
    }

    public void setFechadecotizacion(LocalDate fechadecotizacion) {
        this.fechadecotizacion = fechadecotizacion;
    }

    public int getMontoprestamo() {
        return montoprestamo;
    }

    public void setMontoprestamo(int montoprestamo) {
        this.montoprestamo = montoprestamo;
    }

    public int getNumeromesescancelar() {
        return numeromesescancelar;
    }

    public void setNumeromesescancelar(int numeromesescancelar) {
        this.numeromesescancelar = numeromesescancelar;
    }
    
    
    

    
    
      

   
    
  
    
    
    
    
    public double montocuotacadames(){
        // r = A*i/(1-1/(1+i)/n)
        double z,a;
        z=this.montoprestamo*0.31/(1-1/(1+0.31)/this.numeromesescancelar);
        
        a=(Math.round(z * 100d)/100d);
        
        return a; 
        
    }
    
    public String mostrar(){
        
        return ""
                + "identificacion: " + this.identificacion +"\n"
                + "nombre: " + this.nombre +"\n"
                + "primer apellido: " + this.primerapellido +"\n"
                + "segundo apellido: " + this.segundoapellido +"\n"
                + "edad: " + this.edad +"\n"
                + "indentificacion de cotizacion: " + this.identificacioncotizacion +"\n"
                + "fecha de cotizacion: " + this.fechadecotizacion +"\n"
                + "monto de prestamo: " + this.montoprestamo +"\n"
                + "meses a cancelar: " + this.numeromesescancelar +"\n"
                + "cuota a pagar cada mes: " + this.montocuotacadames() +"\n"
                
                
                ;
    }
    
    
    
}
