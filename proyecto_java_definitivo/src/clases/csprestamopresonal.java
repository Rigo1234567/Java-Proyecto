
package clases;

import java.io.Serializable;
import java.time.LocalDate;

public class csprestamopresonal extends cotizacion implements Serializable {
    
    private int estadocliente;
    private int cantidadproductos;

    public csprestamopresonal(int estadocliente, int cantidadproductos, String identificacion, String nombre, String primerapellido, String segundoapellido, int edad, double ingresomensual, int identificacioncotizacion, LocalDate fechadecotizacion, int montoprestamo, int numeromesescancelar) {
        super(identificacion, nombre, primerapellido, segundoapellido, edad, ingresomensual, identificacioncotizacion, fechadecotizacion, montoprestamo, numeromesescancelar);
        this.estadocliente = estadocliente;
        this.cantidadproductos = cantidadproductos;
    }

    public int getEstadocliente() {
        return estadocliente;
    }

    public void setEstadocliente(int estadocliente) {
        this.estadocliente = estadocliente;
    }

    public int getCantidadproductos() {
        return cantidadproductos;
    }

    public void setCantidadproductos(int cantidadproductos) {
        this.cantidadproductos = cantidadproductos;
    }

    


    
    
    // metodos mejorados o nuevos
    
    
    @Override
    public double montocuotacadames(){
        // r = A*i/(1-1/(1+i)/n)
        double z,a;
        z=this.montoprestamo*0.31/(1-1/(1+0.31)/this.numeromesescancelar);
        
        a=(Math.round(z * 100d)/100d);
        
        return a; 
      }
    
      public double montocuota(){
        // r = A*i/(1-1/(1+i)/n)
        double z,a=0,c,d;
        
        if(this.cantidadproductos>=1 && this.cantidadproductos<=5){
            z=this.montoprestamo*0.31/(1-1/(1+0.31)/this.numeromesescancelar);
            d=z-0.01;
            a=(Math.round(d * 100d)/100d);
        }
        
         if(this.cantidadproductos>=6 ){
            z=this.montoprestamo*0.31/(1-1/(1+0.31)/this.numeromesescancelar);
            d=z-0.03;
            a=(Math.round(d * 100d)/100d);
        }
        
        //z=this.montoprestamo*0.31/(1-1/(1+0.31)/this.numeromesescancelar);
        
        //a=(Math.round(z * 100d)/100d);
        return a;
        
             
    }
      // funcion que genera la salida al usuario
      
      
    public String ver(){
        
        if(this.cantidadproductos>=1 && this.cantidadproductos<=5){
            return ""
                + "identificacion: " + this.identificacion +"\n"
                + "nombre: " + this.nombre +"\n"
                + "primer apellido: " + this.primerapellido +"\n"  
                + "segundo apellido: " + this.segundoapellido +"\n"
                + "edad: " + this.edad +"\n"
                + "indentificacion de cotizacion: " + this.identificacioncotizacion +"\n"
                + "fecha de cotizacion: " + this.fechadecotizacion +"\n"
                + "tipo prestamo: " + "prestamo personal " +"\n"
                + "monto de descuento: " + " 1% " +"\n"
                + "monto de prestamo: " + this.montoprestamo +"\n"
                + "meses a cancelar: " + this.numeromesescancelar +"\n"
                + "cuota a pagar cada mes: " + this.montocuota() +"\n"
                
                
                ;
        }
        
        if(this.cantidadproductos>=6 ){
            
            return ""
                + "identificacion: " + this.identificacion +"\n"
                + "nombre: " + this.nombre +"\n"
                + "primer apellido: " + this.primerapellido +"\n"  
                + "segundo apellido: " + this.segundoapellido +"\n"
                + "edad: " + this.edad +"\n"
                + "indentificacion de cotizacion: " + this.identificacioncotizacion +"\n"
                + "fecha de cotizacion: " + this.fechadecotizacion +"\n"
                + "tipo prestamo: " + "prestamo personal " +"\n"
                + "monto de descuento: " + " 3% " +"\n"
                + "monto de prestamo: " + this.montoprestamo +"\n"
                + "meses a cancelar: " + this.numeromesescancelar +"\n"
                + "cuota a pagar cada mes: " + this.montocuota() +"\n"
                
                
                ;
        }
        
        
        
        
        return null;
        
    }  
    
    
    public String most(){
        
            return ""
                + "identificacion: " + this.identificacion +"\n"
                + "nombre: " + this.nombre +"\n"
                + "primer apellido: " + this.primerapellido +"\n"  
                + "segundo apellido: " + this.segundoapellido +"\n"
                + "edad: " + this.edad +"\n"
                + "indentificacion de cotizacion: " + this.identificacioncotizacion +"\n"
                + "fecha de cotizacion: " + this.fechadecotizacion +"\n"
                + "tipo prestamo: " + "prestamo personal " +"\n"
                + "monto de descuento: " + " 0% " +"\n"
                + "monto de prestamo: " + this.montoprestamo +"\n"
                + "meses a cancelar: " + this.numeromesescancelar +"\n"
                + "cuota a pagar cada mes: " + this.montocuotacadames() +"\n"
                
                
                ;
        }
      
     public String aprobado_personal(){
        return  identificacion + ";" + nombre +";"+primerapellido+";"+segundoapellido+";"+edad+";"+ingresomensual+";"+"prestamo personal"+";"+ this.montocuotacadames();
    }
    
      @Override
    public String toString(){
         return identificacion+";"+nombre+";"+primerapellido+";"+segundoapellido+";"+edad+";"+ingresomensual;
    }
    
    
    
}
