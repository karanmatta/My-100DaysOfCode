import java.util.*;


class Averageques1{
    public static void main(String[] args){

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a");
    int a = sc.nextInt();
    System.out.println("Enter b");
    int b = sc.nextInt();
    System.out.println("Enter c");
    int c = sc.nextInt();

    float average= (a+b+c)/3;

    System.out.println("Average is:"+average);
    
}

}