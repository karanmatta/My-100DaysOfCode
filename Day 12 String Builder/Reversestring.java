import java.util.*;
 
public class Reversestring {
    public static void main (String[] args) {

        StringBuilder sb =new StringBuilder("Hello");

        for(int i=0 ; i<sb.length()/2;i++){

            int front = i;//index of front
            int back = sb.length()-i-1;//index of back
            // -1 because index starts from 0
            //5-1-0 =4 i ki refrence mai last character utha rhe h

            char frontChar = sb.charAt(front);//front character
            char backChar = sb.charAt(back);//back character

            sb.setCharAt(front, backChar);// Yha pr 1st index wale character ko last se replace kr rhe h
            sb.setCharAt(back, frontChar);

        }
        System.out.println(sb);

        
    }
    
}
