public class Recursion1 {

public static void printNumbers(int n) {
    if(n == 0) {
        return;
    }
    System.out.println(n);
    printNumbers(n-1);//recursive call
}


    public static void main(String[] args){
        int n=5;
        // If we declare the method as static, we don't need to create an object of the class
        printNumbers(n);
    }
    
}

/*  If we declare the method static we dont have to create the object of the cLASS */
