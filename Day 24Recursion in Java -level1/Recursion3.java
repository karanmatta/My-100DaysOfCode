public class Recursion3 {
    public static void printSum(int i, int n,int sum ){
        if (i==n){
            sum+=i;//N is included in the sum
            System.out.println(sum);//print the sum
            return;
        }
        sum+=i;
        printSum(i+1,n,sum);
        System.out.println(i);
        // Iske baad kuch nhi likha h to return aate hue memory se nikal jayega
    }
    public static void main(String[] args){
        int n=5; // This is the base case ,n=5 is the last number to be added      
        int sum=0;
        printSum(1,n,sum);//OR printSum(1,5,0);
    }
    
}
//output:15
// 4
// 3
// 2
// 1
// Yh output isilie aya kyuki humne recursion ke andar ek sum variable bna diya h jisme humne sum+=i; likha h
// Aur sum ke baad i ki value bhi print hongi wapsi aate hue stack mai
