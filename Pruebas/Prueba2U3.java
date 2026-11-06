package PaquetePruebas;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Prueba2U3 {
    public static void main(String[] args) {
        
        //Creo el objeto scanner para leer los datos 
        Scanner sc = new Scanner(System.in);
        
        int edad;
        int edadMax = 0;
        int edadMin = 0;
        int i = 1;
        
        //Pido la primera edad
        System.out.println("Introduce la primera edad:");
        edad = sc.nextInt();
        
        while(edad != -1){
            
            if(i == 1){
                edadMax = edad;
                edadMin = edad;
                
            }else if(edad > edadMax){
                edadMax = edad;
                
            }else if(edad < edadMin){
                edadMin = edad;
                
            }
        
            //Pido otra edad
            System.out.println("Introduce otra edad:");
            edad = sc.nextInt();
        
            i++; //Incremento el contador
        }
        if(i > 1){
            //Mostramos los resultados
            System.out.println("Edad max:" + edadMax);
            System.out.println("Edad min:" + edadMin);
        }else{
            System.out.println("No se a introducido ninguna edad");
        }
        
         
    }
}
