import java.util.Scanner;

public class Ejercicio23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        
        System.out.println("Introduzca un numero");
        num1 = sc.nextInt();
        
        System.out.println("Introduzca otro numero");
        num2 = sc.nextInt();
        
        if (num1 > num2) {
            System.out.println("El numero mayor es " + num1);
        } else if(num1 < num2) {
            System.out.println("El numero mayor es " + num2);
        } else {
            System.out.println("Los numeros son iguales");
        }
    }
}
