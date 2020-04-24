import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mb;
        double kb;
     
        System.out.println("Intruduce una cantidad de Kb");
        kb = sc.nextDouble();
        mb = kb / 1024;
       
        System.out.println( kb + " kb equivalen a " + mb + " mb");
    }
}
