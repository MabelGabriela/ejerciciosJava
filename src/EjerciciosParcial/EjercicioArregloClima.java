package EjerciciosParcial;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**Métodos de análisis:
generarTemperaturas(int min, int max): Genera un array de 7 temperaturas aleatorias entre los valores mínimo y máximo.
temperaturaMinima(int[] temperaturas): Devuelve la temperatura más baja registrada.
temperaturaMaxima(int[] temperaturas): Devuelve la temperatura más alta registrada.
mediaTemperaturas(int[] temperaturas): Calcula la temperatura promedio de la semana.
desviacionEstandar(int[] temperaturas): Calcula la desviación estándar de las temperaturas (para detectar variabilidad).
hayTemperatura(int[] temperaturas, int valor): Indica si una temperatura específica fue registrada.
diaDeTemperatura(int[] temperaturas, int valor): Devuelve el índice del día en que se registró una temperatura específica (0 = lunes, 6 = domingo).
Métodos de transformación:
invertirTemperaturas(int[] temperaturas): Invierte el orden de las temperaturas (de domingo a lunes).
rotarTemperaturasDerecha(int[] temperaturas, int n): Rota las temperaturas n días hacia la derecha.
rotarTemperaturasIzquierda(int[] temperaturas, int n): Rota las temperaturas n días hacia la izquierda.
* Métodos de interpretación:
clasificarTemperaturas(int[] temperaturas): Devuelve un array de etiquetas ("Frío", "Templado", "Caliente") según rangos definidos:
Frío: < 18°C
Templado: 18°C–25°C
Caliente: > 25°C
* detectarAnomalias(int[] temperaturas): Devuelve un array con los días que tienen temperaturas que se desvían más de 1.5 veces la desviación estándar respecto a la media.
 *
 * @author Mabel Gabriela Gomez 20251232355
 */
public class EjercicioArregloClima {
    public static void main(String[] args) {
       int [] vector= generarTemperaturas(7,0,45);
       muestraArray(vector);
    }
    
    /* metodo 1 */
    public static int[] generarTemperaturas (int n, int min, int max){
        int [] vector = new int[n];
        for (int i =0;i<vector.length;i++){
            vector[i] = (int)(Math.random()*(max-min))+min;
        }
        return vector;
    }
    /* metodo 2*/
    public static int temperaturaMinima (int[]vector){
        int min = vector[0];
        for (int num : vector){
            if (num<min){
                min = num;
            }
        }
        return min;
    }
    /* metodo 3*/
    public static int temperaturaMaxima (int[]vector){
        int max = vector[0];
        for (int num : vector){
            if (num>max){
                max = num;
            }
        }
        return max;
    }
    /* metodo 4*/
    public static double mediaTemperaturas (int[]vector){
        int suma = 0;
        for ( int num : vector){
            suma += num;
        }
       return (double)suma / vector.length;
    }
    /*  metodo 5
    -sacar la media
    -a cada temperatura RESTAR la media y ELEVAR AL CUADRADO
    -SUMAR cada uno de los valores anteriores
    -DIVIDIR entre la cantidad de datos
    -sacar RAIZ CUADRADA de el total de la division*/
    public static double desviacionEstandar (int[]vector){
        double media = mediaTemperaturas(vector);
        double suma = 0;
        for(int t : vector ){
            suma += Math.pow(t - media,2);
        }
        return Math.sqrt(suma/vector.length);
    }
    
