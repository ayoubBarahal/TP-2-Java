package td2;
import java.util.*;

public class exercice05 {
    public static void main(String[] args) {

        int S=0;

        for(int i=0;i< args.length;i++){
            String arg=args[i];
            if(arg.charAt(i)>=0 && arg.charAt(i)<=9){
                S+=Integer.parseInt(args[i]);
            }

        }
        System.out.print("La somme est : "+S);

        }
}

