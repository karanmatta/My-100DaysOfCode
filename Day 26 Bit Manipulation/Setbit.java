
public class Setbit {
    public static void main(String[] args) {
     int n=5;//0101
     int position= 1 ;
     int bitmask = 1<<position;//0100
     
     int number = bitmask | n;
     System.out.println(number);
    }
}


