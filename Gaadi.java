import java.util.*;
class Vehicle
{
String model;
int year;
String color;
static int no;
 Vehicle(String model,int year,String color)
 {
  this.model=model;
  this.year=year;
  this.color=color;
  no++;
 }
 void display()
 {
 System.out.println("----Details of car------");
 System.out.println("Model : " + model);
 System.out.println("Year : " + year);
 System.out.println("Color : " + color);
 }
 static void func(){
  System.out.println("Total number of cars are: " +no); 
}
}
class Gaadi{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of cars: ");
n=sc.nextInt();
Vehicle ob[]=new Vehicle[n];
for(int i=0;i<n;i++)
{
System.out.println("Enter the model of car: ");
String model=sc.next();
System.out.println("Enter the year of car: ");
int year=sc.nextInt();
System.out.println("Enter the color of car: ");
String color=sc.next();
ob[i]=new Vehicle(model,year,color);
ob[i].display();
}
Vehicle.func();
}
}


