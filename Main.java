//ATM Machine Main Program
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        AtmFunctionInterface afi =new AtmFunctionImplementation();// Create object of Interface to use Atm Function Implements parts
        String username1="yogesh"; String password1="Yogesh@123";
        String username2="Mitansh"; String password2="Mitansh@123";
        String username3="Shikha"; String password3="Shikha@123";
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to HDFC Bank");
        // USER NAME
        System.out.print("Enter Username:");
        String username=sc.nextLine();
        // Password
        System.out.print("Enter Password:");
        String password=sc.nextLine();
        if((username1.equals(username)) && (password1.equals(password)) ||
                (username2.equals(username)) && (password2.equals(password))||
                (username3.equals(username))&& (password3.equals(password)))
        {
            System.out.println("!!Greetings!!, You Login Successfully");
            while(true)
            {
                System.out.println("1. Add Amount in your Account\n2. Withdraw Amount\n" +
                        "3. View Available Balance\n4. Mini Statement\n5. Exit");
                System.out.print("Enter Choice:");
                int ch=sc.nextInt();
                if(ch==1)// Deposit Amount
                {
                    System.out.print("Enter Amount you want to deposit:");
                    long depositAmount=sc.nextLong();//
                    afi.depositAmount(depositAmount);
                }
                else if(ch==2)//withdraw Amount
                {
                    System.out.print("Enter Amount you want to Withdraw:");
                    long withdrawAmount=sc.nextLong();
                    afi.withdrawAmount(withdrawAmount);
                }
                else if(ch==3)// view Available Balance
                {
                    afi.viewBalance();
                }
                else if(ch==4)//view Ministatement
                {
                    afi.viewMiniStatement();
                }
                else if(ch==5)//exit
                {
                    System.out.println("Thanks for using HDFC ATM!! Please collect your Card." +
                            "\nThank you for being our valued Customer.");
                    System.exit(0);
                }
                else//incorrect choice
                {
                    System.out.println("Incorrect Choice");
                }
            }
        }
        else
            System.out.println("Invalid Credentials");
    }
}