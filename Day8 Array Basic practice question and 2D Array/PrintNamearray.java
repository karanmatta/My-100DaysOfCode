import java.util.*;

public class PrintNamearray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        String name[] = new String[size];

        //input

        for(int i=0;i<size;i++){
            name[i]=sc.next();
        }

        //Output
        for(int i=0;i<size;i++){
            System.out.println("name " + (i+1) +" is : " + name[i]);
        }
    }

}