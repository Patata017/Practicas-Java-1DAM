package PaquetePruebas;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Prueba5U2 {
    public static void main(String[] args) {
        
        //Creo el objeto scanner para leer los datos 
        Scanner sc = new Scanner(System.in);
        
        //Pregunto al usuario su edad
        System.out.println("Introduzca su edad:");
        int edad = sc.nextInt();
        
        //Pregunto si tiene entrada válida
        System.out.println("¿Tienes entrada valida? true/false");
        boolean ent = sc.nextBoolean();
        
        //Pregunto si tiene autorizacion
        System.out.println("¿Tienes autorizacion de tus padres? true/false");
        boolean aut = sc.nextBoolean();
        
        //Pregunto por su altura en cm
        System.out.println("Introduce tu altura en cm:");
        int alt = sc.nextInt();
        
        //Planteo los condicionales anidados
        if (ent){
            if (edad < 12){
                if (aut){
                    if(alt >=120){
                        System.out.println("Puede disfrutar la atraccion");
                    }else{
                        //Si mide menos de 120cm
                        System.out.println("No tienes la altura minima");
                     }  
                    
                }else{ //Sin autorizacion
                    System.out.println("No tienes autorizacion de tus padres");
                 }
            
            //Si tiene más de 12 años     
            }else{  
                if(alt >=120){
                    System.out.println("Puedes disfrutar la atraccion");
                }else{ //No mide 120cm o más
                    System.out.println("No llegas a la altura minima");
                }
            }   
        }else{
            System.out.println("No tiene entrada valida");
        }
    }
}