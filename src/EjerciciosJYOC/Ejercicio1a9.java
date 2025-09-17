
package EjerciciosJYOC;

import java.util.Scanner;

/*Escribir un programa que pida cuantos hombres y mujeres hay en un aula (números enteros) y nos
informa del porcentaje de hombres y de mujeres.*/
public class Ejercicio1a9 {
    public static void main(String[] args) {
        System.out.print("cuantos hombres hay en el aula: ");
        Scanner in = new Scanner (System.in);
        int hombres = in.nextInt();
        System.out.print("cuantas mujeres hay en el aula: ");
        int mujeres = in.nextInt();
        int total = mujeres + hombres;
        double porcentajeH = (hombres * 100.00)/total;
        double porcentajeM = (mujeres * 100.00)/total;
        System.out.printf("el porcentaje de mujeres es: %.2f%% y el porcentaje de hombres es: %.2f%%%n",porcentajeM,porcentajeH);
    }
   
}
