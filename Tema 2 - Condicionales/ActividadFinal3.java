package Actividades;

import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class ActividadFinal3 {
    public static void main(String[] args) {
        
        //Creo el objeto escaner para leer los datos
        Scanner sc = new Scanner(System.in);
        
        //Pido los datos al usuario
        System.out.print("Introduce la hora (0-23): ");
        int horas = sc.nextInt();
        System.out.print("Introduce los minutos (0-59): ");
        int minutos = sc.nextInt();
        System.out.print("Introduce los segundos (0-59): ");
        int segundos = sc.nextInt();
        
        //Sumo un segundo a la hora actual
        segundos++;
        
        //Uso if para que si llegan al maximo las variables se reseteen y lleven una a la siguiente variable
        if (segundos == 60) {
            segundos = 0;
            minutos++;
            
            if (minutos == 60) {
                minutos = 0;
                horas++;
                
                if (horas == 24) {
                    horas = 0;
                }
            }
        }
        
        //Uso operadorer ternarios para poner los 0 a la izquierda si es necesario
        String strHoras = (horas < 10) ? "0" + horas : "" + horas;
        String strMinutos = (minutos < 10) ? "0" + minutos : "" + minutos;
        String strSegundos = (segundos < 10) ? "0" + segundos : "" + segundos;
        
        //Muestro el resultado concatenando las cadenas estándar
        System.out.println("Hora actual +1 segundo: [" + strHoras + ":" + strMinutos + ":" + strSegundos + "]");
    }
}