
package EjerciciosParcial;
/* Si tenemos de inicio un array int[] miarray = {8,2,5,4,9,1,0,8,9,3}
construir un programa que copie miarray en otro array llamado copiaDeDatos, pero sumando 2 a cada
elemento, y que escriba el array copiaDeDatos por pantalla, esto es, que salga :
"el elemento 1 de copiadedatos es 10”
"el elemento 2 de copiadedatos es 4"
"el elemento 3 de copiadedatos es 7"
"el elemento 4 de copiadedatos es 6"
…etc…*/

public class metodos {
    public static void main(String[] args) {
    int [] miarray = {8,2,5,4,9,1,0,8,9,3};
    int [] copiaDeDatos = new int [miarray.length];
    for (int i=0;i<miarray.length;i++){
    copiaDeDatos[i] = miarray[i]+2;
}
    for (int i =0;i<copiaDeDatos.length;i++){
        System.out.println("el elemento "+(i+1)+" de copiadedataos es "+copiaDeDatos[i]);
    }
}
}

