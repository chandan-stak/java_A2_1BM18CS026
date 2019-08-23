import java.util.*;
class Student
{
String usn;
String name;
int sub;
int credits[];
int marks[];
float sgpa;
void input()
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the name of the student and USN");
 name=sc.next();
 usn=sc.next();
 System.out.println("Enter the number of subjects");
 sub=sc.nextInt();
 credits=new int[sub];
 marks=new int[sub];
 System.out.println("Enter the credits of subjects:");
 for(int i=0;i<sub;i++)
 {
   credits[i]=sc.nextInt();
 }
 System.out.println("Enter the marks of each subjects:");
 for(int i=0;i<sub;i++)
 {
  marks[i]=sc.nextInt();
 }
}
void sgpa()
{
  int x=0,sum=0;
  int gp[]=new int[sub];
 for(int i=0;i<sub;i++)
 {
  if(marks[i]>=90)
  {
   gp[i]=10;
  }
  else if(marks[i]>=75 && marks[i]<90)
  {
   gp[i]=9;
  }
  else if(marks[i]>=60 && marks[i]<75)
  {
   gp[i]=8;
  }
  else if(marks[i]>=50 && marks[i]<60)
  {
   gp[i]=7;
  }
  else if(marks[i]>=40 && marks[i]<50)
  {
   gp[i]=6;
  }
  else
  {
   gp[i]=0;
  }
  x+=credits[i]*gp[i];
  sum+=credits[i];
 } 
  sgpa=(float)x/sum;
}
void display()
{
  System.out.println("NAME="+name);
  System.out.println("USN="+usn);
  System.out.println("Marks in "+sub+" subjects:");
  for(int i=0;i<sub;i++)
  {
     System.out.println("Marks in "+(i+1)+" Subject: "+marks[i]);
  }
  System.out.println("SGPA="+sgpa);
}
}
class Studentdemo
{
public static void main(String args[])
{
Student s=new Student();
s.input();
s.sgpa();
s.display();
}
}
