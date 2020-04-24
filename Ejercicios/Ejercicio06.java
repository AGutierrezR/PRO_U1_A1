import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mb;
        double kb;
     
        System.out.println("Intruduce una cantidad de Mb");
        mb = sc.nextDouble();
        kb = mb * 1024;
       
        System.out.println( mb + " Mb equivalen a " + kb + " kb");
    }
}
