import java.util.*;

public class Sumofffirstnnumbers {
 public static void main(String[] args){
    System.out.println("Enter n");
    Scanner a=new Scanner(System.in);
    int n= a.nextInt();
     
    int sum=0;
    for(int i=0; i<=n ;i++){
        sum=sum+i;
        
    }
    System.out.println("Sum is n numbers is" +sum);
 }   
}
