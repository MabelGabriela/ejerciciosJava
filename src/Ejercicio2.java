
    import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args) {
        /* En una serviteca se ha establecido una promoción de las llantas marca “Pinchadas”, que consiste
en lo siguiente:
• Si se compran menos de cinco llantas el precio es de U$100 cada una, de U$75 si se
compran de cinco a 10 y de U$50 si se compran más de 10.
• Obtener la cantidad de dinero que una persona tiene que pagar por cada una de las llantas
que compra y la que tiene que pagar por el total de la compra.*/
        int xllanta;
        double total;
        int cantllanta;
        Scanner in = new Scanner(System.in);

        System.out.println("cuantas llantas desea comprar?");
        cantllanta = in.nextInt();
        if (cantllanta<5){
            xllanta = 100;
            total = cantllanta * xllanta;
            System.out.println("el precio por unidad es: " + xllanta + " su total a pagar es " + total);
        }
        else if (cantllanta>=5 && cantllanta<10){
            xllanta = 75;
            total = cantllanta * xllanta;
            System.out.println("el precio por unidad es: " + xllanta + " su total a pagar es " + total);
                    }
        else if (cantllanta>10){
            xllanta = 75;
            total = cantllanta * xllanta;
            System.out.println("el precio por unidad es: " + xllanta + " su total a pagar es " + total);
        }
            
        
    }
}
    
    

    
