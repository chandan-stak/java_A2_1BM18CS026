import java.util.*;
abstract class shape{
int a,b;
abstract void printArea();
}
class Rectangle extends shape{
Rectangle(int a,int b)
{
this.a=a;
this.b=b;
}
void printArea()
{
System.out.println("Area="+(a*b));
}
}
class Triangle extends shape{
Triangle(int a,int b)
{
this.a=a;
this.b=b;
}
void printArea()
{
System.out.println("Area="+(0.5*a*b));
}
}
class Circle extends shape{
Circle(int a)
{
this.a=a;
}
void printArea()
{
System.out.println("Area="+(3.14*a*a));
}
}
class Demo1
{
public static void main(String args[])
{
int c,ch;
Scanner sc=new Scanner(System.in);
shape s=null;
do{
System.out.println("Enter \n1.Rectangle \n2.Triangle \n3.Circle \n");
c=sc.nextInt();
switch(c)
{
case 1: System.out.println("Enter length");
	int l = sc.nextInt();
	System.out.println("Enter breadth");
	int b = sc.nextInt();
        s=new Rectangle(l,b);
        break;
case 2: System.out.println("Enter base");
	int ba = sc.nextInt();
	System.out.println("Enter height");
	int h = sc.nextInt();
        s=new Triangle(ba,h);
        break;
case 3: System.out.println("Enter radius");
	int r = sc.nextInt();
        s=new Circle(r);
        break;
default: System.out.println("Enter valid key");
         break;
}
if(s!=null)
s.printArea();
System.out.println("Enter any value to continue and 1 to exit");
ch = sc.nextInt();
}while(ch!=1);
}
}



