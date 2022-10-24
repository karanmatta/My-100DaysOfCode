//Parameterized Constructor

class B {
    int a;
    int b;
    B(int x, int y){
        a = x;
        b = y;
    }
}
//Object call krne pr constructor call hoga
public class Parconstructor{
    public static void main(String[] args) {
        B obj = new B(10, 20);
        System.out.println(obj.a);
        System.out.println(obj.b);
    }
}

