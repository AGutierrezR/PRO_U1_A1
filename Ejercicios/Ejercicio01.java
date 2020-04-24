import java.util.Scanner;

public class Ejercicio01 {
    
    public static void main(String[] args) {  
        double euros;
        double pesetas;
        Scanner sc = new Scanner(System.in);
        
        System.out.println( "Ingrese una cantidad en Euros: " );
        euros = sc.nextDouble();
        pesetas = euros * 166.39;
        System.out.println( euros + " euros equivalen a " + pesetas + " pesetas" );
    }
}
