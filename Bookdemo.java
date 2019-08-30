import java.util.*;
class Book
{
String name;
String author;
double price;
int num_pages;
Book()
  {
   name="NULL";
   author="NULL";
   price=0.00;
   num_pages=0;
  }
 Book(String n,String a,double p,int num)
  {
   name=n;
   author=a;
   price=p;
   num_pages=num;
  }
 void set()
  {
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter the Name of the Book");
   name= sc.next();
   System.out.println("Enter the Auther of the Book");
   author= sc.next();
   System.out.println("Enter the Price of the Book");
   price= sc.nextDouble();
   System.out.println("Enter the number of pages of the Book");
   num_pages= sc.nextInt();
  }
  public String toString()
  {
   String s="Name: "+name+" Author: "+author+" Price : "+price+" Num_pages: "+num_pages;
   return s;
  }
 void get()
  {
   System.out.println("Name: "+name+"\nAuthor: "+author+" \nPrice :  "+price+"\nNum_pages: "+num_pages);
  }
}
class Bookdemo
{
 public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the number of books");
   int n=sc.nextInt();
   Book b1=new Book("Half girlfriend","Chetan Bhagat",525.50,300);
   System.out.println(b1);
   Book b[]=new Book[n];
   for(int i=0;i<n;i++)
   {
   b[i]=new Book();
   b[i].set();
   b[i].get();
   }
  }
}


Output:
Enter the number of books
2
Name: Half girlfriend Author: Chetan Bhagat Price : 525.5 Num_pages: 300
Enter the Name of the Book
abcd
Enter the Auther of the Book
efgh
Enter the Price of the Book
560.53
Enter the number of pages of the Book
340
Name: abcd
Author: efgh 
Price :  560.53
Num_pages: 340
Enter the Name of the Book
pqrs
Enter the Auther of the Book
cvbn
Enter the Price of the Book
567.40
Enter the number of pages of the Book
300
Name: pqrs
Author: cvbn 
Price :  567.4
Num_pages: 300

   
   
