

public class Stringbuildinsert2 {
    


    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("TONY");

        System.out.println("oRIGINAL string: "+sb);
        //insert in String
        sb.insert(2,'N');//insert in String
        System.out.println("String after insert:  "+sb);
        //Output:-TONNY

        //.delete is used to delete the character at the specified index
        //.delete(start index, end index)) 

        sb.delete(2,4);//delete in String
        System.out.println("String after delete:  "+sb);
        //output: TOY
        


        
        
    }

    
}





    

