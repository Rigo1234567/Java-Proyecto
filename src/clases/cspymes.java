
package clases;


import java.io.Serializable;
import java.time.LocalDate;

public class cspymes extends cotizacion implements Serializable{
    
    private int cantidadempleados;

    public cspymes(int cantidadempleados, String identificacion, String nombre, String primerapellido, String segundoapellido, int edad, double ingresomensual, int identificacioncotizacion, LocalDate fechadecotizacion, int montoprestamo, int numeromesescancelar) {
        super(identificacion, nombre, primerapellido, segundoapellido, edad, ingresomensual, identificacioncotizacion, fechadecotizacion, montoprestamo, numeromesescancelar);
        this.cantidadempleados = cantidadempleados;
    }

    public int getCantidadempleados() {
        return cantidadempleados;
    }

    public void setCantidadempleados(int cantidadempleados) {
        this.cantidadempleados = cantidadempleados;
    }
    
    
    
    
    @Override
    public double montocuotacadames(){
        // r = A*i/(1-1/(1+i)/n)
        double z,a;
        z=this.montoprestamo*0.08/(1-1/(1+0.08)/this.numeromesescancelar);
        
        a=(Math.round(z * 100d)/100d);
        
        return a; 
        
    }
    
    public double cantidadempleados(){
       double b=0;
        if (this.cantidadempleados>=1 && this.cantidadempleados<5){
             b = this.montocuotacadames()-0.02;
             b=(Math.round(b * 100d)/100d);
             
        }
        if (this.cantidadempleados>=5 && this.cantidadempleados<10){
             b = this.montocuotacadames()-0.03;
        }
        if (this.cantidadempleados>=10){
             b = this.montocuotacadames()-0.1;
        }
        
        return b;
        
    }
    
    @Override
    public String mostrar(){
        if (this.cantidadempleados>=1 && this.cantidadempleados<5){
         return ""
                + "identificacion: " + this.identificacion +"\n"
                + "nombre: " + this.nombre +"\n"
                + "edad: " + this.edad +"\n"
                + "indentificacion de cotizacion: " + this.identificacioncotizacion +"\n"
                + "fecha de cotizacion: " + this.fechadecotizacion +"\n"
                + "monto de prestamo: " + this.montoprestamo +"\n"
                + "tipo prestamo: " + "prestamo pymes " +"\n"
                + "monto de descuento: " + " 2% " +"\n"
                + "meses a cancelar: " + this.numeromesescancelar +"\n"
                + "cuota a pagar cada mes: " + this.cantidadempleados() +"\n"
                + "cantidad de empleados: " + this.cantidadempleados +"\n";
        }
        
         if (this.cantidadempleados>=5 && this.cantidadempleados<10){
         return ""
                + "identificacion: " + this.identificacion +"\n"
                + "nombre: " + this.nombre +"\n"
                + "edad: " + this.edad +"\n"
                + "indentificacion de cotizacion: " + this.identificacioncotizacion +"\n"
                + "fecha de cotizacion: " + this.fechadecotizacion +"\n"
                + "monto de prestamo: " + this.montoprestamo +"\n"
                + "tipo prestamo: " + "prestamo pymes " +"\n"
                + "monto de descuento: " + " 3% " +"\n"
                + "meses a cancelar: " + this.numeromesescancelar +"\n"
                + "cuota a pagar cada mes: " + this.cantidadempleados() +"\n"
                + "cantidad de empleados: " + this.cantidadempleados +"\n";
        }
        if (this.cantidadempleados>=10){
         return ""
                + "identificacion: " + this.identificacion +"\n"
                + "nombre: " + this.nombre +"\n"
                + "primer apellido: " + this.primerapellido +"\n"  
                + "segundo apellido: " + this.segundoapellido +"\n"
                + "edad: " + this.edad +"\n"
                + "indentificacion de cotizacion: " + this.identificacioncotizacion +"\n"
                + "fecha de cotizacion: " + this.fechadecotizacion +"\n"
                + "monto de prestamo: " + this.montoprestamo +"\n"
                + "tipo prestamo: " + "prestamo pymes " +"\n"
                + "monto de descuento: " + " 10% " +"\n"
                + "meses a cancelar: " + this.numeromesescancelar +"\n"
                + "cuota a pagar cada mes: " + this.cantidadempleados() +"\n"
                + "cantidad de empleados: " + this.cantidadempleados +"\n";
        }
        return null;
    
    
    
}
      public String aprobado_pymes(){
         return  identificacion + ";" + nombre +";"+primerapellido+";"+segundoapellido+";"+edad+";"+ingresomensual+";"+"prestamo pymes"+";"+ this.montocuotacadames();
    }
    
    
    
     @Override
    public String toString(){
        return identificacion+";"+nombre+";"+primerapellido+";"+segundoapellido+";"+edad+";"+ingresomensual;
    }
    
    
    
   
        
    
    
}    

