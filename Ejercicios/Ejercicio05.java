import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int horasTrabajadas;
        int pagoHora;
        int sueldoSemanal;
        
        System.out.println("Intruduce el numero de horas trabajadas");
        horasTrabajadas = sc.nextInt();
        pagoHora = 12;
        sueldoSemanal = horasTrabajadas * pagoHora;
        System.out.println("Su sueldo semana es de " + sueldoSemanal); 
    }
}
