package td2;
import java.util.Scanner;


public class exercice02 {
    public static String mirrorString(String input) {
        String mirroredString = new String();

        // Parcourir la chaîne de caractères à l'envers et l'ajouter à la chaîne miroir
        for (int i = input.length() - 1; i >= 0; i--) {
            mirroredString+=input.charAt(i);
        }

        return mirroredString.toString();
    }

    public static void main(String[] args) {

        //01
        Scanner sc=new Scanner(System.in);
        System.out.print("Entrer une chaine de caractere : ");

        String string= sc.nextLine();

        String mirrored = mirrorString(string);
        System.out.println("miror string :"+mirrored);

        //02 il n'existe aucun méthode prédefenie sur java
        //03 La methode est .isEmpty
        System.out.println("Chaine de caractere est vide ?? "+string.isEmpty());
        //04La méthode est toUpper()
        System.out.println("Chaine de caractere en Miniscule est  ?? "+string.toUpperCase());
        //04La méthode est toLowercase()
        System.out.println("Chaine de caractere en Miniscule est  ?? "+string.toLowerCase());


    }
}

