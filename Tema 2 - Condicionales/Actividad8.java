package Actividades;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Actividad8 {
    public static void main(String[] args) {
        
        //Creo el objeto scanner para leer los datos 
        Scanner sc = new Scanner(System.in);
        
        //Pido al usuario que ponga un número
        System.out.println("Introduce un numero entre 0 y 99999:");
        int n = sc.nextInt();
        
        //Verifico cuantas cifras tiene y muestro por pantalla el resultado
        if(n <= 9 && n >= 0){
            System.out.println("Tiene una cifra");
        }else if(n <= 99){
            System.out.println("Tiene dos cifras");
        }else if(n <= 999){
            System.out.println("Tiene tres cifras");
        }else if(n <= 9999){
            System.out.println("Tiene cuatro cifras");
        }else{
            System.out.println("Tiene cinco cifras");
        }
    }
}
