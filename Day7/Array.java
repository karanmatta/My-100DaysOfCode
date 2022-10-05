import java.util.*;

public class Array {
    public static void main(String[] args) {
        int[] marks = new int[3];
        //Or  int marks[] = new int[3];

        marks[0] = 97;// physics
        marks[1] = 98;// chemistry marks
        marks[2] = 95;// English

        // System.out.println(marks);//[I@5acf9800 It prints garbage/Jargan value
        // System.out.println(marks[0]);// To print marks we have to put index
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        for(int i=0;i<3;i++){// We can print the array by loop
            System.out.println(marks[i]);
        }
    }
    
}
