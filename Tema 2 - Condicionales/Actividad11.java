package Actividades;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Actividad11 {
    public static void main(String[] args) {
        
        //Creo el objeto scanner para leer los datos 
        Scanner sc = new Scanner(System.in);
        
        //Pido al usuario que elija un número
        System.out.println("Elige un numero del 1 al 4:");
        int n = sc.nextInt();
        
        //Planteo las posibilidades con un switch y guardo los puntos
        int puntos = switch (n){           
            case 1 ->{
                yield 50;
            }
            case 2 ->{
                yield 100;
            }
            case 3 ->{
                yield 200;
            }
            case 4 ->{
                yield 0;
            }
            default ->{
                yield -1;
            }
        };
                //Uso if y else para decidir que mensaje se mostrara por pantalla
                if(puntos == 0){
                    System.out.println("Has perdido la partida");
                }else if(puntos == 50){
                    System.out.println("Has conseguido 50 puntos");                    
                }else if (puntos == 100){
                    System.out.println("Has conseguido 100 puntos");                    
                }else if (puntos == 200){
                    System.out.println("Has conseguido 200 puntos");
                }else{
                    System.out.println("Numero incorrecto");
                }
    }
}