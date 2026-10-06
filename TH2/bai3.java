import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        // Vòng lặp kiểm tra đầu vào, bắt buộc người dùng nhập n > 0
        do {
            System.out.print("Nhap so nguyen duong n (n > 0): ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("So nhap vao khong hop le. Vui long nhap lai!");
            }
        } while (n <= 0);

        // ==========================================================
        // CÁCH 1: SỬ DỤNG VÒNG LẶP FOR
        // ==========================================================
        int tongFor = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) { // Nếu i là số lẻ
                tongFor += i;
            }
        }
        System.out.println("Tong cac so le tu 1 den " + n + " la: " + tongFor);


        // ==========================================================
        // CÁCH 2: SỬ DỤNG VÒNG LẶP WHILE
        // ==========================================================
        int tongWhile = 0;
        int j = 1; // Khởi tạo biến chạy
        while (j <= n) {
            if (j % 2 != 0) {
                tongWhile += j;
            }
            j++; // Tăng biến chạy
        }
        System.out.println("Tong cac so le tu 1 den " + n + " la: " + tongWhile);


        // ==========================================================
        // CÁCH 3: SỬ DỤNG VÒNG LẶP DO...WHILE
        // ==========================================================
        int tongDoWhile = 0;
        int k = 1; // Khởi tạo biến chạy
        do {
            if (k % 2 != 0) {
                tongDoWhile += k;
            }
            k++; // Tăng biến chạy
        } while (k <= n);
        System.out.println("Tong cac so le tu 1 den " + n + " la: " + tongDoWhile);

        scanner.close();
    }
}