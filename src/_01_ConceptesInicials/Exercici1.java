package _01_ConceptesInicials;

public class Exercici1 {
    public static void main(String[] args) {
        /*
        Sense executar el programa, escriu al costat de cada cas quin resultat creus que mostrarà.
        Després comprova-ho en Java i explica per què.
        */
        int a = 7;
        double b = a;
        System.out.println(b);                          //7.0
        double x = 9.8;
        int y = (int) x;
        System.out.println(y);                          //9 (directament lleva la part decimal o arrodoneix al més pròxim?)
        int n1 = 7;
        int n2 = 2;
        double resultat = n1 / n2;
        System.out.println(resultat);                   //3.0
        double resultat2 = (double) n1 / n2;
        System.out.println(resultat2);                  //3.5
        /*
        Pregunta: en quins casos s'ha produït casting implícit? En quins casting explícit?

        En el primer cas de 7 a 7.0 casting implícit.
        En el segon casting explícit.
        En el tercer implícit.
        En el quart explícit.
        */
    }
}
