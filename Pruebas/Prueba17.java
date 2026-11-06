
package PaquetePruebas;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;

public class Prueba17 {
    public static void main(String[] args) {
        
        //Creo el objeto scanner para leer los datos 
        Scanner sc = new Scanner(System.in);
        
        //Digo al usuario que introduzca su nota
        System.out.println("Introduce tu nota 0/10: ");
        
        //Leemos la nota introducida 
        int nota = sc.nextInt();
        
        /* Comprobamos si la nota es mayor o menor que 5
           Si cumple el resultado sera "Aprobado"
           Si no cumple sera "Suspenso"
        */
        String resultado = (nota >=5) ? "Aprobado" : "Suspenso";
        
        //Muestro por pantalla el resultado
        System.out.println(resultado);
    }
 
}
