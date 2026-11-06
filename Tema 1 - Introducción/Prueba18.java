
package PaquetePruebas;

/**
 *
 * @author Usuario
 */
public class Prueba18 {
    public static void main(String[] args) {
        
        //Declaro una constante para pi
        final double pi = Math.PI;
        
        //Declaro las variables
        double radio = 2.0;
        double altura = 3.0;
        
        //Calculo el area del cilindro
        double area = 2 * pi * radio * (radio + altura);
        
        //La redondeo a un decimal
        double area1 = Math.round(area * 10.0) / 10.0;
        
        //Redondeo a dos decimales
        double area2 = Math.round(area * 100.0) / 100.0;
        
        //Redondeo a tres decimales
        double area3 = Math.round(area * 1000.0) / 1000.0;
        
        //Redondeo al nº entero más cercano
        double area4 = Math.round(area);
        
        //Trunco con la parte decimal a 0
        double area5 = (int) area;
        
        //Trunco
        int area6 = (int) area;
        
        //Muestro por pantalla
        System.out.println("Area con un decimal: " +area1);
        System.out.println("Area con dos decimales: " +area2);
        System.out.println("Area con tres decimales: " +area3);
        System.out.println("Area redondeada el entero mas cercano : " +area4);
        System.out.println("Area truncada con decimal a 0: " +area5);
        System.out.println("Area truncada: " +area6);
    }
}
