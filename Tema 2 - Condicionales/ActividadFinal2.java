package Actividades;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ActividadFinal2 {
    public static void main(String[] args) {
        
        //Creo el objeto escaner para leer los datos
        Scanner sc = new Scanner(System.in);
        
        // Solicitar los valores al usuario
        System.out.println("Introduce la comida diaria comprada (en kg): ");
        double comidaDiaria = sc.nextDouble();
        
        System.out.println("Introduce el número de animales: ");
        int numAnimales = sc.nextInt();
        
        System.out.println("Introduce los kilos que come cada animal: ");
        double kilosPorAnimal = sc.nextDouble();
        
        //Evito que se divida por cero
        if (numAnimales == 0) {
            System.out.println("No hay animales en la granja, no se puede calcular la ración.");
        } else {
            //Calcular la comida total necesaria
            double comidaNecesaria = numAnimales * kilosPorAnimal;
            
            //Determino si hay alimento suficiente
            if (comidaDiaria >= comidaNecesaria) {
                System.out.println("Disponemos de alimento suficiente para cada animal.");
            } else {
                //En caso negativo, calculo la nueva ración equitativa
                double nuevaRacion = comidaDiaria / numAnimales;
                System.out.println("No hay alimento suficiente.");
                System.out.println("La ración ajustada para cada animal es de: " + nuevaRacion + " kg.");
            }
        }
    }
}
