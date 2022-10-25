//Method overloading
class Methodover
{
    void add(int a, int b)
    {
        System.out.println("Sum of two numbers is: "+(a+b));
    }
    void add(int a, int b, int c)
    {
        System.out.println("Sum of three numbers is: "+(a+b+c));
    }
    void add(int a, int b, int c, int d)
    {
        System.out.println("Sum of four numbers is: "+(a+b+c+d));
    }
    public static void main(String args[])
    {
        Methodover obj = new Methodover();
        obj.add(10,20);
        obj.add(10,20,30);
        obj.add(10,20,30,40);
    }
}
// parameter ke hisaab se pta chalta hai ki konsa method call hoga
// method overloading is a technique of having more than one method with the same name but different parameters
// method overloading is used to increase the readability of the program
// method overloading is used to perform different tasks with the same method name
