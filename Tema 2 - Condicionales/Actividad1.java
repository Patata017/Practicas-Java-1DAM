package Actividades;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Actividad1 {
    public static void main(String[] args) {
        //Creo el objeto scanner para leer los datos 
        Scanner sc = new Scanner(System.in);
        
        //Pido al usuario que introduzca la temperatura
        System.out.println("Introduzca la temperatura: ");
        double  temp = sc.nextDouble();
        
        if (temp > 30){
            System.out.println("Hace mucho calor");
        }
    }
}
