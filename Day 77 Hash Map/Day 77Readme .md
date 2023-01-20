It is the process of converting an object into an integer value. The integer value helps in indexing and faster searches.

What is HashMap
HashMap is a part of the Java collection framework. It uses a technique called Hashing. It implements the map interface. It stores the data in the pair of Key and Value. HashMap contains an array of the nodes, and the node is represented as a class. It uses an array and LinkedList data structure internally for storing Key and Value. There are four fields in HashMap.

Working of HashMap in Java
Before understanding the internal working of HashMap, you must be aware of hashCode() and equals() method.

equals(): It checks the equality of two objects. It compares the Key, whether they are equal or not. It is a method of the Object class. It can be overridden. If you override the equals() method, then it is mandatory to override the hashCode() method.
hashCode(): This is the method of the object class. It returns the memory reference of the object in integer form. The value received from the method is used as the bucket number. The bucket number is the address of the element inside the map. Hash code of null Key is 0.
Buckets: Array of the node is called buckets. Each node has a data structure like a LinkedList. More than one node can share the same bucket. It may be different in capacity.
Working of HashMap in Java
Insert Key, Value pair in HashMap
We use put() method to insert the Key and Value pair in the HashMap. The default size of HashMap is 16 (0 to 15).

Example
In the following example, we want to insert three (Key, Value) pair in the HashMap.

HashMap<String, Integer> map = new HashMap<>();  
map.put("Aman", 19);  
map.put("Sunny", 29);  
map.put("Ritesh", 39);  
Let's see at which index the Key, value pair will be saved into HashMap. When we call the put() method, then it calculates the hash code of the Key "Aman." Suppose the hash code of "Aman" is 2657860. To store the Key in memory, we have to calculate the index.

Calculating Index
Index minimizes the size of the array. The Formula for calculating the index is:

Index = hashcode(Key) & (n-1)  
Where n is the size of the array. Hence the index value for "Aman" is:

Index = 2657860 & (16-1) = 4  