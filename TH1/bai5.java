import java.util.Scanner;
public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n (tối đa 2 chữ số): ");
        int n = sc.nextInt();
        int hangChuc = 0;
        int hangDonVi = 0;
        if (n / 10 >= 1) {
            hangDonVi = n % 10;
            hangChuc = n / 10;
            System.out.println("Tổng các chữ số của n là: " + (hangDonVi + hangChuc));
        } 
        else {
            System.out.println("Tổng các chữ số của n là: " + n);
            sc.close();
}
    }
}
