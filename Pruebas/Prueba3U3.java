package PaquetePruebas;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Prueba3U3 {
    public static void main(String[] args) {
        
        //Creo el objeto scanner para leer los datos 
        Scanner sc = new Scanner(System.in);
        
        //Pido los alumnos totales
        System.out.println("Escribe el total de alumnos:");
        int numAlumnos = sc.nextInt();
        
        //Variable para guardar la edad
        int edad;
        
        //Variables de max y min de edad
        int edadMax = 0, edadMin = 0;
        
        //Contador
        int i = 1;
        
        //Bucle que repetira tantas veces como alumnos
        while(i <= numAlumnos){
            
            //Pido la edad del alumno actual
            System.out.println("Edad del alumno"+i+": ");
            edad = sc.nextInt();
            
            if(i == 1){
                //Como no tenemos referencia:
                edadMax = edad;
                edadMin = edad;
                
            }else if(edad > edadMax){
                edadMax = edad;
                
            }else if(edad < edadMin){
                edadMin = edad;
            }
            //Paso al siguiente alumno
            i++;
        }
        //Muestro los resultados
        System.out.println("La edad Max es: "+edadMax);
        System.out.println("La edad Min es: "+edadMin);
    }
}
