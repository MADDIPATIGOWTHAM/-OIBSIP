import java.util.*;
class Atm{
     public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Account a=new Account();
        int a2=0,a3=0,a4=0;
        System.out.println("***Welcome to the ATM***");
        System.out.print("Enter your User name:");
        String user_name=sc.nextLine();
        System.out.print("\n");
        System.out.print("Enter the Pin:");
        int pin=sc.nextInt();
        System.out.print("\n");
        if(!a.verify_user(user_name)&& a.verify_pin(pin)){
            System.out.println("Your logged in-->");
            while(true){
                System.out.println("Select the below option for the any transaction: \n");
                System.out.println("1.Transaction History\n2.Withdraw\n3.Deposit\n4.Transfer\n5.Quit\n");
                System.out.print("Enter Your type of transaction: ");
                int b=sc.nextInt();
                int amount=0;
                switch (b) {
                    case 1:
                        System.out.println("You have Withdrawed:"+a2);
                        System.out.println("You have deposited:"+a3);
                        System.out.println("You have Transfered:"+a4+"\n");

                        break;
                    case 2:
                        System.out.print("\nEnter the Amount:");
                        amount=sc.nextInt();
                        a2=a2+amount;
                        System.out.println("Balance:"+a.credit(amount));
                        break;
                    case 3:
                        System.out.println("\nEnter the Amount:");
                         amount=sc.nextInt();
                        a3=a3+amount;
                        System.out.println("Balance:"+a.debit(amount));
                        break;
                    case 4:
                        System.out.println("\nEnter the Amount:");
                         amount=sc.nextInt();
                        System.out.println("Enter the name of the person to transfer:");
                        String name=sc.nextLine();
                        System.out.println("The amount:"+amount +" is transfered to"+ name);
                        System.out.println("Balance:"+a.debit(amount));
                        break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        System.out.print("Your choose is not in the above list \n");
                        break;
                }
            }
        }
        else{
            System.out.println("Your credentials are not matched");
        }
    } 
}
class Account{
    private String name="Gowtham Maddipati";
    private int pin=2004;
    private int Balance=1000000;
    boolean verify_user(String name){
        
            return (this.name == name);
       
    }
    boolean verify_pin(int pin){
        
          
        return (this.pin==pin);
    }
    int credit(int amt){
        this.Balance=this.Balance+amt;
        return this.Balance;
    }
    int debit(int amt){
        this.Balance=this.Balance-amt;
        return this.Balance;
    }

}
