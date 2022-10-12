class Student{
    String name;
    int rollNo;
    int marks;
    public void printDetails(){
        System.out.println("Name: "+this.name);//This keyword is used to refer to the current object
        System.out.println("Roll No: "+this.rollNo);
        System.out.println("Marks: "+this.marks);
    }
   
} 
public class Studentdemo{// Main class Public class name should be same as the file name
    public static void main(String[] args) {
        Student s1 = new Student();//new keyword is used to create an object
        //new Student() is an object of Student class
        //after making object memory is allocated to the object
        s1.name = "Rahul";
        s1.rollNo = 1;//object.attribute
        s1.marks = 100;// calling the method of the current object
        s1.printDetails();
    }
}// Jis class ka object bana hai uska method call karna hai

//Jo class public hai uska name file name se same hona chahiye chahe wo main class ho ya nahi