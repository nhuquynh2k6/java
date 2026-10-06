import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap a: ");
        double a=scanner.nextDouble();
        System.out.print("Nhap b: ");
        double b=scanner.nextDouble();
        System.out.print("Nhap c: ");
        double c=scanner.nextDouble();
        double max=a;
        if(b>max)
            max=b;
        if(c>max)
            max=c;
        System.out.println("So lon nhat trong 3 so la: " + max);
        scanner.close();
    }
}
