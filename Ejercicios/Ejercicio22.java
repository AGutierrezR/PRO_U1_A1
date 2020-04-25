import java.util.Scanner;

public class Ejercicio22 {

    public static void main(String[] args) {
        int producto;
        double descuento, iva, subtotal, total;
        
        producto = 120;
        descuento = 0.15;
        iva = 0.21;
        
        subtotal = producto - (producto * descuento);
        total = subtotal + (subtotal * iva);
        
        System.out.println("Precio del productor: " + producto);
        System.out.println("Precio del productor con descuento de 15%: " + subtotal);
        System.out.println("Total a pagar (Con IVA): " + total);
    }
}
