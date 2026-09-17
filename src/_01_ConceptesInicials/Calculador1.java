package _01_ConceptesInicials;
import java.util.Scanner;

public class Calculador1 {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        System.out.print("Introdueix un número: ");
        int x = teclat.nextInt();
        System.out.print("Introdueix un segon número: ");
        int y = teclat.nextInt(); //prova fent la conversió

        System.out.println("Resultat suma: " + (x + y));
        System.out.println("Resultat resta: " + (x - y));
        System.out.println("Resultat multiplicació: " + (x * y));
        System.out.println("Resultat divisió: " + (x / y));
        System.out.println("Resultat mòdul: " + (x % y));
    }

}
