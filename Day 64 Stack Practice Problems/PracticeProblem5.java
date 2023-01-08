/*You are a waiter at a party. There is a pile of numbered plates. Create an empty  array. At each iteration, , remove each plate from the top of the stack in order. Determine if the number on the plate is evenly divisible by the  prime number. If it is, stack it in pile . Otherwise, stack it in stack . Store the values in  from top to bottom in . In the next iteration, do the same with the values in stack . Once the required number of iterations is complete, store the remaining values in  in , again from top to bottom. Return the  array.

Example



An abbreviated list of primes is . Stack the plates in reverse order.



Begin iterations. On the first iteration, check if items are divisible by .


Move  elements to .


On the second iteration, test if  elements are divisible by .


Move  elmements to .


And on the third iteration, test if  elements are divisible by .


Move  elmements to .


All iterations are complete, so move the remaining elements in , from top to bottom, to .

. Return this list.

Function Description

Complete the waiter function in the editor below.

waiter has the following parameters:

int number[n]: the numbers on the plates
int q: the number of iterations
Returns

int[n]: the numbers on the plates after processing
Input Format

The first line contains two space separated integers,  and .
The next line contains  space separated integers representing the initial pile of plates, i.e., .

Constraints




Sample Input 0

5 1
3 4 7 6 5
Sample Output 0

4
6
3
7
5
Explanation 0

Initially:

 = [3, 4, 7, 6, 5]<-TOP

After 1 iteration (divide by 2, the 1st prime number):

 = [5, 7, 3]<-TOP

 = [6, 4]<-TOP

Move  elements to .


All iterations are complete, so move  elements to .

.

Sample Input 1

5 2
3 3 4 4 9
Sample Output 1

4
4
9
3
3
Explanation 1

Initially:

 = [3, 3, 4, 4, 9]<-TOP

After  iteration (divide by 2):

 = [9, 3, 3]<-TOP

 = [4, 4]<-TOP

Move  to .


After  iteration (divide by 3):

 = []<- TOP

 = [3, 3, 9]<-TOP

Move  elements to .


There are no values remaining in . */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
      
        
        Scanner sc = new Scanner(System.in);
        String nq[] = sc.nextLine().split(" ");
        int n = Integer.parseInt(nq[0]);
        int q = Integer.parseInt(nq[1]);
        String nums[] = sc.nextLine().split(" ");
        int pnum = 2;
        int primes[] = new int[q];
        MyStack first = new MyStack();
        MyStack rest = new MyStack();
        MyStack dpst = new MyStack();
        for(int i = 0; i < nums.length; ++i){
            first.push(Integer.parseInt(nums[i]));
        }
        for(int i = 0; i < q; ++i){
            if(first.head == null) break;
            primes[i] = pnum;
            while(first.head != null){
                int number = first.pop();
                if(number%pnum == 0)
                    dpst.push(number);
                else
                    rest.push(number);
            }
            while(dpst.head != null){
                System.out.println(dpst.pop());
            }
            pnum = nextPrimeNumber(pnum, i, primes);
            MyStack temp = rest;
            rest = first;
            first = temp;
        }
        while(first.head != null){
            System.out.println(first.pop());
        }
    }
    static int nextPrimeNumber(int num,int idx,int[] primes){
        if(num == 2) return 3;
        while(true){
            num = num + 2;
            boolean isPrime = true;
            for(int i = 0; i <= idx; ++i){
                if(num%primes[i] == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) break;
        }
        return num;
    }
}

class MyStack{
    Node head;
    MyStack(){
        head = null;
    }
    void push(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    
    int pop(){
        int data = head.data;
        head = head.next;
        return data;
    }
}
class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}
