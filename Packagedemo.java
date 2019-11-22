import java.util.*;
import CIE.*;
import SEE.*;
class Packagedemo
{
public static void main(String args[])
{
Internal in = new Internal();
External ex = new External();
in.getdata();
ex.getdata();
in.display();
ex.display();
System.out.println("Final marks");
for(int i=0;i<5;i++)
{
System.out.print((in.inter[i]+ex.exter[i])+" ");
}
System.out.print("\n");
}
}
