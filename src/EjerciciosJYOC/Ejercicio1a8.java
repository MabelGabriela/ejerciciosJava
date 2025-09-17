
package EjerciciosJYOC;

import java.util.Scanner;

/*Escribe un programa que pide al usuario un número entero (se supone que se pondrá siempre un
numero entero mayor de 100), y se nos dice cuál es la última cifra de dicho número, y nos dice también
dicho número sin la ultima cifra
 */
public class Ejercicio1a8 {
    public static void main(String[] args) {
        System.out.print("ingrese un numero entero mayor que 100: ");
        Scanner in = new Scanner (System.in);
        int num = in.nextInt();
        int ultima = num % 10;
        int noCifra = num / 10;
        System.out.println("numero: "+num);
        System.out.println("su ultima cifra es: "+ultima);
        System.out.println("el numero sin la ultima cifra es: "+noCifra);
       
    }
}
