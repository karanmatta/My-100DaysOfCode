import java.util.*;
public class Getbit {
    public static void main(String[] args) {
     int n=5;//0101
     int position= 2 ;
     int bitmask = 1<<position;
     if((bitmask & n)==0){
        System.out.println("bit was 0");
     }else{
        System.out.println("bit was 1");
     }
    }
}

