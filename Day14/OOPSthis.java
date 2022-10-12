 class Pen{// prototype class

    String color;// Data member
    String type;

    public void write(){// member function\method
        System.out.println("Writing");
    }
    public void printColor(){
        System.out.println(this.color);//This keyword is used to refer to the current object
    }
}
public class OOPSthis{//Main class

    public static void main(String[] args)//main method 
    {
        Pen p1 = new Pen();//object
        p1.color = "Red";//object.attribute
        p1.type = "Ballpoint";//object.attribute
       
        Pen p2 = new Pen();//object
        p2.color = "Blue";//object.attribute
        p2.type = "Fountain";//object.attribute 
    
        p1.printColor();//This keyword tells the compiler to call the method of the current object
        p2.printColor();//This batata hai kaunsa method call karna hai

    }
}