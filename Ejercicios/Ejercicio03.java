import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        double base;
        double altura;
        double area;
        
        System.out.println("Intruduce la base de el rectangulo");
        base = sc.nextDouble();
        System.out.println("Intruduce la altura de el rectangulo");
        altura = sc.nextDouble();
        
        area = base * altura;
        
        System.out.println("El area de el rectangulo es " + area); 
    }
}
