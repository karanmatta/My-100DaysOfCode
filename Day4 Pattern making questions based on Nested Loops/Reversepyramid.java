
 public class Reversepyramid{
   public static void main(String args[]) {
       int n = 4;
      // decrement operator i=i-1 , i--
       for(int i=n; i>=1; i--) {
           for(int j=1; j<=i; j++) {
                   System.out.print("*");
           }
           System.out.println();
       }
   }
}
