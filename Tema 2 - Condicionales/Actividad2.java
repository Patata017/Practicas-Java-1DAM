package Actividades;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Actividad2 {
    public static void main(String[] args) {
        
        //Creo el objeto scanner para leer los datos 
        Scanner sc = new Scanner(System.in);
        
        //Pido al usuario dos números
        System.out.println("Escriba el primer numero:");
        int a = sc.nextInt();
        System.out.println("Escriba el segundo numero:");
        int b = sc.nextInt();
        
        //Preparo la condicion
        if (a == b){
            //Muestro por pantalla el resultado true
            System.out.println("Los dos numeros son iguales");
        }else{
            //Muestro por pantalla el resultado false
            System.out.println("Los dos numeros son diferentes");
        }
    }
}
