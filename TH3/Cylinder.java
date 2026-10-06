package TH3;
    public class Cylinder extends Circle
    {
protected double height;
public Cylinder()
{
setHeight(0);
}
public Cylinder(double cylinderHeight, double cylinderRadius,
int xCoordinate, int yCoordinate)
{
super(cylinderRadius, xCoordinate, yCoordinate);
setHeight(cylinderHeight);
}
public void setHeight(double cylinderHeight)
{height = (cylinderHeight >= 0 ? cylinderHeight:0); }
public double getHeight()
{ return height; }
public double area()
{return 2* super.area() + 2* Math. PI * radius * height; }
public double volume()
{return super.area() * height; }
public String toString()
{
return super.toString() + "; Height = " + height;
}
public String getName()
{
return "Cylinder";
}
}

