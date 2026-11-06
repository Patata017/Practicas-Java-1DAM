
package PaquetePruebas;

/**
 *
 * @author Usuario
 */

import java.util.Scanner;

public class Prueba15 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        //Declaramos las variables
        boolean consola;
        boolean ordenador;
        boolean puedeJugar;
        
        //Preguntamos si tiene consola
        System.out.println("¿Tienes consola? true/false");
        consola = teclado.nextBoolean();
        
        //Preguntamos si tiene ordenador
        System.out.println("¿Tienes ordenador? true/false");
        ordenador = teclado.nextBoolean();
        
        //Comprobamos si tiene alguno de los dos
        puedeJugar = consola || ordenador;
        
        //Mostramos el resultado
        System.out.println("¿Puedes jugar? " + puedeJugar);
    }
}
