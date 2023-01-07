Stack implemenatation using Arrays


Array implementation of Stack
In array implementation, the stack is formed by using the array. All the operations regarding the stack are performed using arrays. Lets see how each operation can be implemented on the stack using array data structure.

Adding an element onto the stack (push operation)
Adding an element into the top of the stack is referred to as push operation. Push operation involves following two steps.

Increment the variable Top so that it can now refere to the next memory location.
Add element at the position of incremented top. This is referred to as adding new element at the top of the stack.
Stack is overflown when we try to insert an element into a completely filled stack therefore, our main function must always avoid stack overflow condition.

Algorithm:

begin   
    if top = n then stack full   
    top = top + 1  
    stack (top) : = item;  
end   
Time Complexity : o(1)