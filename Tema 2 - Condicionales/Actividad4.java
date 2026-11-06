package Actividades;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Actividad4 {
    public static void main(String[] args) {
        
        //Creo el objeto scanner para leer los datos 
        Scanner sc = new Scanner(System.in);
        
        //Pido al usuario que introduzca un número
        System.out.println("Introduce un numero decimal:");
        double a = sc.nextDouble();
        
        //Planteo la condicion
        if(a == 0 || a >= 1 || a <= -1){
            //Muestro por pantalla el resultado
            System.out.println("El numero NO es casi-cero");
        }else
            //Muestro el otro resultado posible
            System.out.println("El numero SI es casi-cero");
    }
}
