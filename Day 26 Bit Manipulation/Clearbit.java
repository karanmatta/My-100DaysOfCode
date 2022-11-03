import java.util.*;
public class Clearbit {
  public static void main(String args[]) {
     int n = 5; //0101
     int pos = 2;
     int bitMask = 1<<pos;
     int newBitMask = ~(bitMask);//1011
     int newNumber = newBitMask & n;//0001
     System.out.println(newNumber);
  }
}
