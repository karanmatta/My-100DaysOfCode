public class Stack3 {
    int size;
    int arr[];
    int top;
 
    Stack3(int size) {
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }
 
    public void push(int pushedElement) {
        if (!isFull()) {
            top++;
            arr[top] = pushedElement;
            System.out.println("Pushed element:" + pushedElement);
        } else {
            System.out.println("Stack is full !");
        }
    }
 
    public int pop() {
        if (!isEmpty()) {
            int returnedTop = top;
            top--;
            System.out.println("Popped element :" + arr[returnedTop]);
            return arr[returnedTop];
 
        } else {
            System.out.println("Stack is empty !");
            return -1;
        }
    }
 
    public int peek() {
        if(!this.isEmpty())
                        return arr[top];
                else
                {
                        System.out.println("Stack is Empty");
                        return -1;
                }
    }
 
    public boolean isEmpty() {
        return (top == -1);
    }
 
    public boolean isFull() {
        return (size - 1 == top);
    }
 
    public static void main(String[] args) {
        Stack3 Stack3 = new Stack3(10);
        Stack3.pop();
        System.out.println("=================");
        Stack3.push(10);
        Stack3.push(30);
        Stack3.push(50);
        Stack3.push(40);
        System.out.println("=================");
        Stack3.pop();
        Stack3.pop();
        Stack3.pop();
        System.out.println("=================");
    }
}