import java.util.*;

public class Searchinarray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];

        
        //Input
        for(int i=0;i<size;i++){
            System.out.println("Enter values");
            number[i] = sc.nextInt();
        }
        int x =sc.nextInt();

        for(int i=0;i<number.length;i++){// We do not have to define the sie differently we can do this by using .length

System.out.println("Enter size of array");
            
if(number[i]==x){
    System.out.println("x found at index" +i);
}
        }

    }// linear Search
    

}
