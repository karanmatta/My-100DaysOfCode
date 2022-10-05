import java.util.*;

public class Factorialfunction {
//Void mai bnja return die bhi chlega
    public static void printFactorial(int n){
        if(n<0){
            System.out.println("Invalid input");
          return;     
        }
        if(n==0){
            System.out.println(1);
            return;
        }


        int factorial =1;// 1 se isilie kia kyunki 0!=1(0 factorial is equal to 1)
        
        //Loop
        for(int i=n;i>=1;i--){
            factorial=factorial*i;
        }
        System.out.println(factorial);
    }
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        printFactorial(n);// Method calling
    }
    
}
