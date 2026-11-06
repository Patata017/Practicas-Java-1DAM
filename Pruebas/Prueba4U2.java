package PaquetePruebas;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Prueba4U2 {
    public static void main(String[] args) {
        
        //Creo el objeto scanner para leer los datos 
        Scanner sc = new Scanner(System.in);
        
        //Declaro las variable
        int n1, n2;
        
        //Declaro las variables para menor y mayor
        int mayor, menor;
        
        //Pido al usuario los dos números
        System.out.println("Introduzca el primer numero:");
        n1 = sc.nextInt();
        System.out.println("Introduzca el segundo numero");
        n2 = sc.nextInt();
        
        //Utilizo el operador ternario para obtener el mayor
        mayor = n1 >n2 ? n1 : n2;
        //Utilizo el operador ternario para obtener el menor
        menor = n1 < n2 ? n1 : n2;
        
        //Introduzco el resultado
        System.out.println(mayor +", " + menor);
    }
}
