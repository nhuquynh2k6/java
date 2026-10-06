import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Đầu vào (Input): Nhập tháng và năm từ bàn phím
        System.out.print("Nhap thang: ");
        int thang = scanner.nextInt();

        System.out.print("Nhap nam: ");
        int nam = scanner.nextInt();

        // Biến lưu trữ số ngày tối đa của tháng
        int soNgay = 0;
        boolean hopLe = true;

        switch (thang) {
            // Nhóm 31 ngày
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                soNgay = 31;
                break;

            // Nhóm 30 ngày
            case 4:
            case 6:
            case 9:
            case 11:
                soNgay = 30;
                break;

            // Đối với tháng 2, lập trình thuật toán kiểm tra năm nhuận
            case 2:
                if ((nam % 400 == 0) || (nam % 4 == 0 && nam % 100 != 0)) {
                    // Là năm nhuận
                    soNgay = 29;
                } else {
                    // Không phải năm nhuận
                    soNgay = 28;
                }
                break;

            // Trường hợp người dùng nhập tháng không hợp lệ (ngoài khoảng 1 - 12)
            default:
                System.out.println("Thang nhap vao khong hop le. Vui long nhap tu 1 den 12.");
                hopLe = false;
                break;
        }

        // Đầu ra (Output): Chuỗi văn bản hiển thị số ngày nếu tháng hợp lệ
        if (hopLe) {
            System.out.println("Thang " + thang + " nam " + nam + " co " + soNgay + " ngay");
        }

        scanner.close();
    }
}