
package PaquetePruebas;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;

public class Prueba14 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        //Declaramos las variables
        int edad;
        boolean entrada;
        boolean puedeEntrar;
        
        
       //Pedimos la edad
        System.out.println("¿Que edad tienes? ");
        edad = teclado.nextInt();
        
        //Preguntamos si tiene entrada
        System.out.println("¿Tienes entrada? true/false ");
        entrada = teclado.nextBoolean();
        
        //Comprobamos las dos condiciones
        puedeEntrar = edad > 12 && entrada;
        
        //Mostramos el resultado
        System.out.println("¿Puedes entrar? " + puedeEntrar);
    }
}
