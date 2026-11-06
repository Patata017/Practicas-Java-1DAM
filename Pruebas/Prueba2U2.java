package PaquetePruebas;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Prueba2U2 {
    public static void main(String[] args) {
        
        //Creo el objeto scanner para leer los datos 
        Scanner sc = new Scanner(System.in);
        
        //Variable a
        int a = 32;
        
        //Condicional
        if (a >= 18){
            //Muestro condicion verdadera
            System.out.println("Puedes pasar");
        }else{
            System.out.println("No puedes pasar");
        }
    }
}
