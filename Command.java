import java.util.*;
class Command
{
public static void main(String args[])
{
int a=0;
for(int i=0;i<args.length;i++)
{
 if(Integer.parseInt(args[i])>a)
  {
   a=Integer.parseInt(args[i]);
  }
}
 System.out.println("The largest number is " + a);
}
}
