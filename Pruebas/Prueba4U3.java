package PaquetePruebas;

import java.util.Scanner;

/**
 * Programa que genera un número aleatorio entre 1 y 10.
 * El usuario debe adivinarlo introduciendo números por teclado.
 * @author ruben
 */
public class Prueba4U3 {

    public static void main(String[] args) {

        // Objeto para leer datos desde el teclado
        Scanner teclado = new Scanner(System.in);

        /* Generamos un número aleatorio entre 1 y 10.
         *      10 -> indica cuántos números diferentes quieres generar.
         *      + 1 -> indica desde qué número quieres empezar. */
        int numeroSecreto = (int) (Math.random() * 10 + 1);

        /* Variable que almacenará el número introducido por el usuario */
        int numeroUsuario = 0;

        // Mostramos un mensaje inicial indicando el objetivo del juego.
        System.out.println("He pensado un número entre 1 y 10.");
        System.out.println("¡Intenta adivinarlo!");

        // El bucle se repetirá mientras el usuario no acierte el número secreto.
        while (numeroUsuario != numeroSecreto) {

            // Pedimos un número al usuario
            System.out.print("Introduce un número: ");
            numeroUsuario = teclado.nextInt();

            // Si el número introducido es menor que el número secreto, mostramos una pista.
            if (numeroUsuario < numeroSecreto) {
                System.out.println("El número secreto es mayor.");
            }

            // Si el número introducido es mayor que el número secreto, mostramos una pista.
            else if (numeroUsuario > numeroSecreto) {
                System.out.println("El número secreto es menor.");
            }

            // Si no se cumple ninguna de las condiciones anteriores, el usuario ha acertado.
            else {
                System.out.println("¡Has acertado!");
            }
        }

        // Al salir del bucle significa que el usuario ha encontrado el número secreto.
        System.out.println("Fin del programa.");
    }
}
