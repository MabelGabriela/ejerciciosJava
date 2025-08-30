
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
/* En una tienda de computadoras se planea ofrecer a los clientes un descuento que dependerá
del número de equipos que compre. Si las computadoras son menos de cinco se les dará un
10% de descuento sobre el total de la compra; si el número de computadoras es mayor o igual
a cinco pero menos de diez se le otorga un 20% de descuento; y si son 10 o más se les da un
40% de descuento. El precio de cada computadora es de U$500.*/
int numEquipos;
double descuento = 0.0;
double precioFinal;
Scanner in = new Scanner(System.in);
        System.out.println("¿Cuantas computadoras ha comprado?");
        numEquipos = in.nextInt();
        double precio = numEquipos * 500;
        if (numEquipos<5){
             descuento = precio * 0.10;
        }
        else if (numEquipos>=5 && numEquipos< 10){
        descuento = precio*0.20;
        }
        else if (numEquipos>=10){
        descuento = precio * 0.40;
        }
        precioFinal = precio - descuento;
        System.out.println("Su compra tiene un valor de: " + precioFinal);
    }
}
