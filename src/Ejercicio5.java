
import java.util.Scanner;

/* El dueño de una empresa desea planificar las decisiones financieras que tomara en el siguiente
año. La manera de planificarlas depende de lo siguiente:
Si actualmente su capital se encuentra con saldo negativo, pedirá un préstamo bancario para
que su nuevo saldo sea de U$10.000. Si su capital tiene actualmente un saldo positivo pedirá un
préstamo bancario para tener un nuevo saldo de U$20.000, pero si su capital tiene actualmente
un saldo superior a los U$20.000 no pedirá ningún préstamo.
Posteriormente repartirá su presupuesto de la siguiente manera:
• U$5.000 para equipo de computo
• U$2.000 para mobiliario
• El resto la mitad será para la compra de insumos y la otra para otorgar incentivos al personal.
Desplegar que cantidades se destinaran para la compra de insumos e incentivos al personal y,
en caso de que fuera necesario, a cuánto ascendería la cantidad que se pediría al banco.*/
public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Cual es su saldo de capital?");
        Scanner in = new Scanner (System.in);
        double saldoActual = in.nextDouble();
        double capital= 0;
        double prestamo = 0;
        if (saldoActual<0){
            prestamo = 10000 - saldoActual;
            capital = 10000;
        }
        else if (saldoActual>=0 && saldoActual<=20000){
            prestamo = 20000 - saldoActual;
            capital = 20000;
        }        
        else if (saldoActual>20000){
            prestamo = 0;
            capital = saldoActual;
        }
        double computo = 5000;
        double mobiliario = 2000;
        double restante = (capital - (computo + mobiliario));
        double insumos = restante / 2;
        double incentivos = restante / 2;
         System.out.println("la cantidad destinada a los insumos es de: $"+insumos);
         System.out.println("la cantidad destinada a los incentivos es de: $"+incentivos);
         System.out.println("su prestamo fue de: $"+prestamo);
    }
}
