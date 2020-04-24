
import java.util.Random;


public class Ejercicio08 {

    public static void main(String[] args) {
        Random r = new Random();
        char letra = (char)(r.nextInt(26) + 'a');   
        System.out.println(letra);
    }
}
