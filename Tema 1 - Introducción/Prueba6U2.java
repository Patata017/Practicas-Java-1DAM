package PaquetePruebas;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Prueba6U2 {
    public static void main(String[] args) {
        
        //Creo el objeto scanner para leer los datos 
        Scanner sc = new Scanner(System.in);
        
        int nota;
        
        System.out.println("Introduce tu nota del 1 al 10:");
        nota = sc.nextInt();
        
        switch (nota){
            
            case 0,1,2,3,4 -> {
                System.out.println("Suspenso");
                System.out.println("Animo");
            }
            
            case 5 -> {
                System.out.println("Suficiente");
            }
            
            case 6 -> {
                System.out.println("Bien");
            }
            
            case 7, 8 -> {
                System.out.println("Notable");
            }
            
            case 9, 10 -> {
                System.out.println("Sobresaliente");
                System.out.println("Enorabuena");
            }
            
            default -> {
                System.out.println("Nota incorrecta");
            }
            
        }
    }
}
