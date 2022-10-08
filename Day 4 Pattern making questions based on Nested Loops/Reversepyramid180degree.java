
 public class Reversepyramid180degree{
    public static void main(String args[]) {
        int n = 4;
        
        //Outer loop
        for(int i=1;i<=n;i++){
            //inner loop -> Spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }//Loop ke baad variable khatam ho jaata h
            //Loop ke aandar declare kia hua variable loop ke bahar aate hi khatam
            // Isilie next loop mai same use kia variable'j'
            //Inner loop->Stars print
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    
    }
 }
 