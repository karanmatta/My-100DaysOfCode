public class Firstandlastoccurance {
    public static int first = -1;
    public static int last = -1;

    public static void findOccurance(String str , int indx , char element){
 
        if(indx == str.length()){
            System.out.println("First occurance is at index " + first);//Yha pr first occurance print kr rhe hain
            System.out.println("Last occurance is at index " + last);
            return;

        }
        char currentchar = str.charAt(indx);//Yha pr hume current character chahiye
        if(currentchar == element){
            if(first == -1){
                first = indx;
            }
            last = indx;
        }
        findOccurance(str, indx+1, element);

    }
    public static void main(String[] args){
        String str = "abaacdaefaah";
        char element = 'a';
        findOccurance(str, 0, element);

    }

    
}
