import Karan.MyClass;
/* import 'MyClass' class from 'names' myPackage */


public class Printname 
{
   public static void main(String args[]) 
   {       
      // Initializing the String variable 
      // with a value 
      String name = "Karan Matta";
      
      // Creating an instance of class MyClass in 
      // the package.
      MyClass obj = new MyClass();
      
      obj.getNames(name);
   }
}