import java.util.*;

public class Buttonswitch {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int button =sc.nextInt();

        switch(button){
            case 1:System.out.println("Namste");
            break;
            case 2:System.out.println("Hello");
            break;
            case 3:System.out.println("Bonjour");
            break;
            default:System.out.println("Invalid button");
// The Java break statement is used to break loop or switch statement. It breaks the current flow of the program at specified condition. In case of inner loop, it breaks only inner loop.

//We can use Java break statement in all types of loops such as for loop, while loop and do-while loop.

        }//Switch is used to write clean code and used when there are many if else statement. Instead of if else we can use Switch

        
    }
    
}
