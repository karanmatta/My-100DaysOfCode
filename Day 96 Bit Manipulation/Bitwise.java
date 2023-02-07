import java.io.*;
import java.util.*;
 
class GFG {
  public static void main(String[] args)
  {
    int a = 5;
    int b = 7;
    System.out.print("Before Swapping, a = ");
    System.out.print(a);
    System.out.print(" ");
    System.out.print("b = ");
    System.out.print(b);
    System.out.println("");
    a ^= b;
    b ^= a;
    a ^= b;
    System.out.print("After Swapping, a = ");
    System.out.print(a);
    System.out.print(" ");
    System.out.print("b = ");
    System.out.print(b);
  }
}
 