
package EjerciciosJYOC;

import java.util.Scanner;

/*Realizar un programa que pida al usuario dos números, correspondientes a un número de mes (del 1 al
12) y de un número de día (del 1 al 30). Calcular el número de días completos que faltan hasta el día
de Nochevieja (suponer que vivimos en un remoto planeta donde todos los meses del año tienen 30
días).
 */
public class Ejercicio1c3 {
    public static void main(String[] args) {
        System.out.print("que numero de mes es?: ");
        Scanner in = new Scanner (System.in);
        int numMes = in.nextInt();
        System.out.print("que dia es?: ");
        int numDia = in.nextInt();
        int meses = (numMes-1) * 30;
        int totalDias = meses+numDia;
        int diasFaltantes = 360-totalDias;
        System.out.println("los dias que faltan para nochevieja son: "+diasFaltantes);
    }
}
