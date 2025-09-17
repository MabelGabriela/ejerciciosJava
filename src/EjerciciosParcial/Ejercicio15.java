
package EjerciciosParcial;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio15 {
        public static void llenarTemperaturas(double[] arreglo, boolean aleatorio, double min, double max) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        for (int i = 0; i < arreglo.length; i++) {
            if (aleatorio) {
                // Generar número aleatorio entre min y max
                arreglo[i] = min + (max - min) * rand.nextDouble();
            } else {
                // Pedir al usuario que ingrese la temperatura manualmente
                System.out.print("Ingrese la temperatura para el mes " + (i + 1) + ": ");
                arreglo[i] = in.nextDouble();
                // Validar que esté dentro del rango permitido
                while (arreglo[i] < min || arreglo[i] > max) {
                    System.out.print("Temperatura fuera de rango. Ingrese nuevamente: ");
                    arreglo[i] = in.nextDouble();
                }
            }
        }
    }
     public static void mostrarArreglo(double[] arreglo) {
    for (int i = 0; i < arreglo.length; i++) {
        System.out.println("Mes " + (i + 1) + ": " + String.format("%.2f", arreglo[i]) + "°C");
    }
}
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Declarar los arreglos para las 12 semanas
        double[] rivera = new double[12];
        double[] neiva = new double[12];
        double[] campoalegre = new double[12];

        // Pedir si los datos serán aleatorios o manuales
        System.out.print("¿Desea generar las temperaturas aleatoriamente? (true/false): ");
        boolean aleatorio = in.nextBoolean();

        // Pedir límites de temperatura
        System.out.print("Ingrese la temperatura mínima permitida: ");
        double tempMin = in.nextDouble();
        System.out.print("Ingrese la temperatura máxima permitida: ");
        double tempMax = in.nextDouble();
 // Llenar los arreglos usando el método
        llenarTemperaturas(rivera, aleatorio, tempMin, tempMax);
        llenarTemperaturas(neiva, aleatorio, tempMin, tempMax);
        llenarTemperaturas(campoalegre, aleatorio, tempMin, tempMax);

        // Mostrar las temperaturas de cada ciudad
        System.out.println("Temperaturas de Rivera:");
        mostrarArreglo(rivera);

        System.out.println("Temperaturas de Neiva:");
        mostrarArreglo(neiva);

        System.out.println("Temperaturas de Campoalegre:");
        mostrarArreglo(campoalegre);
        
}
}
