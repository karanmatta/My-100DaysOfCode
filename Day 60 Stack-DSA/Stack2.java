public class Stack2 {
    private int size;           // size of the stack
    private int[] intArray;     // stack storage
    private int top;            // top of the stack
 
    // Constructor 
    public Stack2(int size){
       this.size = size;           
       intArray = new int[size];   //initialize array
       top = -1;                   //stack is initially empty
    }
 
    // Operation : Push
    // push item on the top of the stack 
    public void push(int data) {
 
       if(!isFull()){
          // increment top by 1 and insert data 
          intArray[++top] = data;
       }else{
          System.out.println("Cannot add data. Stack is full.");
       }      
    }
 
    // Operation : Pop
    // pop item from the top of the stack 
    public int pop() {
       //retrieve data and decrement the top by 1
       return intArray[top--];        
    }
 
    // Operation : Peek
    // view the data at top of the stack    
    public int peek() {       
       //retrieve data from the top
       return intArray[top];
    }
 
    // Operation : isFull
    // return true if stack is full 
    public boolean isFull(){
       return (top == size-1);
    }
    
    // Operation : isEmpty
    // return true if stack is empty 
    public boolean isEmpty(){
       return (top == -1);
    }
 }