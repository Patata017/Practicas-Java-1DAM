package Actividades;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Actividad3 {
    public static void main(String[] args) {
        
        //Creo el objeto scanner para leer los datos 
        Scanner sc = new Scanner(System.in);
        
        //Pido al usuario los dos número enteros distintos
        System.out.println("Introduce el primer numero entero:");
        int a = sc.nextInt();
        System.out.println("Introduce el segundo numero entero diferente al primero:");
        int b = sc.nextInt();
        
        //Hago la condicion
        if(a>b){
            //Muestro el resultado
            System.out.println("El numero mayor es a = " + a);
        }else{
            //Muestro el resultado
            System.out.println("El numero mayor es b = " + b);
        }
    }
}
