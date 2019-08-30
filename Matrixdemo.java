import java.util.*;
class Matrix
{
	int m[][]=new int[2][2];
        int i,j,r,c;
	Matrix()
	{
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				m[i][j]=0;
			}
		}
	}
	Matrix(int p,int q)
	{
		r=p;
		c=q;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter elements in Matrix");
		for(i=0;i<r;i++)
		{
		    for(j=0;j<c;j++)
		      {
			m[i][j]=s.nextInt();
		      }
		}
	}
	Matrix(Matrix ob)
	{
		r=ob.r;
		c=ob.c;  
		for(i=0;i<r;i++)
		{
	          for(j=0;j<c;j++)
		      {
		         m[i][j]=ob.m[i][j];
                      }
        }
	}
	int determinant()
	{
		return (m[0][0]*m[1][1])-(m[0][1]*m[1][0]);
	}
	void inverse()
	{
		int temp;
		int d=determinant();
		if(d!=0)
		{
				
			temp=m[0][0];
			m[0][0]=m[1][1];
			m[1][1]=temp;
			m[0][1]=0-m[0][1];
			m[1][0]=0-m[1][0];
		      for(i=0;i<2;i++)
			{
			  for(j=0;j<2;j++)
			  {
				m[i][j]=m[i][j]/d;
			  }
			}
			
		}
		else
			System.out.println("Inverse can not b determined");
	}
	boolean singular()
	{
		if(determinant()!=0)
		{	
			return true;
		}
		else 
		{
			return false;
		}
	}
	void print_data()
	{
		if(determinant()!=0)
		{for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print(m[i][j]+" ");
			}
			System.out.print("\n");
		}
		}
	}
}
class Matrixdemo
{
	public static void main(String args[])
{
	Matrix m1= new Matrix(2,2);
	Matrix m2 = new Matrix(m1);
	int e1 =m1.determinant();
	System.out.println("Determinant of matrix M1 is :   " + e1);
	System.out.println("Inverse of matrix M1 is :   ");
	m1.inverse();
	m1.print_data();
	System.out.println("Nature of  matrix M1 is :   " + m1.singular());
	int e2 =m2.determinant();
	System.out.println("Determinant of matrix M2 is :   " + e2);
	System.out.println("Inverse of matrix M2 is :   ");
	m2.inverse();
	m2.print_data();
	System.out.println("Nature of  matrix M2 is :   " + m2.singular());
}
}

   
/* Output:
Enter elements in Matrix                                                                                                                     
5 2                                                                                                                                          
-7 -3                                                                                                                                        
Determinant of matrix M1 is :   -1                                                                                                           
Inverse of matrix M1 is :                                                                                                                    
3 2                                                                                                                                          
-7 -5                                                                                                                                        
Nature of  matrix M1 is :   true     

Enter elements in Matrix                                                                                                                     
5 2                                                                                                                                          
-7 -3                                                                                                                                        
Determinant of matrix M1 is :   -1                                                                                                           
Inverse of matrix M1 is :                                                                                                                    
3 2                                                                                                                                          
-7 -5                                                                                                                                        
Nature of  matrix M1 is :   true     
*/
   
