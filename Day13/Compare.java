import java.util.*;
 
public class Compare {
   public static void main(String args[]) {

   

       Scanner sc = new Scanner(System.in);
         String name1 = sc.nextLine();
            String name2 = sc.nextLine();

       StringBuilder a= new StringBuilder(name1);
       StringBuilder b= new StringBuilder(name2);
//.toString() is used to convert StringBuilder to String


       if (a.toString().equals(b.toString())){
       System.out.println("StringBuilder Objects are equal");
       }else{
         System.out.println("StringBuilder Objects are not equal");
       }
    }
}
