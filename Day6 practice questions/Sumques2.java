import java.util.*;

class Sumques2{

    public static void calculateSum(int n){

        int sum =0;

        for(int i=1;i<=n;i++){
           if(i %2 !=0){
            sum=sum+i;
           } 
        }
        System.out.println("Sum of odd number is: " +sum);
    }
    public static void main(String[] args) {
        
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        
        calculateSum(n);
          
    }
}