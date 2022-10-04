import java.util.*;

class Greaternumberques3{

    public static int returnGreater(int a, int b){
        if(a>b){
            return a;// To return some value datatype should be int
         
        }else if(a==b){// Equal condition
            System.out.println("Equal Numbers");
            return 0;
        }
        else{
            return b;
        }
    }
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
 
        
        System.out.println("Greater number is: "+returnGreater(a,b));
    }
}