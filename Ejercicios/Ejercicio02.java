import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {   
        double euros;
        double pesetas;
        Scanner sc = new Scanner(System.in);
        
        System.out.println( "Ingrese una cantidad en Pesetas: " );
        pesetas = sc.nextDouble();
        euros = pesetas / 166.39;
        System.out.println( pesetas + " pesetas equivalen a " + euros + " euros" );     
    }
}
