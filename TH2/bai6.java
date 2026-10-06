import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        // 1. Nhập số lượng thành viên n (phải là số dương)
        do {
            System.out.print("Nhap so luong thanh vien trong gia dinh (n > 0): ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("So luong thanh vien khong hop le. Vui long nhap lai!");
            }
        } while (n <= 0);

        // Khởi tạo mảng lưu trữ độ tuổi
        int[] tuoi = new int[n];
        int tongTuoi = 0;

        // 2. Nhập danh sách tuổi của từng người và tính tổng tuổi
        System.out.println("--- Nhap do tuoi cua tung thanh vien ---");
        for (int i = 0; i < n; i++) {
            do {
                System.out.print("Tuoi cua thanh vien thu " + (i + 1) + ": ");
                tuoi[i] = scanner.nextInt();
                if (tuoi[i] < 0 || tuoi[i] > 150) {
                    System.out.println("Do tuoi khong thuc te. Vui long nhap lai (0 - 150).");
                }
            } while (tuoi[i] < 0 || tuoi[i] > 150);
            
            tongTuoi += tuoi[i]; // Cộng dồn để tính trung bình sau này
        }

        // 3. Tìm độ tuổi lớn nhất (Max) và nhỏ nhất (Min)
        int max = tuoi[0];
        int min = tuoi[0];
        for (int i = 1; i < n; i++) {
            if (tuoi[i] > max) {
                max = tuoi[i];
            }
            if (tuoi[i] < min) {
                min = tuoi[i];
            }
        }

        // 4. Tính toán độ tuổi trung bình tổng thể (ép kiểu sang double)
        double tuoiTrungBinh = (double) tongTuoi / n;

        // 5. Đếm số lượng thành viên có độ tuổi vượt mức trung bình
        int soNguoiVuotChuan = 0;
        for (int i = 0; i < n; i++) {
            if (tuoi[i] > tuoiTrungBinh) {
                soNguoiVuotChuan++;
            }
        }

        // 6. Đầu ra (Output): In kết quả kèm định dạng làm tròn 2 chữ số thập phân
        System.out.println("Do tuoi lon nhat: " + max + " tuoi.");
        System.out.println("Do tuoi nho nhat: " + min + " tuoi.");
        // Sử dụng printf để làm tròn 2 chữ số thập phân bằng %.2f
        System.out.printf("Do tuoi trung binh: ", tuoiTrungBinh);
        System.out.println("So luong thanh vien co tuoi vuot muc trung binh: " + soNguoiVuotChuan + " người.");

        scanner.close();
    }
}
