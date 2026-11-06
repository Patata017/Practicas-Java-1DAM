package Actividades;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Actividad7 {
    public static void main(String[] args) {
        
        //Creo el objeto scanner para leer los datos 
        Scanner sc = new Scanner(System.in);
        
        //Creo las variables para las soluciones y el discriminante
        double s1, s2, dis;
        
        //Pido al usuario los tres números
        System.out.println("Introduzca el primer cociente (a):");
        double a = sc.nextDouble();
        System.out.println("Introduzca el segundo cociente (b):");
        double b = sc.nextDouble();
        System.out.println("Introduzca el tercer cociente (c):");
        double c = sc.nextDouble();
        
        //Calculo el discriminante
        dis = b * b -4 * a * c;
        
        //Muestro el resultado del discriminante
        System.out.println("Discriminante = " + dis);
        
        //Tengo en cuenta los posibles casos del discriminante
        
        if(a == 0){
            
            //Digo que no es una ec de 2º grado
            System.out.println("No es una ecuacion de segundo grado");
            
        }else if(dis > 0){
            
            //Calculo el primer resultado
            s1 = (-b + Math.sqrt(dis) / 2 * a);
            //Calculo el segundo resultado
            s2 = (-b - Math.sqrt(dis) / 2 * a);
            
            //Muestro las soluciones
            System.out.println("La primera solucion es: " + s1);
            System.out.println("La segunda solucion es: " + s2);
            
        }else if(dis == 0){
            
            //Calculo el primer resultado
            s1 = (-b + Math.sqrt(dis) / 2 * a);
            //Calculo el segundo resultado
            s2 = (-b - Math.sqrt(dis) / 2 * a);
            
            //Muestro las soluciones
            System.out.println("La primera solucion es: " + s1);
            System.out.println("La segunda solucion es: " + s2);
            
        }else if(dis < 0){
            
            //Muestro el resultado
            System.out.println("Sin soluciones reales");
        }
        
    }
}
