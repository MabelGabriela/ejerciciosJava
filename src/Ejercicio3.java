
import java.util.Scanner;


public class Ejercicio3 {
    public static void main(String[] args) {
        /*Un proveedor de reproductores de música ofrece un descuento del 10% sobre el precio sin IVA,
de algún aparato, si esta cuesta U$500 o más. Además, independientemente de esto, ofrece un
5% de descuento si la marca es “NOSY”. Determinar cuánto pagara, con IVA incluido, un cliente
cualquiera por la compra de su aparato. El IVA es del 19%.*/
        double descuento = 0;
        double total;
        Scanner in = new Scanner (System.in);
        System.out.println("cuanto cuesta su aparato? ");
        double precio_no_iva = in.nextDouble();
        if ( precio_no_iva >= 500){
        descuento = precio_no_iva * 0.10;
        }
        in.nextLine();
        System.out.println("que marca es su aparato? ");
        String marcaAparato = in.nextLine();
        if ( marcaAparato.equals("NOSY")){
         descuento += precio_no_iva*0.05;
        }
        total = precio_no_iva - descuento;
        double iva = total*0.19;
        double totalIva = total + iva;
        System.out.println("su valor a pagar es " + totalIva);
    }
}
    

