package PaquetePruebas;

/**
 *
 * @author Usuario
 */
import java.time.*;

public class Prueba11 {
    public static void main(String[] args) {
       
        LocalDate fecha = LocalDate.now();
        
        System.out.println("Fecha: " + fecha);
        
        System.out.println("Año: " + fecha.getYear());
        
        System.out.println("Mes: " + fecha.getMonth());
        
        System.out.println("Número del mes: " +fecha.getMonthValue());
        
        System.out.println("Día: " + fecha.getDayOfMonth());
        
        System.out.println("Día de la semana: " + fecha.getDayOfWeek());
        
        System.out.println("Dentro de 10 días: " + fecha.plusDays(10));
        
        System.out.println("Hace un mes: " + fecha.minusMonths(1));
        
        System.out.println("¿Es bisiesto?: " + fecha.isLeapYear());    
    }
}
