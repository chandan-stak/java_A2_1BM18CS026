import java.util.*;
class Matrix
{
	float m[][];
	int ns,nm;
	void get_data()
	{
		System.out.println("Enter no of students and marks");
		Scanner se=new Scanner(System.in);
		ns=se.nextInt();
		nm=se.nextInt();
		m=new float[ns+2][nm+2];
		System.out.println("Enter elements in matrix");
		for(int i=0;i<ns;i++)
		{
			for(int j=0;j<nm;j++)
			{
				m[i][j]=se.nextFloat();
			}
		}
	}
	void cal()
	{
		float sum=0;
		float avg=0;
		for(int i=0;i<ns;i++)
		{
			for(int j=0;j<nm;j++)
			{
				
				sum=sum+m[i][j];
			}
				m[i][nm]=sum;
				avg=(float)sum/nm;
				m[i][nm+1]=avg;
				sum=0;
			
		}
		for(int j=0;j<nm;j++)
		{
			for(int i=0;i<ns;i++)
			{
				
				sum=sum+m[i][j];
			}
				m[ns][j]=sum;
				avg=(float)sum/ns;
				m[ns+1][j]=avg;
				sum=0;
			
		}
	}
	void print_data()
	{
		System.out.println(" details are");
		for(int i=0;i<ns+2;i++)
		{
			for(int j=0;j<nm+2;j++)
			{
				System.out.print(m[i][j]+" ");
			}
			System.out.print("\n");
		}
		
	}
}
class Marks
{
	public static void main(String args[])
{
	Matrix m1=new Matrix();
	m1.get_data();
	m1.cal();
	m1.print_data();
}
}
