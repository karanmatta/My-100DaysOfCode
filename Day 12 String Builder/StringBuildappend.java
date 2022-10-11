

public class StringBuildappend{
    


    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("H");
        /*In string
         * str =str+"E";
         * str =str+"L";
         * str =str+"L";
         * str =str+"O";
         * In case of String new string forms
         * 
         * But in case of Append changes are in same string Builder
         * 
        */
        
        sb.append("E");
        sb.append("L");
        sb.append("L");
        sb.append("O");
        System.out.println(sb);
        //Output:-HELLO
        //append is used to append the string at the end of the string
        
        //.length is used to find the length of the string
        System.out.println("Length of string is:  "+sb.length());


        
    }

    
}





    

