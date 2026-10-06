package TH3;
import TH3.bai2.Shape;

public class Point extends Shape
{
protected int x, y;
public Point()
{
setPoint(0, 0);
}
public Point(int xCoordinate, int yCoordinate)
{ setPoint(xCoordinate, yCoordinate);}
public void setPoint(int xCoordinate, int yCoordinate)
{ 
    x = xCoordinate;
    y = yCoordinate;
}
public int getX() { return x; }
public int getY() {return y; }
public String toString()
{return "[" + x +","+y+"]";}
public double area()
{ return 0.0;}
public double volume()
{return 0.0;}
public String getName()
{
return "Point";
}
}
