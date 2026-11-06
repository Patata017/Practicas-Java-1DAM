package Actividades;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Actividad5 {
    public static void main(String[] args) {
        
        //Creo el objeto scanner para leer los datos 
        Scanner sc = new Scanner(System.in);
        
        //Creo la variable para guardar el mayor
        int mayor;
        
        //Pido al usuario los dos números
        System.out.println("Introduzca el primer numero:");
        int a = sc.nextInt();
        System.out.println("Introduzca el segundo numero:");
        int b = sc.nextInt();
        
        //verifico cual es el mayor        
        if (a != b){
           if(a > b){
            mayor = a;
            //Muestro el resultado por pantalla
            System.out.println("El mayor es el primero: " + mayor);
           }else{
            mayor = b;
            //Muestro el resultado por pantalla
            System.out.println("El mayor es el segundo: " + mayor);
        }   
        }else{
            System.out.println("Los dos numeros son iguales");
        }   
    }
 
}
