package Actividades;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ActividadFinal1 {
    public static void main(String[] args) {
        
        //Creo el objeto scanner para leer los datos 
        Scanner sc = new Scanner(System.in);
        
        //Pido al usuario introduzca los datos
        System.out.println("Introduzca el aforo maximo:");
        int aforo = sc.nextInt();
        System.out.println("Introduzca el precio por entrada:");
        double precio = sc.nextDouble();
        System.out.println("Introduzca las entradas vendidas:");
        int vendidas = sc.nextInt();
        
        //Calculo cuanto es el 20% y el 50% del aforo
        int minAforo = (int)(aforo * 0.2);
        int mitadAforo = (int)(aforo * 0.5);
        
        
        //Planteo las posibles situaciones realistas y por último las imposibles
        if(vendidas <= minAforo){
            //Muestro por pantalla que el concierto se cancela
            System.out.println("Se cancela el concierto");    
            
        }else if(vendidas > minAforo && vendidas < mitadAforo){
            //Calculo cuantas se han vendido con precio rebajado 25%
            double recaudado = ((precio * 0.25) * vendidas);
            
        }else if(vendidas >minAforo){
            //Calculo cuantas se han vendido con precio estandar
            double recaudado = (precio * vendidas);
        }else{
            //Muestro por pantalla un mensaje de error
            System.out.println("Error");
        }
    }
}
