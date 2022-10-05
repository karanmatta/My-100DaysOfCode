import java.util.*;
// Sum calculating function
public class Multiplyfunction {
    
    // public static int calculateproduct(int a, int b){
    //     int product=a*b;
    //     return product;
    // }

    public static int calculateProduct(int a, int b){
        return a*b;// Directly return mai bhi de skte h   
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter first number: ");
        int a=sc.nextInt();
        System.out.println("Enter Second number: ");
        int b=sc.nextInt();

        

        System.out.println("Product is: " + calculateProduct(a,b));// Bina variable mai store kre direct yhi call kr lia

    }
}
