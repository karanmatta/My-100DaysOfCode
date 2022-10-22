import java.util.Scanner;

public class java4 {
    public static void main(String arg[]) {
        int reg_no;
        String sname;
        float eng, maths, science;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Registration Number:");
        reg_no = in.nextInt();
        System.out.print("Enter Name:");
        sname = in.next();
        System.out.print("Enter Marks of Eng,Maths & Science:");
        eng = in.nextFloat();
        maths = in.nextFloat();
        science = in.nextFloat();
        Totalmarks obj = new Totalmarks();
        System.out.println("Registration Number: " + reg_no);
        System.out.println("Name: " + sname);
        obj.getdata(eng, maths, science);
        obj.Ctotal();
        obj.displayresult();

    }

}

class Totalmarks {
    float eng, maths, science, total = 0;

    void getdata(float eng1, float maths1, float science1) {
        eng = eng1;
        maths = maths1;
        science = science1;
    }

    float Ctotal() {
        total = eng + maths + science;
        return total;
    }

    void displayresult() {
        System.out.print("Total Marks: " + total);
    }
}
