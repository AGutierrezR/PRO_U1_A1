import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {
        // 5€, 10€, 20€, 50€, 100€, 200€
        Scanner sc = new Scanner(System.in);
        int monto, u, d, c, um, dm, cambio;
        
        System.out.println("Ingrese un monto en euros. (Hasta 99.999)40");
        monto = sc.nextInt();
        
        u = monto % 10;
        monto = monto / 10;
        
        d = monto % 10;
        monto = monto / 10;
        
        c = monto % 10;
        monto = monto / 10;
        
        um = monto % 10;
        monto = monto / 10;
        
        dm = monto % 10;
        monto = monto / 10;
        
        cambio = 0;
        
        // Decena de mil
        if (dm / 1 != 0) {
            cambio = 50 * (dm / 1);
        } 
        
        // Unidad de mil
        if (um / 1 != 0 || dm / 1 != 0) {
            if (cambio != 0) {
                cambio = cambio + (5 * um / 1);
            } else {
                cambio = 5 * (um / 1); 
            }
        } 
        
        // Centenas
        if (c / 2 != 0 || um / 1 != 0 || dm / 1 != 0) {
            if (cambio != 0) {
                cambio = cambio + (c / 2);
            } else {
                cambio = c / 2; 
            }
            System.out.println(cambio + " billete(s) de 200");
            c = c - (2 * (c / 2));
        }
        
        if (c / 1 != 0) {
            cambio = c / 1;
            System.out.println(cambio + " billete(s) de 100");
            c = c - (1 * cambio);
        }
        
        // Decenas
        if (d / 5 != 0) {
            d = d - 5;
            System.out.println("1 billete(s) de 50");
        }
        
        if (d / 2 != 0) {
            cambio = d / 2;
            System.out.println(cambio + " billete(s) de 20");
            d = d - (2 * cambio);
        }
        
        if (d / 1 != 0) {
            cambio = d / 1;
            System.out.println(cambio + " billete(s) de 10");
        }
        
        // Unidades
        if (u > 5) {
            System.out.println("1 billete de 5€");
            System.out.println("Sobran " + (u - 5) + "€");
        } else if (u == 5) {
            System.out.println("1 billete de 5€");
        }
        if (u < 5) {
            System.out.println("Sobran " + u + "€");
        } 
    }
}
