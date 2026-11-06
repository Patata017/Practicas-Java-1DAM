package PaquetePruebas;

/**
 *
 * @author Usuario
 */
public class Prueba1U2 {
    public static void main(String[] args) {
        
        //Variable local
        int variableLocal = 10;
        
        System.out.println("Fuera del bloque:" + variableLocal); 
        
        //Aqui abrimos un nloque de instrucciones interno
        {
        
            //variable del bloque (solo vive dentro de estas llaves)
            int variableDeBloque = 20;
            
            System.out.println("Dentro del bloque - Variable local:" + variableLocal);  //Puede ver lo de fuera
            System.out.println("Dentro del Bloque - Variable de bloque: " + variableDeBloque);  //Funciona
            
    }     // <-- Aqui mueren las llaves y la variableDeBloque desaparece de la memoria
        
        System.out.println("Fuera del bloque de nuevo" + variableLocal);
        
        //System.out.println("variableDeBloque");
        //Error de compilacion si descomentas la linea de arriba
        //porque la variableDeBloque ya no existe fuera de las llaves
    }
}
