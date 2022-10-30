//this keyword is used to refer current class instance variable.
//this keyword is used to invoke current class method (implicitly).
//this keyword is used to pass as an argument in the method call.
//this keyword is used to return the current class instance from the method.
//this() can be used to invoke current class constructor.


class Pen{
    String color;
    String type;

public void print(){
    System.out.println("Writing Something");
}
public void color(){
    System.out.println(this.color);//this keyword is used to refer current class instance variable.
   //This keyword se hum current class ke instance variable ko refer kar sakte hai.
   //This keyword se pta lgega ki kis class ke instance variable ko refer kar rahe hai.
   //This keyword se pta lgegea kaunsa method call hua hai. 
}
}
public class This{
    public static void main(){
        Pen p1 = new pen();
        p1.color = "Red";
        p1.type = "Ballpoint";
        p1.print();
        p1.color();
    }
}
