 package td2;
import java.util.Scanner;

public class exercice04 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);


        System.out.print("Donnez un nombre entier : ");
        int x=sc.nextInt();

        String string=Integer.toString(x);


        for (int i = 0; i < string.length(); i++) {
            System.out.println(string.charAt(i));
        }

    }
}
