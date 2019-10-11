import java.util.*;

class Account
{
  String cname;
  int acno;
  char type;
  double bal=1000.00;
  Scanner sc=new Scanner(System.in);
  void getdata()
  {
       System.out.println("Enter the name, acount number");
       cname=sc.next();
       acno=sc.nextInt();

  }
  void display()
  { 
       System.out.println("Name:"+cname);
       System.out.println("Account number:"+acno);
       System.out.println("Balance:"+bal);
  }
  void deposit()
  {
    System.out.println("Enter the amount to deposit:");
    double x=sc.nextDouble();
    bal=bal+x;
  }
  void compound(){}
  void withdrawl(){}
}

class Sav_ac extends Account
{
  double intr;
  Scanner sc=new Scanner(System.in);
  void compound()
  {
      final double r=0.04;    
      System.out.println("Enter the time:");
      int t=sc.nextInt();
      intr=(double)bal*Math.pow(1+r,t);
      bal=bal+intr; 
  } 
  
  void withdrawl()
  {
    double x;
    System.out.println("Enter the amount to withdraw:");
    x=sc.nextDouble();
    if(bal<x)
        System.out.println("LOW Balance!!");
    else
        bal=bal-x;
  }
}

class Cur_ac extends Account
{
   Scanner sc=new Scanner(System.in);
   void withdrawl()
  {
    double x;
    System.out.println("You should maintain a min balance of 1000 rupees:");
    System.out.println("Enter the amount to withdraw:");
    x=sc.nextDouble();
    if(bal<x)
        System.out.println("LOW Balance!!");
    else
        bal=bal-x;
    if(bal<1000)
       bal=bal-10;   
  }   
}

class Bankdemo
{
   public static void main(String args[])
   {  
     Scanner sc=new Scanner(System.in);
     Account ref=null;
     Account t=new Account();
     System.out.println("Enter the type of account: S for saving, C for current "); 
     t.type=sc.next().charAt(0);
     if(t.type=='S')
     {
        ref=new Sav_ac();
        ref.getdata();
        System.out.println("Computing interest....");
        ref.compound();
        System.out.println("What do you want: Deposit(1) or Withdraw(2) : ");
        int ch=sc.nextInt();
        if(ch==1)
           ref.deposit();
        else if(ch==2)
           ref.withdrawl();
        else
           System.out.println("Wrong choice!!");
        ref.display();
     }
     else if(t.type=='C')
     {
        ref=new Cur_ac();
        ref.getdata();
        System.out.println("What do you want: Deposit(1) or Withdraw(2) : ");
        int ch=sc.nextInt();
        if(ch==1)
           ref.deposit();
        else if(ch==2)
           ref.withdrawl();
        else
           System.out.println("Wrong choice!!");
        ref.display();
     }
   }
}           
 

