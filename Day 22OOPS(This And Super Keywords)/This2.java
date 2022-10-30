class Student{
    String name;
    int age;
}
public void getInfo(){
    System.out.println(this.name);
    System.out.println(this.age);
}
public static void main(String[] args){
    Student s1 = new Student();
    s1.name = "Karan";
    s1.age = 21;
    s1.getInfo();
}
}
//this keyword se pta lgega ki kaunse object ka method call ho rha hai
//this keyword se pta lgega ki kaunse object ka variable ko refer kar rahe hai
//this keyword se pta lgega ki kaunse object ka constructor call ho rha hai

