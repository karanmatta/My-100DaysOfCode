import java.util.Scanner;	
import java. math.*;
public class Distance_btw_point
{
    public static void main(String arg[])
    {
        int[] y = new int[10];
        int[] x = new int[10];
        int a=0,b=0;
        double sum=0;
        Scanner in= new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter x"+(i+1));
            a=in.nextInt();
            x[i]=a;
            System.out.println("Enter y"+(i+1));
            a=in.nextInt();
            y[i]=b;
        }
        for(int i=0;i<11;i++)
        {
            double d=Math.pow(x[i+1]-x[i],2);
            double f=Math.pow(y[i+1]-y[i],2);
            double c=d+f;
            sum=sum+Math.pow(c,0.5);
        }
        System.out.print("Distance: "+sum);

    }
}
