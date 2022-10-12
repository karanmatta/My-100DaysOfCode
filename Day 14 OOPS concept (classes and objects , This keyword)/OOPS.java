class Pen{// prototype class

    String color;// Data member
    String type;

    public void write(){// member function\method
        System.out.println("Writing");
    }
}
public class OOPS{//Main class

    public static void main(String[] args)//main method 
    {
        Pen p1 = new Pen();//object
        p1.color = "Red";//object.attribute
        p1.type = "Ballpoint";//object.attribute
        p1.write();
        
    }
}