    /* metodo 6*/
     public static void hayTemperatura (int []vector){
        Random rand = new Random();
        int num = rand.nextInt(((45-0)+1)+0);
        boolean esta = false;
        for (int i=0;i<vector.length;i++){
            if (num==vector[i]){
                 esta = true;
            }
        }
        if (esta){
            System.out.println("la temperatura: "+ num +" si fue registrada");
        }else {
            System.out.println("la temperatura: "+ num + " no esta registrada");
        }
    }
     /* metodo 7*/
    public static void diaDeTemperatura (int[] vector){
        Random rand = new Random();
        int posicion = rand.nextInt(vector.length);
        int temperatura = vector[posicion];
        String [] semana = {"lunes","martes","miercoles","jueves","viernes","sabado","domingo"};
        String posiciondia = semana[posicion];
        
        System.out.println("la temperatura: "+temperatura+" esta en la posicion "+posicion+" que es el dia "+posiciondia);
    }
    /* METODOS TRANSFORMACION */
    /* metodo 1 */
    public static int[] invertirTemperaturas(int[] vector){
        int [] alreves = new int[vector.length];
        for (int i=0; i<vector.length;i++){
        alreves[i] = vector[vector.length - 1 - i];
    }
        return alreves;
    }
    /* metodo 2*/
    public static int [] rotarTemperaturasDerecha(int[] vector){
         Random rand = new Random();
         int n = rand.nextInt(vector.length)+1;
         System.out.println("se roto a la derecha "+n+ " posiciones");
        int[] resultado = new int[vector.length];
        for (int i = 0; i < vector.length; i++) {
            int nuevaPos = (i + n) % vector.length;
            resultado[nuevaPos] = vector[i];
        }

        return resultado;
    }
    /* metodo 3 */
    public static int [] rotarTemperaturasIzquierda(int[] vector){
         Random rand = new Random();
         int n = rand.nextInt(vector.length)+1;
         System.out.println("se roto a la izquierda "+n+ " posiciones");
        int[] resultado = new int[vector.length];

        for (int i = 0; i < vector.length; i++) {
            int nuevaPos = (i - n + vector.length) % vector.length;
            resultado[nuevaPos] = vector[i];
        }

        return resultado;
    }
    /* METODO INTERPRETACION */
    public static String[] clasificarTemperaturas(int[] vector) {
    String[] etiquetas = new String[vector.length]; 

    for (int i = 0; i < vector.length; i++) {
        if (vector[i] < 18) {
            etiquetas[i] = "Frio";
        } else if (vector[i] <= 25) {
            etiquetas[i] = "Templado";
        } else {
            etiquetas[i] = "Caliente";
        }
    }
    return etiquetas;
}
    /* METODO ANOMALIA 
    sacar media y desviacion
    sacar el umbral que es un valor que se va a sumar y restar con la media para hacer un rango
    crear un arreglo para añadir los dias con anomalias
    sumar la media con el umbral
    restar la media con el umbral
    añadir al arreglo los dias anomalos
    */
    
    public static String[] detectarAnomalias (int[] vector){
    String [] semana = {"lunes","martes","miercoles","jueves","viernes","sabado","domingo"};
    double media = mediaTemperaturas(vector);
    double desviacionEstandar = desviacionEstandar(vector);
    double umbral = 1.5 * desviacionEstandar;//define cuanto se va a restar o sumar para crear el rango
    ArrayList<String> diasAnomalos = new ArrayList<>();// el ArrayList para crear un arreglo q se acomode al tamaño de datos q entran
    for (int i = 0;i<vector.length;i++){
        double limiteMenor = media - umbral;//resta para rango minimo
        double limiteMayor = media + umbral;// suma para rango maximo
        if (vector[i]<limiteMenor || vector[i]>limiteMayor){//si la temperatura se sale del rango, es anomala
            diasAnomalos.add(semana[i] +" con "+ vector[i]+" grados");//.add para agregar el dato a el ArrayList
        }
    }
    return diasAnomalos.toArray(new String[0]);//el to.Array, convertir el ArrayList a uno arreglo de tamaño fijo
    }
    
    public static void muestraArray(int [] vector){
        System.out.println("temperaturas: "+Arrays.toString(vector));
        System.out.println("temperatura minima: "+temperaturaMinima(vector));
        System.out.println("temperatura maxima: "+temperaturaMaxima(vector));
        System.out.println("la temperatura promedio de la semana fue: "+mediaTemperaturas(vector));
        hayTemperatura(vector);
        System.out.println("la desviacion estandar de las temperaturas es: "+desviacionEstandar(vector));
        diaDeTemperatura(vector);
        System.out.println("el orden de las temperaturas invertido es "+Arrays.toString(invertirTemperaturas(vector)));
        System.out.println("las temperaturas rotadas a la derecha son : "+Arrays.toString(rotarTemperaturasDerecha(vector)));
        System.out.println("las temperaturas rotadas a la izquierdad son : "+Arrays.toString(rotarTemperaturasIzquierda(vector)));
        System.out.println(Arrays.toString(clasificarTemperaturas(vector)));
String[] anomalas = detectarAnomalias(vector);
if (anomalas.length>0){
    System.out.println("los dias con anomalias son: "+Arrays.toString(anomalas));
}
else {
    System.out.println("no hubo dias con anomalias");
}
    }
    
}
