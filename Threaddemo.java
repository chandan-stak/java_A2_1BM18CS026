import java.util.*;
class Newthread1 implements Runnable
{
Thread t1;
Newthread1()
{
t1=new Thread(this,"T1");
t1.start();
}
public void run()
{
 while(true)
 {
  System.out.println("BMSCSE");
   try{
      Thread.sleep(10000);
      }
   catch(InterruptedException e)
    {
     System.out.println("BMS Thread Interrupted");
    }
  }
 }
}

class Newthread2 implements Runnable
{
Thread t2;
Newthread2()
{
t2=new Thread(this,"T2");
t2.start();
}
public void run()
{
 while(true)
 {
  System.out.println("CSE");
   try{
      Thread.sleep(2000);
      }
   catch(InterruptedException e)
    {
     System.out.println("CSE Thread Interrupted");
    }
  }
 }
}
class Threaddemo
{
public static void main(String args[])
{
Newthread1 a=new Newthread1();
Newthread2 b=new Newthread2();
}
}
