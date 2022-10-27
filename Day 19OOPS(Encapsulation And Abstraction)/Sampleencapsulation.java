
 
 class Account {
   public String name;
   protected String email;
   private String password;
 
   public void setPassword(String password) {
       this.password = password;
   }
}
public class Sampleencapsulation{
   public static void main(String args[]) {
       Account a1 = new Account();
       a1.name = "Karan Matta";
       a1.setPassword("abcd");
       a1.email = "Karanmatta28.com";
   }
}
