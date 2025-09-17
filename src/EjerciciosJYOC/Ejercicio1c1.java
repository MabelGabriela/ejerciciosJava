
package EjerciciosJYOC;

import java.util.Scanner;

/*Pedir por teclado un número de 4 cifras y mostrarlo con las cifras al revés.*/
public class Ejercicio1c1 {
    public static void main(String[] args) {
        System.out.println("dame un numero de 4 cifras: ");
        Scanner in = new Scanner (System.in);
        String numero = in.nextLine();
        String volteado = new StringBuilder(numero).reverse().toString();//stringbuilder manipula cadenas de texto, .reverse voltea la cadena, to string lo vuelve un string normal
        System.out.println("El número al revés es: " + volteado);
    }
}
