import java.util.Scanner;
public class bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao mot chuoi ki tu: ");
        String chuoiBanDau = scanner.nextLine();
        String chuoiChuanHoa = chuoiBanDau.toLowerCase();
        // Thuật toán kiểm tra tính đối xứng (Duyệt hai đầu hội tụ vào giữa)
        boolean laDoiXung = true;
        int left = 0;
        int right = chuoiChuanHoa.length() - 1;
        while (left < right) {
            // So sánh ký tự ở đầu và ký tự ở cuối tương ứng
            if (chuoiChuanHoa.charAt(left) != chuoiChuanHoa.charAt(right)) {
                laDoiXung = false; // Chỉ cần 1 cặp ký tự khác nhau thì kết luận ngay không đối xứng
                break;
            }
            left++;  // Tiến con trỏ bên trái lên phía trước
            right--; // Lùi con trỏ bên phải về phía sau
        }
        if (laDoiXung) {
            System.out.println("Chuoi '" + chuoiBanDau + "' la chuoi doi xung");
        } else {
            System.out.println("Chuoi '" + chuoiBanDau + "' khong phai la chuoi doi xung");
        }
        scanner.close();
    }
}

