package Actividades;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Actividades9 {
    public static void main(String[] args) {
        
        //Creo el objeto scanner para leer los datos 
        Scanner sc = new Scanner(System.in);
        
        //Pido al usuario un número
        System.out.println("Introduce un numero entre 1 y 7");
        int n = sc.nextInt();
        
        //Planteo el switch con los resultados
        switch (n){
            
            case 1 ->{
                System.out.println("Lunes");
            }
            
            case 2 ->{
                System.out.println("Martes");
            }
            
            case 3 ->{
                System.out.println("Miercoles");
            }
            
            case 4 ->{
                System.out.println("Jueves");
            }
            
            case 5 ->{
                System.out.println("Viernes");
            }
            
            case 6 ->{
                System.out.println("Sabado");
            }
            
            case 7 ->{
                System.out.println("Domingo");
            }
        }
    }
}
