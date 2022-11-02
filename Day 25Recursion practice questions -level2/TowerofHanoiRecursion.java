import java.util.*;
public class TowerofHanoiRecursion {
    public static void towerofHanoi(int n, String source, String helper, String destination){
        if(n==1)//base case jb sirf n=1 hai toh recursion nhi chlega directly destination pe print hojayega
            
        {
            System.out.println("transfer disk " + n + "from " + source + " to " + destination);
            return;
        }
        towerofHanoi(n-1, source, destination, helper);//Yha pr n-1 krke recursion call kr rhe hain coz n-1 disks ko helper mei shift krna hain to Helper bnega destination and destination bnega helper
        System.out.println("Transfer disk "+n+" from "+source+" to "+destination);
        towerofHanoi(n-1, helper, source, destination);//Yha pr n-1 disks ko destination mei shift krna hain to Source bnega Helper and Helper bnega source

    }
         public static void main(String[] args) {
            System.out.println("Enter the number of disks");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        towerofHanoi(n, "SOURCE", "HELPER", "DESTINATION");
            

            
        }
 
}
