import java.util.*;

public class TableQues {
 public static void main(String[] args){
    System.out.println("Enter n");
    Scanner a=new Scanner(System.in);
    int n= a.nextInt();
     
    for(int i=1; i<11 ;i++){
        
        System.out.println("Table" + (n*i));
    }
 }   
}
