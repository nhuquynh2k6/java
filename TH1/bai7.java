import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap vao chieu dai: ");
        double chieuDai=scanner.nextDouble();
        System.out.print("Nhap vao chieu rong: ");
        double chieuRong=scanner.nextDouble();
        System.out.println("Chu vi hinh chu nhat: " + (chieuDai+chieuRong)*2);
        System.out.println("Dien tich hinh chu nhat: " + chieuDai*chieuRong);
        scanner.close();
    }
}
