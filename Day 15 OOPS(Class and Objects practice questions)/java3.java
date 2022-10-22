import java.util.*;

public class java3 {
    public static void main(String arg[]) {
        Batsman1 obj = new Batsman1();
        obj.initial_value();
        obj.update_run();
        obj.info();

    }
}

class Batsman1 {

    String FirstName;
    String LastName;
    int RunsMade;
    int No_of_fours;
    int No_of_sixs;
    int total = 0;
    Scanner sc = new Scanner(System.in);

    void initial_value() {

        System.out.print("Enter FirstName: ");
        this.FirstName = sc.next();
        System.out.print("Enter LastName: ");
        this.LastName = sc.next();
        System.out.print("Enter RunMade: ");
        this.RunsMade = sc.nextInt();
        total = RunsMade;
        System.out.print("Enter No of fours: ");
        this.No_of_fours = sc.nextInt();
        System.out.print("Enter No of sixes: ");
        this.No_of_sixs = sc.nextInt();
    }

    void update_run() {
        System.out.print("Enter the update run ");
        this.RunsMade = sc.nextInt();
    }

    void info() {
        System.out.println();
        System.out.println("Name :" + this.FirstName + " " + this.LastName);
        System.out.println("No of fours & sixes  :- " + this.No_of_fours + "/" + this.No_of_sixs);
        total = total + RunsMade;
        System.out.println("Total Run made:" + this.total);
    }
}
