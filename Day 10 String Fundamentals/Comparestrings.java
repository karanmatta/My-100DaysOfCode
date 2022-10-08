import java.util.*;

public class Comparestrings {
    public static void main(String[] args){

        Scanner sc= new Scanner (System.in);
        String name1 = sc.nextLine();
        String name2 = sc.nextLine();

        // if name1 > name 2 = positive value
        // if name1 < name 2 = negative value
        // if name1 == name 2 = 0
    //.compareTo() function is used to compare two strings

    //hello > cello
    //hello < wello
    //aahello> aabello
    //Disimilar character mai jo bada hoga wo wali string badi hogi
        if(name1.compareTo(name2) > 0){
            System.out.println(name1 + " is greater than " + name2);}
            if(name1.compareTo(name2) < 0){
                System.out.println(name1 + " is smaller than " + name2);
            }
            else{
                System.out.println(name1 + " is equal to " + name2);
            }
    }
    /*new String se new string bna skte h. 
     * 
     * if(new String("Karan").equals(new String("Karan"))){
     * System.out.println("Equal");
     * }else{
     * system.out.println("Not Equal");
     * }
     * 
     * Iska answer not equal aaaega aur reason hum String builder mai seekhenge
    */
    
}

