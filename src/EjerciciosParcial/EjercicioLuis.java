/*
Solicitar al usuario el número de habitaciones del hotel.

Registrar en una matriz el consumo de energía de cada habitación durante los 7 días de la semana, aplicando las siguientes condiciones:

Lunes, martes y jueves: consumo aleatorio entre 30 y 80 kWh.

Miércoles: consumo aleatorio entre 40 y 100 kWh.

Viernes, sábado y domingo: el consumo será un 20% mayor que el consumo registrado el lunes de esa misma habitación.

Solicitar al usuario un número de habitación y mostrar un reporte individual con:

Consumo diario (de lunes a domingo).

Promedio de consumo entre semana (lunes a viernes).

Promedio de consumo en fin de semana (sábado y domingo).

Calcular y mostrar las siguientes estadísticas generales del hotel:

Consumo total del hotel por cada día de la semana.

Consumo total de cada habitación durante la semana.

Habitación con mayor consumo y habitación con menor consumo.

Si el número de habitación ingresado por el usuario no es válido, se debe mostrar un mensaje de error.*/
package EjerciciosParcial;

import java.util.Random;
import java.util.Scanner;

public class EjercicioLuis {

    public static void main(String[] args) {
        System.out.print("ingresa el numero de habitaciones en la semana: ");
        Scanner in = new Scanner (System.in);
        Random aleatorio = new Random();
        int numHab = in.nextInt();
        String [] semana = {"lunes","martes","miercoles","jueves","viernes","sabado","domingo"};
        double [][] consumo = new double [numHab][7];
        for (int f = 0;f<numHab;f++){
            for (int c = 0; c<7;c++){
                if (c==0 || c ==1 || c==3){
                 consumo[f][c] =  30 + aleatorio.nextDouble()*50;
                }
                else if (c==2){
                    consumo[f][c]= 40+aleatorio.nextDouble()*60;// el 60 es de 100-40 para crear el rango
                }
                else if (c>=4){
                    consumo[f][c]= consumo[f][0]*(1+20/100);//nuevo_valor=valor_original×(1+X/100)
                }
            }
        }
        System.out.println("numero de habitacion de la que quiera reportar: ");
        int habitacion =in.nextInt();
        if (habitacion>=1 && habitacion<numHab){
           double sumasemana = 0, sumafinsemana = 0;
           int habitacionArreglo = habitacion - 1;
            System.out.println("consumo diario de la habitacion #"+habitacion);
            for (int c = 0;c<7;c++){
                System.out.println(semana[c]+": "+String.format("%2f",consumo[habitacionArreglo][c])+"kwh");
                if (c<5){
                    sumasemana += consumo[habitacionArreglo][c];
                }else {
                    sumafinsemana += consumo[habitacionArreglo][c];
                }
            }
            double promediosemana = sumasemana / 5;
            double promediofinsemana = sumafinsemana / 2;
            System.out.println("el promedio de consumo entre semana es "+String.format("%.2f",promediosemana)+"kwh");
            System.out.println("el promedio de consumo del din de semana es "+String.format("%.2f",promediofinsemana)+"kwh");
        }else {
            System.out.println("ERROR NUMERO NO VALIDO");
        }
                
           
        
}

}

