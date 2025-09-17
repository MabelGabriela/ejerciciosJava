package EjerciciosParcial;


import java.util.Arrays;
import java.util.Random;

public class EjerciciosArreglos {
    public static void main(String[] args) {
        int[] vector=generaArrayInt(10,20,50);
        muestraArray(vector);

    }
    /* metodo 1 */
    public static int[] generaArrayInt(int n,int min, int max){
        int [] vector = new int[n];
        for(int i=0;i<vector.length;i++){
            vector[i]=(int)((Math.random()*(max-min))+min);
        }
        return vector;
    }
    /* metodo 2 */
    public static int minimoArrayInt (int[]vector){ 
       int min = vector[0];
       for ( int num : vector){
           if (num<min){
               min = num;
           }
       }
        return min;
    }
    /* metodo 3 */
    public static int maximoArrayInt (int []vector){
        int max = vector[0];
        for (int num : vector){
            if (num>max){
                max = num;
            }
        }
        return max;
    }
    /* metodo 4 */
    public static double mediaArrayInt (int []vector){
        int suma = 0;
        for (int num : vector){
         suma += num;
        }
        return (double)suma / vector.length;
    }
    /* metodo 5 */
    public static void estaEnArrayInt (int []vector){
        Random rand = new Random();
        int num = rand.nextInt(((50-20)+1)+20);
        boolean esta = false;
        for (int i=0;i<vector.length;i++){
            if (num==vector[i]){
                 esta = true;
            }
        }
        if (esta){
            System.out.println("el numero: "+ num +" si esta en el arreglo");
        }else {
            System.out.println("el numero: "+ num + " no esta en el arreglo");
        }
    }
    /* metodo 6*/
    public static void posicionEnArrayInt (int[] vector){
        Random rand = new Random();
        int posicion = rand.nextInt(vector.length);
        int num = vector[posicion];
        System.out.println("el numero: "+num+" esta en la posicion "+posicion);
    }
    /* metodo 7 */
    public static int[] volteaArrayInt(int[] vector){
        int [] alreves = new int[vector.length];
        for (int i=0; i<vector.length;i++){
        alreves[i] = vector[vector.length - 1 - i];
    }
        return alreves;
    }
    /* metodo 8 */
    public static int[] rotaDerechaArrayInt(int[]vector){
         Random rand = new Random();
        int n = rand.nextInt(vector.length)+1;
        int[] resultado = new int[vector.length];

        for (int i = 0; i < vector.length; i++) {
            int nuevaPos = (i + n) % vector.length;
            resultado[nuevaPos] = vector[i];
        }
        return resultado;
    }
/* metodo 9 */
    public static int[] rotaIzquierdaArrayInt(int[] vector) {
    Random rand = new Random();
    int n = rand.nextInt(vector.length) + 1; 
    int[] resultado = new int[vector.length];

    for (int i = 0; i < vector.length; i++) {
        int nuevaPos = (i - n + vector.length) % vector.length;
        resultado[nuevaPos] = vector[i];
    }

    return resultado;
}
    
    public static void muestraArray(int [] vector){
        
        System.out.println("array principal: "+Arrays.toString(vector));        
        System.out.println("el minimo es: "+ minimoArrayInt(vector));
        System.out.println("el maximo es: "+ maximoArrayInt(vector));
        System.out.println("la media es: "+ mediaArrayInt(vector));
        estaEnArrayInt(vector);
        posicionEnArrayInt(vector);
        System.out.println("el arreglo al reves queda: " + Arrays.toString(volteaArrayInt(vector)));
        System.out.println("arreglo rotado a la derecha: "+Arrays.toString(rotaDerechaArrayInt(vector)));
        System.out.println("arreglo rotado a la izquierda: "+Arrays.toString(rotaIzquierdaArrayInt(vector)));

    }
}
