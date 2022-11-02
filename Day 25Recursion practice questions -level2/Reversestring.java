// print a string in Java "abcd" -> "dcba" using recursion
class Reversestring {
   public static void printReverse(String str, int indx ) {
    if(indx==0){
        System.out.print(str.charAt(indx));
        return;
    }
    System.out.print(str.charAt(indx));
    printReverse(str, indx-1);
    //Yha pr recursion call kr rhe hain coz hume last se print krna hain indx-1 se hum 0 index tk print krenge jaise hi hum 0 index pr phuchenge to base case chlega and print hojayega
   }
   public static void main(String[] args) {
         String str = "abcd";
         printReverse(str, str.length()-1);//str.length()-1 kyunki index 0 se start hota hain agr length 5 hain to indexing 0 se 4 tk hota hain
    
   }
    
}
