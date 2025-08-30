
import java.util.Scanner;


public class Ejercicio4 {
    public static void main(String[] args) {
        /* NUM. DE KILOS COMPRADOS % DESCUENTO
0 - 2 0%
2.01 - 5 10%
5.01 - 10 15%
10.01 en adelante 20%
Determinar cuánto pagara una persona que compre manzanas es esa frutería.*/
        Scanner in = new Scanner (System.in);
        double desc = 0;
        System.out.println("en cuanto está el kilo de manzana?");
        double precioManzana = in.nextDouble();
        System.out.println("cuantos kilos ha comprado?");
        double numKilos = in.nextDouble();
        double precio = precioManzana * numKilos;
        if ( numKilos<=2){
            desc = 0;
        }
            else if (numKilos>2 && numKilos<=5){
                desc = precio * 0.10;
            }
            else if (numKilos>5 && numKilos<=10){
                desc = precio * 0.15;
            }
            else if (numKilos > 10){
                desc = precio * 0.20;
            }
        double total = precio - desc;
        System.out.println("su valor a pagar es: "+ total);
    }
}
   
