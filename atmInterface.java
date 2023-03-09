import java.util.*;
import java.io.*;

class atmInterface{
   static int balance = 10000, withdraw , deposit, prev;
   Scanner sc = new Scanner(System.in);

 static Boolean checkDetails(String name , String password){
      return name.equals("sathvika") && password.equals("sathvika04");
   }

 static void checkBalance(){
   System.out.println("Balnace :" + balance);
 }

 static void history(){
    System.out.println("previous transcation :"+ prev);
  }


static void withDraw(){
     Scanner sc = new Scanner(System.in);
     System.out.println("enter money to withdraw :");
     int withdraw = sc.nextInt();
     if( balance >= withdraw ){
         balance = balance - withdraw;
         System.out.println("Please collect your money");
      }
      else{
         System.out.println("Insufficient Balance");
      } 
  }


static void deposit(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter money to be deposited : ");
    deposit = sc.nextInt();
    balance = balance + deposit;
    prev = deposit;
    System.out.println("your money has been successfully deposited");
  }


 static void transfer(){
   Scanner sc = new Scanner(System.in);
   System.out.print("enter name of the person :");
   String name = sc.nextLine();
   System.out.println("enter the account number ");
   String accountnum = sc.nextLine();
   System.out.println("Enter the amount to be transfer :");
   int transferamt = sc.nextInt();
   prev = transferamt;
   if( transferamt > balance ){
        System.out.println("Insufficient money to be transfer ");
      }
   else{
      int customerBalance = 5000;
       balance = balance - transferamt ;
       customerBalance += transferamt;
      System.out.println("transfer successful ");
    }
}

public final static void clrscr()  {
try{  
try  
{  
final String os = System.getProperty("os.name");  
if (os.contains("Windows"))  
{  
Runtime.getRuntime().exec("cls");  
}  
else  
{  
Runtime.getRuntime().exec("clear");  
}  
}  
catch (final Exception e)  
{  
new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
}  
}catch(final Exception es){
}
}


public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int choice;
    System.out.println("Enter your username : ");
    String name = sc.nextLine();
    System.out.println("Enter your password :");
    String password = sc.nextLine();
    clrscr();
    if(checkDetails(name,password)){
      do{
         System.out.println("\n1.check balance \n2.Withdraw \n3.Deposit \n4.Transfer \n5.history \n6.Quit\n ");
         choice = sc.nextInt();
         clrscr();
         switch(choice){
          case 1 : checkBalance();
                   break;
          case 2 : withDraw();
                   break;
          case 3 : deposit();
                   break;  
          case 4 : transfer();
                   break;
          case 5 : history();
                   break;
          case 6 : System.exit(0);
   }
 }while(true);
}
}
}