import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        int nivelDeEstudio;
        int ingresos;
        boolean jasp;
        
        System.out.println("Introduzca edad");
        edad = sc.nextInt();
        System.out.println("Introduzca nivel de estudio");
        nivelDeEstudio = sc.nextInt();
        System.out.println("Introduzca ingresos");
        ingresos = sc.nextInt();
        
        if(edad <= 28 && nivelDeEstudio > 3 && ingresos > 28000) {
            jasp = true;
            System.out.println("Jasp es true");
        } else {
            jasp = false;
            System.out.println("Jasp es false");    
        }

    }
}
