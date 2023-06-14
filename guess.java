import java.util.*;
class Guess{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Random re =new Random();
    System.out.println("***Welcome to the Guessing game***\n");
    System.out.println("Rules:\n1.This game consists of 5 rounds \n2.Player has to guess the answer in atleast 3 Rounds\n3.Player should guess the randomly obtained number (Magic Number)\n4.Each round as 5 attempts to guess the magic number");
    System.out.println("\n Note:- The Magic Number Range is from 1 to 100");
    int rc=1,ac,guess=-1,points=0;
    System.out.print("\n Do You Want to Play This Game?(Y/N)");
    char ch = sc.nextLine().toLowerCase().charAt(0);
    if(ch=='y'){
        System.out.println("Let's start the game!");
        
        while(rc!=7){
            ac=1;
            int x=re.nextInt(101);
           
            System.out.println("*************************************************\n");
            System.out.println("Round :-"+rc);
            if(rc==5){
                System.out.println("<--------This is your final round---------->\n");
            }
            
            while(x!=guess){
            System.out.print("Enter the Guess:");
            guess=sc.nextInt();
            if(x<guess) System.out.println("The guess is higher than the Magic Number!\n");
            if(x>guess) System.out.println("The guess is lower than the Magic Number!\n");
            ac=ac+1;
            if(ac==7) break;
            }
            System.out.println("Round ---OutCome:\n");
            if(x==guess){
                System.out.println("Boyaah! Your Guess was correct\n");
                points++;
                if(rc!=5){
                    System.out.println("Keep up for next round!\n");
                }
                else{
                    System.out.println("You have done good in final round\n");
                }
            }
            if(ac==7){
                System.out.println("You ran out of attempts\n");
                if(rc!=5){
                    System.out.println("You May check your luck in next round\n");
                }
            }
            
            rc++;

        }
    }
    else{
        System.out.println("It's ok !!");
    }
    if(points>=3){
        System.out.println("Yes!!! YOU WON!!! THE GAME!!!!\n");
    }
    else{
        System.out.println("YOU LOSE!!!!!\n")
        System.out.println("It's alright try again!\n");
    }
   
    }
}