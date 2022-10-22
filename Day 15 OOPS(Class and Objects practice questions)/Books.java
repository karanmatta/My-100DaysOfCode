import java.util.Scanner;
import static java.lang.Boolean.TRUE;
class Books
{
    String[] bname={"DSA","JAVA","OS","OOPs"};
    int[] available={4,6,7,4};
}
class Library extends Books
{
    Scanner in=new Scanner(System.in);
    void lists()
    {
        System.out.println("List of Books Available");
        for(int i=0;i<4;i++)
        {
            if(super.available[i]>0)
            {
                System.out.println(super.bname[i]+ " "+available[i]);
            }
        }
    }
    void borrow()
    {
        String book;
        System.out.println("List of Books");
        for(int i=0;i<4;i++) {
            System.out.println("Name: "+bname[i]+" "+"Available: "+available[i]);
        }
        System.out.println("Enter Book Name you want to borrow(Case Sensitive):");
        book=in.next();
        for(int i=0;i<4;i++)
        {
            if(bname[i].equals(book)==TRUE)
            {
                super.available[i]--;
                System.out.println("Borrow Successfully");
            }
        }

    }
    void return_books()
    {
        String book;
        System.out.println("List of Books");
        for(int i=0;i<4;i++) {
            System.out.println("Name: "+bname[i]+" "+"Available: "+available[i]);
        }
        System.out.println("Enter Book Name you want to borrow(Case Sensitive):");
        book=in.next();
        for(int i=0;i<4;i++)
        {
            if(bname[i].equals(book)==TRUE)
            {
                available[i]++;
                System.out.println("Return Successfully");
            }
        }

    }

}
public class SmallTownX {
    public static void main(String arg[])
    {
        Scanner in=new Scanner(System.in);
        int value=0;
        Library obj=new Library();
        while(value!=4) {
            System.out.println("Press 1: To Display List of Available Books\nPress 2:To Borrow Book\nPress 3:To Return Book\nPress 4:To Exit");
            value = in.nextInt();
            if (value == 1)
                obj.lists();
            else if (value == 2)
                obj.borrow();
            else if (value == 3)
                obj.return_books();
            else if (value == 4)
                System.out.println("Thank You");
            else
                System.out.println("Wrong Input");
        }
    }
}
