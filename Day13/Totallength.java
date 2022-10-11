import java.util.*;
 
public class Totallength{
    public static void main(String args[]) {
 
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        String name2 = sc.nextLine();
 
        StringBuilder a= new StringBuilder(name1);
        StringBuilder b= new StringBuilder(name2);

        int totalLength = a.length() + b.length();
        System.out.println(totalLength);

    

   }
}
