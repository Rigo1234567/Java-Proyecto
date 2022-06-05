
package clases;

import java.io.Serializable;
import java.time.LocalDate;


public class csprestamovivienda extends cotizacion implements Serializable{
    
    private int metroscuadrados;

    public csprestamovivienda(int metroscuadrados, String identificacion, String nombre, String primerapellido, String segundoapellido, int edad, double ingresomensual, int identificacioncotizacion, LocalDate fechadecotizacion, int montoprestamo, int numeromesescancelar) {
        super(identificacion, nombre, primerapellido, segundoapellido, edad, ingresomensual, identificacioncotizacion, fechadecotizacion, montoprestamo, numeromesescancelar);
        this.metroscuadrados = metroscuadrados;
    }

    public int getMetroscuadrados() {
        return metroscuadrados;
    }

    public void setMetroscuadrados(int metroscuadrados) {
        this.metroscuadrados = metroscuadrados;
    }

    
    
    //funciones nuevas y funciones mejoradas
    
    @Override
      public double montocuotacadames(){
        // r = A*i/(1-1/(1+i)/n)
        double z,a;
        z=this.montoprestamo*0.0525/(1-1/(1+0.0525)/this.numeromesescancelar);
        
        a=(Math.round(z * 100d)/100d);
        
        return a; 
        
    }
    public double metroscuadrados(){
        double b=0;
        
        if (this.metroscuadrados>500){
             b=(this.metroscuadrados-500)*25;
             
        }
        
        return  (int) b;
        
        
    }
    
    @Override
    public String toString(){
        return identificacion+";"+nombre+";"+primerapellido+";"+segundoapellido+";"+edad+";"+ingresomensual;
    }
      
    
    
    public String aprobado_vivienda(){
          return  identificacion + ";" + nombre +";"+primerapellido+";"+segundoapellido+";"+edad+";"+ingresomensual+";"+"prestamo vivienda"+";"+(this.montocuotacadames() + this.metroscuadrados());
    }
      
      
          
    @Override
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
                + "tipo prestamo: " + "prestamo vivienda " +"\n"
                + "meses a cancelar: " + this.numeromesescancelar +"\n"
                + "cuota a pagar cada mes: " + this.montocuotacadames() +"\n"
                + "recargo por los metros cuadrados " + this.metroscuadrados() +"\n"
                + "total " + (this.montocuotacadames() + this.metroscuadrados()) + "\n"
                
                ;
    }
    
}
