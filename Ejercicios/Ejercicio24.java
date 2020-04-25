import java.util.Scanner;

public class Ejercicio24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1, porcentaje1, nota2, porcentaje2, notaFinal;
        
        porcentaje1 = 4;
        porcentaje2 = 6;
        
        System.out.println("Introduce la nota del primer examen");
        nota1 = sc.nextDouble();
        nota1 = nota1 * porcentaje1;
        
        System.out.println("Que nota quieres sacar en el trimestre");
        notaFinal = sc.nextDouble();
        notaFinal = notaFinal * 10;
        
        nota2 = (notaFinal - nota1) / porcentaje2;
        
        System.out.println(nota2);
    }
}
