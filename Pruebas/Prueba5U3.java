package PaquetePruebas;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Prueba5U3 {
    public static void main(String[] args) {
        
        //Creo el objeto escaner para leer los datos
        Scanner sc = new Scanner(System.in);
        
        //Variable donde se almacena la contraseña introducida
        int contrasena;
        
        //El bloque do se ejecuta al menos una vez
        do{
            
            //Pedimos al usuario que introduzca la contraseña
            System.out.println("Introduce la contraseña (1234)");
            
            //Leemos la contraseña introducida por teclado
            contrasena = sc.nextInt();
        }
        while(contrasena != 1234);
        
        //Si hemos salido del bucle
        System.out.println("Contraseña correcta");
    }
}
