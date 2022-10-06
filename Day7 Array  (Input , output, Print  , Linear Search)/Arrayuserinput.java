import java.util.*;

public class Arrayuserinput {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];

        //Input
        for(int i=0;i<size;i++){
            

            System.out.println("Enter values")
            number[i] = sc.nextInt();
        }
        

        for(int i=0;i<size;i++){

System.out.println("Enter size of array");
            System.out.println(number[i]);
        }
        
     }
    
}// Jab koi value nhi denge to java ke andar automatically Null value aajaegi
