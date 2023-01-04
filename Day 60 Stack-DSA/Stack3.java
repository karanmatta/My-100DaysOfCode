public class Stack3 {
    public static void main (String[] args){
 
       // make a new stack
       Stack stack = new Stack(10);
 
       // push items on to the stack
       stack.push(3);
       stack.push(5);
       stack.push(9);
       stack.push(1);
       stack.push(12);
       stack.push(15);
 
       System.out.println("Element at top of the stack: " + stack.peek());
       System.out.println("Elements: ");
       
       // print stack data 
       while(!stack.isEmpty()){
          int data = stack.pop();
          System.out.println(data);
       }
              
       System.out.println("Stack full: " + stack.isFull());
       System.out.println("Stack empty: " + stack.isEmpty());
    }
}