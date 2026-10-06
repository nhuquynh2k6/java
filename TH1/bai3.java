import java.util.Scanner;
public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen thu nhat: ");
        int a = scanner.nextInt();
        System.out.print("Nhap vao so nguyen thu hai: ");
        int b = scanner.nextInt();
        System.out.println("Tong: " + (a + b));
        System.out.println("Hieu: " + (a - b));
        System.out.println("Tich: " + (a * b));
        if (b == 0) {
            System.out.println("Thuong khong the chia cho 0");
        } else {
            double thuong = (double) a / b;
            System.out.println("Thuong: " + thuong);
        }
        scanner.close();
    }
}