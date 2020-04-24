
import java.util.Random;

public class Ejercicio10 {

    public static void main(String[] args) {
        Random r = new Random();
        int randomNumber;   
        String vocales = "aeiou";
        char letra = (char)(r.nextInt(26) + 'a');  
        int esVocal = vocales.indexOf(letra);
  
        if(esVocal == -1 ) {
            System.out.println(letra + " es consonante");
        } else
            System.out.println(letra + " es vocal");
    }
}
