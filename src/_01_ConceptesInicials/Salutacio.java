package _01_ConceptesInicials;
import java.util.Scanner;

public class Salutacio {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        System.out.print("Com et dius? ");
        String nom = teclat.nextLine();

        System.out.print("Quants anys tens? ");
        int edat = teclat.nextInt();

        int edatAnyQueVe = edat + 1;

        System.out.println("Hola, " + nom + "!");
        System.out.println("L'any que ve tindràs " + edatAnyQueVe + " anys.");
    }
}