import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t, horas, min, seg;
        
        System.out.println("Ingrese los segundos");
        t = sc.nextInt();
        
        horas = t / 3600;
        min = (t - (3600 * horas)) / 60;
        seg = t - ((horas * 3600) + (min * 60));
        System.out.println(horas + "h " + min + "m " + seg + "s");
    }
}
