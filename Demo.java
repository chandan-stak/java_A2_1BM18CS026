import java.util.*;
class Account
{
String name;
int cno;
float bal;
 Account()
  {
   name="NULL";
   cno=0;
   bal=0;
  }
 void input()
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the name of the customer");
  name=sc.nextLine();
  System.out.println("Enter the cno of the customer");
  cno=sc.nextInt();
  System.out.println("Enter the balance of the customer");
  bal=sc.nextFloat();
  }
  void display()
  {
  System.out.println("Name : " + name);
  System.out.println("Customer num : " + cno);
  System.out.println("Balance : " + bal);
  }
}
class Savings extends Account{
int r,t;
float si;
Savings(){
   name="NULL";
   cno=0;
   bal=0;
   r=0;
   bal=0;
}
void get(){
input();
Scanner sc=new Scanner(System.in);
  System.out.println("Enter the rate of Interest");
  r=sc.nextInt();
  System.out.println("Enter the time of Interest");
  t=sc.nextInt();
}
void compute()
{
si=(bal*r*t)/100;
}
void put(){
display();
System.out.println("Rate : " + r);
System.out.println("Time : " + t);
System.out.println("Sinmple Interest : " + si);
}
}
class Demo{
public static void main(String args[])
{
Savings ob=new Savings();
ob.get();
ob.compute();
ob.put();
}
}

 
