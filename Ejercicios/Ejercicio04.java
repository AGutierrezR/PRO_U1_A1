import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base;
        double altura;
        double area;
        
        System.out.println("Intruduce la base de el triangulo");
        base = sc.nextDouble();
        System.out.println("Intruduce la altura de el triangulo");
        altura = sc.nextDouble();
        
        area = (base * altura) / 2 ;
        
        System.out.println("El area de el triangulo es " + area);
    }
}
