import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Đầu vào (Input): Nhận một ký tự từ bàn phím
        System.out.print("Nhap vao mot ki tu: ");
        
        /* * Vì lớp Scanner không có hàm nextChar(), ta sẽ đọc dữ liệu dưới dạng chuỗi bằng next()
         * sau đó lấy ký tự đầu tiên của chuỗi đó bằng phương thức charAt(0).
         */
        char kyTu = scanner.next().charAt(0);

        // Thực hiện tra cứu bằng cách ép kiểu từ char sang int
        int maUnicode = (int) kyTu;

        // Đầu ra (Output): In mã số định danh Unicode dưới dạng số nguyên thập phân
        System.out.println("Ma Unicode cua ki tu '" + kyTu + "' la: " + maUnicode);

        scanner.close();
    }
}