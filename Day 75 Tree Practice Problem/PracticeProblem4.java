/*  We consider metric space to be a pair, , where  is a set and  such that the following conditions hold:

where  is the distance between points  and .

Let's define the product of two metric spaces, , to be  such that:

, where , .
So, it follows logically that  is also a metric space. We then define squared metric space, , to be the product of a metric space multiplied with itself: .

For example, , where  is a metric space. , where .

In this challenge, we need a tree-space. You're given a tree, , where  is the set of vertices and  is the set of edges. Let the function  be the distance between two vertices in tree  (i.e.,  is the number of edges on the path between vertices  and ). Note that  is a metric space.

You are given a tree, , with  vertices, as well as  points in . Find and print the distance between the two furthest points in this metric space!

Input Format

The first line contains two space-separated positive integers describing the respective values of  (the number of vertices in ) and  (the number of given points).
Each line  of the  subsequent lines contains two space-separated integers,  and , describing edge  in .
Each line  of the  subsequent lines contains two space-separated integers describing the respective values of  and  for point .

Constraints

Scoring

This challenge uses binary scoring, so you must pass all test cases to earn a positive score.

Output Format

Print a single non-negative integer denoting the maximum distance between two of the given points in metric space .

Sample Input 0

2 2
1 2
1 2
2 1
Sample Output 0

2
Explanation 0

The distance between points  and  is .

Sample Input 1

7 3
1 2
2 3
3 4
4 5
5 6
6 7
3 6
4 5
5 5
Sample Output 1

3
Explanation 1

The best points are  and , which gives us a distance of . */


