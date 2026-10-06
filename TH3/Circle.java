package TH3;
    public class Circle extends Point
{
protected double radius;
public Circle(){
setRadius(0);
}
public Circle(double circleRadius, int xCoordinate, int yCoordinate){
super(xCoordinate, yCoordinate);
setRadius(circleRadius);
}
public void setRadius(double circleRadius)
{ radius = (circleRadius >= 0 ? circleRadius:0); }
public double getRadius()
{ return radius; }
public double area()
{return Math.PI * radius * radius; }
public String toString()
{
return "Center = " + super.toString() + "; Radius = " + radius;
}
public String getName()
{
return "Circle";
}
}