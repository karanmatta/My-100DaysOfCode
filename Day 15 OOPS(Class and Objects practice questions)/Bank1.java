import java.util.Scanner;

class Bank
    {
        int Withdraw(int Balance,int b)
        {
           return Balance=Balance-b;
        }
        int Deposite(int Balance,int b)
        {
            return Balance=Balance+b;
        }
        void AccountDetails(int Balance)
        {
            System.out.println("Account No.: 123456789");
            System.out.println("Name: Vit Bhopal");
            System.out.println("Account Type: Current");
            System.out.println("Balance: "+Balance);
        }
        int CurrentBalance(int Balance)
        {
            return Balance;
        }
    }
  public class Bank1 {
      public static void main(String[] args) {
          int Balance = 10000;
          Scanner in=new Scanner(System.in);
          Bank b=new Bank();
          int w,d;
          System.out.println("Press: \n1.current balance \n2.Account Details\n3.Withdraw money\n4.Deposit money");
          int c=in.nextInt();
          switch (c)
          {
              case 1:
                  System.out.println("Balance: "+b.CurrentBalance(Balance));
              break;
              case 2: b.AccountDetails(Balance);
              break;
              case 3:
                  System.out.println("Enter amount you want to withdraw");
                  w=in.nextInt();
                  if(Balance>=w)
                  {
                    Balance=b.Withdraw(Balance,w);
                  System.out.println("Current Balance: "+Balance);}
                  else
                      System.out.println("Insufficient Balance");
                  break;
              case 4:
                  System.out.println("Enter amount you want to deposit");
                  d=in.nextInt();
                  Balance=b.Deposite(Balance,d);
                  System.out.println("Current Balance: "+Balance);
                  break;
              default:
                  System.out.println("Wrong Input");
          }
      }

      int Balance = 10000;
  }
