import java.util.*;
class Matrix
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the row size and column size:");
int m=sc.nextInt();
int n=sc.nextInt();
System.out.println("Enter matrix A");
int a[][]=new int[m][n];
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
a[i][j]=sc.nextInt();
}
}
int b[][]=new int[m][n];
int s[][]=new int[m][n];
int d[][]=new int[m][n];
System.out.println("Enter Matrix B:");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
b[i][j]=sc.nextInt();
s[i][j]=a[i][j]+b[i][j];
d[i][j]=a[i][j]-b[i][j];
}
}
System.out.println("The sum of  matrix A and B is:");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
 System.out.print(s[i][j]+" ");
}
System.out.print("\n");
}
System.out.println("The difference of the matrix A and B is:");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
 System.out.print(d[i][j]+" ");
}
System.out.print("\n");
}
}
}