import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static class Reader 
    { 
        final private int BUFFER_SIZE = 1 << 16; 
        private DataInputStream din; 
        private byte[] buffer; 
        private int bufferPointer, bytesRead; 
  
        public Reader() 
        { 
            din = new DataInputStream(System.in); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public Reader(String file_name) throws IOException 
        { 
            din = new DataInputStream(new FileInputStream(file_name)); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public String readLine() throws IOException 
        { 
            byte[] buf = new byte[64]; // line length 
            int cnt = 0, c; 
            while ((c = read()) != -1) 
            { 
                if (c == '\n') 
                    break; 
                buf[cnt++] = (byte) c; 
            } 
            return new String(buf, 0, cnt); 
        } 
  
        public int nextInt() throws IOException 
        { 
            int ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do
            { 
                ret = ret * 10 + c - '0'; 
            }  while ((c = read()) >= '0' && c <= '9'); 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        public long nextLong() throws IOException 
        { 
            long ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        public double nextDouble() throws IOException 
        { 
            double ret = 0, div = 1; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
  
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
  
            if (c == '.') 
            { 
                while ((c = read()) >= '0' && c <= '9') 
                { 
                    ret += (c - '0') / (div *= 10); 
                } 
            } 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        private void fillBuffer() throws IOException 
        { 
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
            if (bytesRead == -1) 
                buffer[0] = -1; 
        } 
  
        private byte read() throws IOException 
        { 
            if (bufferPointer == bytesRead) 
                fillBuffer(); 
            return buffer[bufferPointer++]; 
        } 
  
        public void close() throws IOException 
        { 
            if (din == null) 
                return; 
            din.close(); 
        } 
    } 
    
    static int[][] buildSparseTable(int[] arr) {
        int pow = 1;
        while ((1 << pow) < arr.length) pow++;
        int[][] result = new int[arr.length][pow];
        for (int i = 0; i < arr.length; i++) result[i][0] = arr[i];
        for (int j = 1; j <= pow; j++) {
            for (int i = 0; i + (1 << j) <= arr.length; i++) {
                result[i][j] = Math.min(result[i][j-1],
                                        result[i + (1 << (j-1))][j-1]);
            }
        }
        return result;
    }

    /*
     * Complete the treeCoordinates function below.
     */
    static int treeCoordinates(int n, int[][] edges, int[][] points) {
        ArrayList<Integer>[] nodes = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) nodes[i] = new ArrayList<Integer>();
        for (int[] edge : edges) {
            nodes[edge[0]].add(edge[1]);
            nodes[edge[1]].add(edge[0]);
        }

        // Find diameter (two BFS)
        int root = 0;
        int tail = 0;
        {
            class Entry {
                int node;
                int dist;
                public Entry(int node, int dist) {
                    this.node = node;
                    this.dist = dist;
                }
            }
            LinkedList<Entry> Q = new LinkedList<Entry>();
            boolean[] visited = new boolean[n + 1];
            visited[1] = true;
            Q.offer(new Entry(1, 0));
            int maxDist = 0;
            int farNode = 1;
            while (Q.size() > 0) {
                Entry cur = Q.poll();
                if (cur.dist > maxDist) {
                    maxDist = cur.dist;
                    farNode = cur.node;
                }
                for (int neighbor : nodes[cur.node]) {
                    if (visited[neighbor]) continue;
                    visited[neighbor] = true;
                    Q.offer(new Entry(neighbor, cur.dist + 1));
                }
            }
            root = farNode;
            
            Q = new LinkedList<Entry>();
            visited = new boolean[n + 1];
            visited[root] = true;
            Q.offer(new Entry(root, 0));
            maxDist = 0;
            farNode = root;
            while (Q.size() > 0) {
                Entry cur = Q.poll();
                if (cur.dist > maxDist) {
                    maxDist = cur.dist;
                    farNode = cur.node;
                }
                for (int neighbor : nodes[cur.node]) {
                    if (visited[neighbor]) continue;
                    visited[neighbor] = true;
                    Q.offer(new Entry(neighbor, cur.dist + 1));
                }
            }
            tail = farNode;
        }
        //System.out.println("root = " + root + ", tail = " + tail);

        // Euler tour
        int[] eulerTour = new int[2*n - 1];
        final int[] depth = new int[n + 1];
        int[] eulerLevels = new int[2*n - 1];
        int[] eulerIndex = new int[n + 1];
        boolean[] visited = new boolean[n + 1];
        
        int[] S = new int[n];
        int spos = 0;
        S[0] = root;
        int pos = 0;
        int[] neighborCount = new int[n + 1];
        while (spos > -1) {
            int cur = S[spos--];
            if (!visited[cur]) {
                depth[cur] = spos + 1;
                eulerIndex[cur] = pos;
                visited[cur] = true;
            }
            eulerLevels[pos] = spos + 1;
            eulerTour[pos] = cur;
            pos++;
            while (neighborCount[cur] < nodes[cur].size()) {
                if (visited[nodes[cur].get(neighborCount[cur])]) {
                    neighborCount[cur]++;
                    continue;
                }
                int next = nodes[cur].get(neighborCount[cur]);
                //parent[next] = cur;
                S[++spos] = cur;
                S[++spos] = next;
                neighborCount[cur]++;
                break;
            }
        }
        //System.out.println(Arrays.toString(eulerTour));
        //System.out.println(Arrays.toString(eulerLevels));
        //System.out.println(Arrays.toString(eulerIndex));

        // Sparse table
        int[][] lookup = buildSparseTable(eulerLevels);
        //for (int i = 0; i < lookup.length; i++) {
        //    for (int j = 0; j < lookup[0].length; j++) {
        //        System.out.print(lookup[i][j] + " ");
        //    }
        //    System.out.println();
        //}

        class Entry implements Comparable<Entry> {
            int x;
            int y;
            int val;
            public Entry(int x, int y, int val) {
                this.x = x;
                this.y = y;
                this.val = val;
            }
            public int compareTo(Entry other) {
                return val - other.val;
            }
        }
        List<Entry> list1 = new ArrayList<Entry>(points.length);
        List<Entry> list2 = new ArrayList<Entry>(points.length);
        List<Entry> list3 = new ArrayList<Entry>(points.length);
        List<Entry> list4 = new ArrayList<Entry>(points.length);

        for (int i = 0; i < points.length; i++) {
            int x = points[i][0];
            int y = points[i][1];
            int xLcaLevel;
            {
                int start = Math.min(eulerIndex[x], eulerIndex[tail]);
                int end = Math.max(eulerIndex[x], eulerIndex[tail]);
                int pow = 0;
                while (1 << (pow + 1) <= (end - start)) pow++;
                xLcaLevel = Math.min(lookup[start][pow],   
                                     lookup[end + 1 - (1<<pow)][pow]);
            }
            int yLcaLevel;
            {
                int start = Math.min(eulerIndex[y], eulerIndex[tail]);
                int end = Math.max(eulerIndex[y], eulerIndex[tail]);
                int pow = 0;
                while (1 << (pow + 1) <= (end - start)) pow++;
                yLcaLevel = Math.min(lookup[start][pow],   
                                     lookup[end + 1 - (1<<pow)][pow]);
            }
            int val1 = depth[x] + depth[y];
            list1.add(new Entry(x, y, val1));
            int val2 = -depth[x] - depth[y] + 2*xLcaLevel + 2*yLcaLevel;
            list2.add(new Entry(x, y, val2));
            int val3 = depth[x] + depth[y] - 2*xLcaLevel;
            list3.add(new Entry(x, y, val3));
            int val4 = -depth[x] - depth[y] + 2*yLcaLevel;
            list4.add(new Entry(x, y, val4));
        }
        Collections.sort(list1, Collections.reverseOrder());
        Collections.sort(list2);
        Collections.sort(list3, Collections.reverseOrder());
        Collections.sort(list4);

        //int maxDist = Math.max(list1.get(0).val - list2.get(0).val, list3.get(0).val - list4.get(0).val);
        int maxDist = 0;

        for (int i = 0; i < points.length; i++) {
            // ith increasing diagonal
            boolean shouldContinue = false;
            for (int j = 0; j <= i; j++) {
                Entry e1 = list1.get(i-j);
                Entry e2 = list2.get(j);
                int potential12 = e1.val - e2.val;
                if (potential12 > maxDist) {
                    shouldContinue = true;
                    int x1 = e1.x;
                    int y1 = e1.y;
                    int x2 = e2.x;
                    int y2 = e2.y;
                    int xLcaLevel;
                    {
                        int start = Math.min(eulerIndex[x1], eulerIndex[x2]);
                        int end = Math.max(eulerIndex[x1], eulerIndex[x2]);
                        int pow = 0;
                        while (1 << (pow + 1) <= (end - start)) pow++;
                        xLcaLevel = Math.min(lookup[start][pow],   
                                             lookup[end + 1 - (1<<pow)][pow]);
                    }
                    int yLcaLevel;
                    {
                        int start = Math.min(eulerIndex[y1], eulerIndex[y2]);
                        int end = Math.max(eulerIndex[y1], eulerIndex[y2]);
                        int pow = 0;
                        while (1 << (pow + 1) <= (end - start)) pow++;
                        yLcaLevel = Math.min(lookup[start][pow],   
                                             lookup[end + 1 - (1<<pow)][pow]);
                    }
                    int actual12 = depth[x1] + depth[x2] - 2*xLcaLevel
                                   + depth[y1] + depth[y2] - 2*yLcaLevel;
                    maxDist = Math.max(maxDist, actual12);
                }
                Entry e3 = list3.get(i-j);
                Entry e4 = list4.get(j);
                int potential34 = e3.val - e4.val;
                if (potential34 > maxDist) {
                    shouldContinue = true;
                    int x3 = e3.x;
                    int y3 = e3.y;
                    int x4 = e4.x;
                    int y4 = e4.y;
                    int xLcaLevel;
                    {
                        int start = Math.min(eulerIndex[x3], eulerIndex[x4]);
                        int end = Math.max(eulerIndex[x3], eulerIndex[x4]);
                        int pow = 0;
                        while (1 << (pow + 1) <= (end - start)) pow++;
                        xLcaLevel = Math.min(lookup[start][pow],   
                                             lookup[end + 1 - (1<<pow)][pow]);
                    }
                    int yLcaLevel;
                    {
                        int start = Math.min(eulerIndex[y3], eulerIndex[y4]);
                        int end = Math.max(eulerIndex[y3], eulerIndex[y4]);
                        int pow = 0;
                        while (1 << (pow + 1) <= (end - start)) pow++;
                        yLcaLevel = Math.min(lookup[start][pow],   
                                             lookup[end + 1 - (1<<pow)][pow]);
                    }
                    int actual34 = depth[x3] + depth[x4] - 2*xLcaLevel
                                   + depth[y3] + depth[y4] - 2*yLcaLevel;
                    maxDist = Math.max(maxDist, actual34);
                }
            }
            if (!shouldContinue) break;
        }

        return maxDist;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        Reader reader = new Reader();

        int n = reader.nextInt();
        int m = reader.nextInt();

        int[][] edges = new int[n-1][2];

        for (int edgesRowItr = 0; edgesRowItr < n-1; edgesRowItr++) {
            edges[edgesRowItr][0] = reader.nextInt();
            edges[edgesRowItr][1] = reader.nextInt();
        }

        int[][] points = new int[m][2];

        for (int pointsRowItr = 0; pointsRowItr < m; pointsRowItr++) {
            points[pointsRowItr][0] = reader.nextInt();
            points[pointsRowItr][1] = reader.nextInt();
        }

        int result = treeCoordinates(n, edges, points);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
