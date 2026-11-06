package Actividades;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Actividad6 {
    public static void main(String[] args) {
        
        //Creo el objeto scanner para leer los datos 
        Scanner sc = new Scanner(System.in);
        
        //Creo las variables para ordenar los números
        int n1, n2, n3;
        
        //Pido al usuario los tres números
        System.out.println("Introduzca el primer numero:");
        int a = sc.nextInt();
        System.out.println("Introduzca el segundo numero:");
        int b = sc.nextInt();
        System.out.println("Introduzca el tercer numero:");
        int c = sc.nextInt();
        
        // Compruebo si a es el mayor
        if (a >= b && a >= c){
            n1 = a;
            if (b >= c){
                n2 = b; n3 = c; 
            }else { n2 = c; n3 = b; 
            }
        } 
        
        // Comprobo si b es el mayor
        else if (b >= a && b >= c){
            n1 = b;
            if (a >= c){ 
                n2 = a; n3 = c; 
            }else{ 
                n2 = c; n3 = a; 
            }
        }else{ // Si no es ni a ni b, c es el mayor
            n1 = c;
            if (a >= b){ 
                n2 = a; n3 = b; 
            }else{ 
                n2 = b; n3 = a; 
            }
        }       
        //Muestro por pantalla el resultado ordenado
        System.out.println("El resultado ordenado de mayor a menor es: " + n1 + " despues " + n2 + " y por ultimo " + n3);
    }
}
