import java.util.*;
 
public class Rectanglepattern{
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter n");
       int n=sc.nextInt();//n=4
       System.out.println("Enter m");
       int m =sc.nextInt();//m=5
//Outer Loop
       for(int i=1; i<=n; i++){
        //Inner Loop
        for (int j=1; j<=m; j++){
            System.out.print("*");
        }System.out.println();
       }
       }
   }
