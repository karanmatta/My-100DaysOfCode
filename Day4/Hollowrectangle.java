public class Hollowrectangle{
   public static void main(String args[]) {
      int n=4;
      int m=5;

      //Outer Loop
      for(int i=1;i<=n;i++){
        //Inner loop
        for (int j=1;j<=m;j++)// We are at block ->(i,j)
        {
            //conditions to print hollow rectangle star are only these places
            if(i== 1 || j== 1 || i==n||j==m){
                System.out.print("*");
            }else{
                System.out.print(" ");// isse beech ka space print hoga

            }
        }System.out.println();
      }
       }
   }
