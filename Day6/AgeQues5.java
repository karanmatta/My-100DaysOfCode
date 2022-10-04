import java.util.*;
 
public class AgeQues5 {
   public static boolean isElligible(int age) {
       if(age > 18) {
           return true;
       }else{
       return false;
   }
}
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int age = sc.nextInt();
      System.out.println("Candidiate can vote: "+isElligible(age));
   }   
}
