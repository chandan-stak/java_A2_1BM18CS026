import java.util.*;
class Sort
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of the array");
int n=sc.nextInt();
int a[]=new int[n];
System.out.println("enter the array elements");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
int temp;
for(int i=0;i<n-1;i++)
{
 for(int j=0;j<n-i-1;j++)
   {
    if(a[j]>a[j+1])
     {
      temp=a[j];
      a[j]=a[j+1];
      a[j+1]=temp;
      }
   }
}
System.out.println("The sorted array is:");
for(int i=0;i<n;i++)
{
System.out.print(a[i]+" ");
} 
}
}
