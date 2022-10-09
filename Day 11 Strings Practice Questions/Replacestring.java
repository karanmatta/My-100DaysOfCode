import java.util.*;
 
public class Replacestring {
   public static void main(String args[]) {
     Scanner sc = new Scanner (System.in);
     String str = sc.next();
     String result = "";
 
     for(int i=0; i<str.length(); i++) {
       if(str.charAt(i) == 'e') {
         result += 'i';
       } else if (str.charAt(i) != 'e'){
        System.out.print("No e's in the string");
        return ;

       }else{
         result += str.charAt(i);
       }
     }
 
     System.out.println(result);
   }
}


/*   
 * Test Case 1:
 * Input: hello
 * Output: hillo
 * 
 * Test Case 2:
 * Input: apple
 * Output: appili
 * 
 * Test Case 3: If there is no 'e' in the string
 * Output :-No e's in the string"
 * 
 * Test Case 4: If there is Multiple 'e' in the string
 * Input: eee
 * Output: iii
 * 
*/