//Factorial of n nubers using recusrion

public class Recursion4 {
    public static int calcfactorial(int n){
        if (n==1||n==0){
            return 1;
        }
        int factorial_nm1=calcfactorial(n-1);
        int factorial_n=n*factorial_nm1;
        return factorial_n;
    }

    public static void main(String[] args){
        int n=5;
        int answer=calcfactorial(n);
        System.out.println(answer);
    }
    
}
