package TH3;
import java.text.DecimalFormat;

import TH3.bai2.Shape;
public class Test {
    public static void main(String[] args) {
        Point point = new Point(7, 11);
Circle circle = new Circle(3.5, 22, 8);
Cylinder cylinder = new Cylinder(10, 3.3, 10, 10);
Shape arrayOfShapes[] = new Shape[ 3 ];
arrayOfShapes[1] = circle;
String output = point.getName() + ":" + point.toString() + "\n"
+ circle.getName() + ":" + circle.toString() + "\n"
+ cylinder.getName() + ":" + cylinder.toString();
DecimalFormat precision2 = new DecimalFormat("0.00");
for (int i = 0; i < arrayOfShapes.length; i++)
{
output += "\n\n" + arrayOfShapes[i].getName()
+ ":" + arrayOfShapes[i].toString() + "\n Area ="+ precision2.format(arrayOfShapes[i].area())
+ "\nVolume = "+ precision2.format(arrayOfShapes[i].volume());
    }
System.out.println(output);
System.exit(0);
}
}

