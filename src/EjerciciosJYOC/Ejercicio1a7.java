
package EjerciciosJYOC;

import java.util.Scanner;

/* Pedir el precio de un producto (al usuario, por teclado), y decir el precio con el IVA añadido (suponer
un IVA único del 21% )*/
public class Ejercicio1a7 {
    public static void main(String[] args) {
        System.out.print("ingresar precio del producto: ");
        Scanner in = new Scanner (System.in);
        double precioProd = in.nextDouble();
        final double IVA = 0.21;
        double precioFinal = precioProd + (precioProd*IVA);
        System.out.printf("el precio del producto mas el IVA es %.2f%n", precioFinal);
    }
}
