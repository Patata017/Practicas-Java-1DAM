package Actividades;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ActividadFinal4 {
    public static void main(String[] args) {
        
        //Creo el objeto escaner para leer los datos
        Scanner sc = new Scanner(System.in);
        
        //Pido los datos al usuario
        System.out.print("Introduce el dia: ");
        int dia = sc.nextInt();
        System.out.print("Introduce los mes (1-12): ");
        int mes = sc.nextInt();
        System.out.print("Introduce los año: ");
        int anio = sc.nextInt();
        
        //Determino cuantos dias tiene el mes introducido
        int diasDelMes = 0;
        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> diasDelMes = 31;
            case 4, 6, 9, 11 -> diasDelMes = 30;
            case 2 -> {
                //Cálculo si el año es bisiesto para febrero
                if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
                    diasDelMes = 29;
                } else {
                    diasDelMes = 28;
                }
            }
            default -> System.out.println("Mes incorrecto.");
        }
        
        //Sumo un día a la fecha actual
        dia++;
        
        //Compruebo los cambios de mes y año
        if (dia > diasDelMes) {
            dia = 1;
            mes++;
            
            if (mes > 12) {
                mes = 1;
                anio++;
            }
        }
        
        //Muestro por pantalla el resultado final
        System.out.println("La fecha del día siguiente es: " + dia + "/" + mes + "/" + anio);
    }
}