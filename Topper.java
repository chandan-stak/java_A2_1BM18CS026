import java.util.*;
class Person{
String name;
int age;
String address;
void input()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name of the student");
name=sc.nextLine();
System.out.println("Enter the age of the student");
age=sc.nextInt();
System.out.println("Enter the address of the student");
address=sc.next();
}
void output(){
System.out.println("\nName: " + name);
System.out.println("\nAge: " + age);
System.out.println("\nAddress: " + address);
}
}
class Student extends Person{
int rno;
int sem;
void input()
{
Scanner sc=new Scanner(System.in);
super.input();
System.out.println("Enter the rno of the student");
rno=sc.nextInt();
System.out.println("Enter the sem of the student");
sem=sc.nextInt();
}
void output(){
super.output();
System.out.println("\nRoll no: " + rno);
System.out.println("\nsem: " + sem);
}
}
class Exam extends Student{
int marks1;
int marks2;
double avg;
void input(){
Scanner sc=new Scanner(System.in);
super.input();
System.out.println("Enter the marks1 of the student");
marks1=sc.nextInt();
System.out.println("Enter the marks2 of the student");
marks2=sc.nextInt();
}
double compute(){
avg=(marks1+marks2)/2;
return avg;
}
void output(){
super.output();
System.out.println("\nMarks1: " + marks1);
System.out.println("\nMarks2: " + marks2);
System.out.println("\nAverage: "+ avg);
}
}
class Topper{
public static void main(String args[])
{
int n,a=0;
double t=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of the students");
n=sc.nextInt();
Exam e[]=new Exam[n];
for(int i=0;i<n;i++)
{
e[i]=new Exam();
e[i].input();
if(e[i].compute()>t)
{
t=e[i].compute();
a=(i+1);
}
}
System.out.println("\nTopper is student " + a);
System.out.println("Details of the topper :");
e[a-1].output();
}
}


