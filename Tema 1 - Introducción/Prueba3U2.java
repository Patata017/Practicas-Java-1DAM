package PaquetePruebas;

import java.util.*;

/**
 *
 * @author Usuario
 */
public class Prueba3U2 {
    public static void main(String[] args) {
        
        //Creo el objeto scanner para leer los datos 
        Scanner sc = new Scanner(System.in);
        
        //Solicito al usuario el primer numero
        System.out.println("Introduzca el primer numero");
        int a = sc.nextInt();
        
        //Solicito al usuario el segundo numero
        System.out.println("Introduzca el segundo numero");
        int b = sc.nextInt();
        
        int max = a > b ? a : b;
        
        //Mostramos por pantalla el valor del numero mayor 
        System.out.println("El maximo es: " + max);
    }
}
