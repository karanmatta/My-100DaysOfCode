/*  The square-ten tree decomposition of an array is defined as follows:

The lowest () level of the square-ten tree consists of single array elements in their natural order.
The  level (starting from ) of the square-ten tree consists of subsequent array subsegments of length  in their natural order. Thus, the  level contains subsegments of length , the  level contains subsegments of length , the  level contains subsegments of length , etc.
In other words, every  level (for every ) of square-ten tree consists of array subsegments indexed as:

Level  consists of array subsegments indexed as .
The image below depicts the bottom-left corner (i.e., the first  array elements) of the table representing a square-ten tree. The levels are numbered from bottom to top:

4x128 square-ten tree table

Task
Given the borders of array subsegment , find its decomposition into a minimal number of nodes of a square-ten tree. In other words, you must find a subsegment sequence  such as  for every , , , where every  belongs to any of the square-ten tree levels and  is minimal amongst all such variants.

Input Format

The first line contains a single integer denoting .
The second line contains a single integer denoting .

Constraints

The numbers in input do not contain leading zeroes.
Output Format

As soon as array indices are too large, you should find a sequence of  square-ten tree level numbers, , meaning that subsegment  belongs to the  level of the square-ten tree.

Print this sequence in the following compressed format:

On the first line, print the value of  (i.e., the compressed sequence block count).
For each of the  subsequent lines, print  space-separated integers,  and  (, ), meaning that the number  appears consequently  times in sequence . Blocks should be listed in the order they appear in the sequence. In other words,  should be equal to ,  should be equal to , etc.
Thus  must be true and  must be true for every . All numbers should be printed without leading zeroes.

Sample Input 0

1
10
Sample Output 0

1
1 1
Explanation 0

Segment  belongs to level  of the square-ten tree. */

import java.util.*;

public class Solution {
    
    public static class Group {
        public byte[] source;
        public int power;
        
        public Group(byte[] source, int power) {
            this.source = source;
            this.power = power;
        }
        
        public void print() {

            System.out.print(powerToLevel(power));
            System.out.print(" ");
            
            boolean nonZero = false;
            for(int i = 0; i < source.length; i++) {
                int d = source[i];
                if (d != 0) nonZero = true;
                if (nonZero) System.out.print(source[i]);
            }
            
            System.out.println();
        }

    }
    
    
    public static void main(String[] args)
    {        
        String[] input = readInput();

        List<Group> groups = solve(input[0], input[1]);
        
        //Util.validate(strL, strR, groups);

        printGroups(groups);    
        
    }

    public static String[] readInput()
    {
        try (Scanner in = new Scanner(System.in) ) {
            String L = in.nextLine().trim();
            String R = in.nextLine().trim();
            return new String[]{L, R};
        }        
    }    

    public static void printGroups(List<Group> groups)
    {
        System.out.println(groups.size());        
        for(Group group: groups) {
            group.print();
        }        
    }

    public static List<Group> solve(String strL, String strR)
    {
        byte[] L = toArray(strL, strR.length() + 1);
        byte[] R = toArray(strR, strR.length() + 1);
        
        subtract1(L);
        
        //System.out.println(Util.toStr(L) + " " + Util.toStr(R));
        
        eraseCommonPrefix(L, R);
        
        int tens = tens(realLength(R));
        
        byte[] upper = findUpper(L, tens);
        
        byte[] dif = new byte[upper.length];
        subtract(upper, L, dif);
        
        List<Group> groups = new ArrayList<Group>();

        addGroupsL(tens, dif, groups);
        
        byte[] lower = findLower(R, tens);
        
        byte[] dif2 = new byte[R.length];
        subtract(lower, upper, dif2);

        addGroup(groups, dif2, 0, R.length - tens, tens);
        
        byte[] dif3 = new byte[R.length];
        subtract(R, upper, dif3);
        
        addGroupsR(tens, groups, dif3);            
        
        return mergeSimilar(groups);
    }

    
    public static int powerToLevel(int p) {
        
        
        int count = 0;
        while(p > 0) {
            p /= 2;
            count++;
        }
        return count;
        
    }        
    
    public static void addGroupsR(int tens, List<Group> groups, byte[] dif3)
    {
        int c = tens;
        int t = tens;
        while(t > 0) {
            int tu = Math.max(t/2, 1);
            int b = dif3.length - 1 - (c - 1);
            int e = dif3.length - 1 - (c - tu) + 1;
            addGroup(groups, dif3, b, e, t/2);
            c -= tu;
            t /= 2;
        }
    }

    public static byte[] findLower(byte[] R, int tens)
    {
        byte[] lower = new byte[R.length];        
        System.arraycopy(R, 0, lower, 0, R.length - tens);
        return lower;
    }

