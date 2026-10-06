import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        // 1. Nhập số lượng phần tử n (Kích thước mảng phải lớn hơn 0)
        do {
            System.out.print("Nhap so luong sinh vien (n > 0): ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("So luong khong hop le. Vui long nhap lai!");
            }
        } while (n <= 0);

        // Khởi tạo mảng số thực có n phần tử
        double[] diemSV = new double[n];

        // 2. Nhập tuần tự điểm số và kiểm tra tính hợp lệ [0.0 - 10.0]
        System.out.println("--- Nhap diem so cua sinh vien ---");
        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("Nhap diem cho sinh vien thu " + (i+1) + ": ");
                double diem = scanner.nextDouble();
                
                if (diem >= 0.0 && diem <= 10.0) {
                    diemSV[i] = diem;
                    break; // Điểm hợp lệ, thoát khỏi vòng lặp kiểm tra để chuyển sang phần tử tiếp theo
                } else {
                    System.out.println("Diem khong hop le! Diem so phai nam trong khoang tu 0.0 den 10.0. Vui long nhap lai.");
                }
            }
        }

        // 3. Tìm giá trị Max, Min và vị trí (index) đầu tiên xuất hiện
        double max = diemSV[0];
        double min = diemSV[0];
        int indexMax = 0;
        int indexMin = 0;

        for (int i = 1; i < n; i++) {
            // Tìm Max: Chỉ dùng dấu '>' thay vì '>=' để giữ lại vị trí đầu tiên xuất hiện
            if (diemSV[i] > max) {
                max = diemSV[i];
                indexMax = i;
            }
            
            // Tìm Min: Chỉ dùng dấu '<' thay vì '<=' để giữ lại vị trí đầu tiên xuất hiện
            if (diemSV[i] < min) {
                min = diemSV[i];
                indexMin = i;
            }
        }

        // 4. Đầu ra (Output): In kết quả theo đúng định dạng yêu cầu
        System.out.println("Gia tri lon nhat: " + max + " o index so " + indexMax + ".");
        System.out.println("Gia tri nho nhat: " + min + " o index so " + indexMin + ".");

        scanner.close();
    }
}
