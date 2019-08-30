
import java.util.*;
class Point{
    int x,y;
    Point(){
        x=0;
        y=0;
    }
    Point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    Point(Point ob)
    {
        x=ob.x;
        y=ob.y;
    }
    double distance(Point ob)
    {
        return (Math.sqrt(Math.pow((ob.x-x),2)-Math.pow((ob.y-y),2)));
    }
}
class Pointdemo{
    public static void main(String[] args)
    {
        Point p1=new Point(0,2);
        Point p2=new Point(p1);
        Point p3=new Point(3,4);
        double d=p1.distance(p3);
        System.out.println("Distance :" + d);
    }
}


/* Output:

Distance :2.23606797749979 
*/ 