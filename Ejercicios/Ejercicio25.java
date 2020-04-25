import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) throws ParseException {
        
        Scanner sc = new Scanner(System.in);
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        
        System.out.println("Introduce una fecha inicial (dd-mm-yyyy)");
	    Date fechaInicial = dateFormat.parse(sc.nextLine());
        
        System.out.println("Introduce una fecha final (dd-mm-yyyy)");
	    Date fechaFinal = dateFormat.parse(sc.nextLine());

	    int dias = (int) ((fechaFinal.getTime()-fechaInicial.getTime()) / 86400000);

	    System.out.println("Hay "+dias+" dias de diferencia");
    }
}
