
package PaquetePruebas;

/**
 *
 * @author Usuario
 */

import java.util.Scanner;

public class Prueba16 {
    public static void main(String[] args) {
        
        //Creo el objeto Scanner para leer datos del teclado
        Scanner sc = new Scanner(System.in);
        
        //Pedir al usuario que indique si tiene permisos de admin
        System.out.println("¿Tienes permisos de admin? true/false");
        
        //Guardar la respuesta en una variable booleana
        boolean esAdmin = sc.nextBoolean();
        
        //Mostrar el valor contrario
        System.out.println("¿No es admin? " + !esAdmin);
    }
}
