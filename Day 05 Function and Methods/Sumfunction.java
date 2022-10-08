import java.util.*;
// Sum calculating function
public class Sumfunction {
    
    public static int calculateSum(int a, int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter first number: ");
        int a=sc.nextInt();
        System.out.println("Enter Second number: ");
        int b=sc.nextInt();

        int sum=calculateSum(a,b);// Function call idhr yh upr wale function ko call lgaega

        System.out.println("Sum is: "+sum);//+ is used to print when we have to print multiple outputes here we print text as well as the Sum

    }
}
