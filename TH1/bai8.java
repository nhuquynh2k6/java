import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap vao ban kinh hinh tron: ");
        double r=scanner.nextDouble();
        System.out.println("Chu vi hinh tron: " + 2*Math.PI*r);
        System.out.println("Dien tich hinh tron: " + Math.PI*r*2);
        scanner.close();
    }
}
