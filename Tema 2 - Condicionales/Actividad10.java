package Actividades;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Actividad10 {
    public static void main(String[] args) {
        
        //Creo el objeto scanner para leer los datos 
        Scanner sc = new Scanner(System.in);
        
        //Pido al usuario que elija una puerta
        System.out.println("Elige unade las puertas del 1 al 4:");
        int n = sc.nextInt();
        
        //Planteo el switch con los mensajes
        switch (n){
            
            case 1 ->{
                System.out.println("Encuentras un tesoro");
            }
            
            case 2 ->{
                System.out.println("Aparece un dragon");
            }
            
            case 3 ->{
                System.out.println("Encuentras una pocion magica");
            }
            
            case 4 ->{
                System.out.println("Escapas de la mazmorra");
            }
            
            default ->{
                System.out.println("La puerta no existe");
            }
        }
    }
}