    public static void addGroupsL(int tens, byte[] dif, List<Group> groups)
    {
        int c = 0;
        int t = 1;
        while(t <= tens) {
            int tu = Math.max(t / 2, 1);
            int b = dif.length - 1 - (c+tu-1);
            int e = dif.length - 1 - (c) + 1;
            addGroup(groups, dif, b, e, t/2);
            c += tu;
            t *= 2;
        }            
    }

    public static void eraseCommonPrefix(byte[] L, byte[] R)
    {
        assert(L.length == R.length);
        
        for(int i = 0; i < L.length; i++) {
            if (L[i] == R[i]) {
                L[i] = 0;
                R[i] = 0;
            } else {
                break;
            }
        }
    }

    public static byte[] findUpper(byte[] L, int tens)
    {        
        byte[] upper = new byte[L.length + 1];
        
        boolean nonZero = false;
        for(int i = 0; i < tens; i++) {
            int li = L.length - 1 - i;
            if (li >= 0 && L[li] > 0) {
                nonZero = true;
            }                 
        }            
        
        int carry = nonZero ? 1 : 0; 
        for(int i = tens; i < upper.length; i++) {
            byte s = 0;
            int lindex = L.length - 1 - i;
            if (lindex >= 0) {
                s = L[lindex];
            }
            int sum = s + carry;
            upper[upper.length - 1 - i] = (byte)(sum % 10);
            carry = sum / 10; 
        }
        
        return upper;
    }

    public static int realLength(byte[] r)
    {
        int i;
        for(i = 0; i < r.length; i++) {
            if (r[i] != 0) {
                break;
            }
        }
        
        return r.length - i;
    }

    public static List<Group> mergeSimilar(List<Group> src)
    {
        List<Group> result = new ArrayList<Group>();
        
        Group current = null;
        for(int i = 0; i < src.size(); i++) {
            Group g = src.get(i);                    
            if (null == current) {
                current = g;
            } else {
                if (current.power == g.power) {
                    current.source = add(current.source, g.source);
                } else {
                    result.add(current);
                    current = g;                    
                }
            }
        }
        
        if (current != null) {
            result.add(current);
        }
        
        return result;
    }

    public static void addGroup(List<Group> groups, byte[] dif, int b, int e, int power)
    {
        if (!allZeroes(dif, b, e)) {
            Group group = new Group(createCopy(dif, b, e), power);
            groups.add(group);
        }
    }

    public static byte[] createCopy(byte[] dif, int b, int e)
    {        
        byte[] result = new byte[e - b];
        System.arraycopy(dif, b, result, 0, e - b);
        return result;
    }

    public static boolean allZeroes(byte[] dif, int b, int e)
    {
        for(int i = b; i < e; i++) {
            if (dif[i] != 0)
                return false;
        }
        return true;
    }
    
    

    public static byte[] add(byte[] A, byte[] B)
    {        
        int l = Math.max(A.length, B.length) + 1;
        
        byte[] C = new byte[l];
        
        int carry = 0;
        for(int i = 0; i < l; i++) {
            int ia = A.length - 1 - i;
            int ib = B.length - 1 - i;
            int a = ia >= 0 ? A[ia] : 0;
            int b = ib >= 0 ? B[ib] : 0;
            int c = a + b + carry;
            carry = c / 10;
            
            int ic = C.length - 1 - i;
            C[ic] = (byte)(c % 10);
        }
        
        return C;
        
    }


    public static void subtract(byte[] A, byte[] B, byte[] C)
    {
        
        int borrow = 0;
        for(int i = 0; i < A.length; i++) {
            int a = A[A.length - 1 - i] - borrow;
            
            int b;
            if (i < B.length) 
                b = B[B.length - 1 - i];
            else 
                b = 0;
            
            if (b > a) {
                borrow = 1;
                a += 10;
            } else {
                borrow = 0;
            }
            
            C[C.length - 1 - i] = (byte)(a - b);
        }
        
        
    }

    /**
     * return largest x such that 10^x <= s
     */
    public static int tens(int len)
    {
        int x = 1;
        int c = len - 1;
        while(c > 0) {
            c /= 2;
            x *= 2;
        }
        return x/2;
    }

    public static byte[] toArray(String s, int len)
    {
        byte[] result = new byte[len];
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(s.length() - 1 - i);
            assert(c >= '0' && c <= '9');
            int d = c - '0';
            result[result.length - 1 - i] = (byte)d;
        }
        return result;
    }

    /**
     * s = all zeroes not allowed
     */
    public static void subtract1(byte[] s)
    {        
        for(int i = s.length - 1; i >= 0; i--) {
            int d = s[i];
            if (0 == d) {
                s[i] = 9; 
            } else {
                s[i]--;
                break;
            }
        }        
    }

}
