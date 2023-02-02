import java.lang.String;
import java.util.*;

public class Monogram {
    public static void main(String[] args){
        try (Scanner s = new Scanner (System.in)) {
            System.out.print("Enter a string:");
            String st=s.nextLine();
            int l=st.length();
             
            if (l == 0)
            return ;
            System.out.print(Character.toUpperCase(st.charAt(0)));
 
            for (int i = 1; i < l- 1; i++)
               { if (st.charAt(i) == ' ')
                System.out.print(" " + Character.toUpperCase(st.charAt(i + 1)));
            }
        }
    }
}
