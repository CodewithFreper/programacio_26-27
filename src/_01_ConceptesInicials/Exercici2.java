package _01_ConceptesInicials;

public class Exercici2 {
    public static void main(String[] args) {
        /*
        Crea un programa que guarde tres notes enteres en tres variables i calcule la seua mitjana
        amb decimals.
        */
        int nota1 = 7;
        int nota2 = 8;
        int nota3 = 6;
        double resultat = (nota1 + nota2 + nota3) / 3;
        System.out.println(resultat);

        /*
        Prova després amb nota1 = 8, nota2 = 8 i nota3 = 7. El resultat correcte ha de conservar els
        decimals. Intenta resoldre-ho fent una conversió explícita només on siga necessària.
        Repte: què ocorre si fas primer (nota1 + nota2 + nota3) / 3 i només després
        converteixes el resultat a double? Explica la diferència.
         */
        nota1 = 8;
        nota2 = 8;
        nota3 = 7;

        resultat =  (nota1 + nota2 + nota3) / 3;   //double només en resultat
        System.out.println(resultat);

        resultat = (double)(nota1 + nota2 + nota3) / 3; //Fem casting explicit al resultat de la suma de les notes
        System.out.println(resultat);
    }
}
