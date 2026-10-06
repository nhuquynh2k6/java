import java.util.Random;
import java.util.Scanner;
public class baitap5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        // Kiểm tra độc lập lớp Circle (Câu a)
        System.out.println("=== KIEM TRA LOP CIRCLE ===");
        Circle testCircle = new Circle(5.0);
        System.out.println("Khoi tao thu nghiệem: " + testCircle);
        System.out.println("------------------------------------");
        // Thực hiện Câu c: Phát sinh N hình tròn ngẫu nhiên
        System.out.print("Nhap so luong N hinh tron can tao: ");
        int n = sc.nextInt();
        CircleCollection collection = new CircleCollection();
        // Tạo ngẫu nhiên N hình tròn với bán kính từ 1.0 đến 10.0
        for (int i = 0; i < n; i++) {
            // Tạo bán kính ngẫu nhiên từ 1 đến 10 (làm tròn 1 chữ số thập phân)
            double randomRadius = 1.0 + (9.0 * rand.nextDouble());
            randomRadius = Math.round(randomRadius * 10.0) / 10.0;
            collection.addCircle(new Circle(randomRadius));
        }
        // 1. Xuất thông tin của các hình tròn đã nhập
        System.out.println("\n=== DANH SACH " + n + " HINH TRON DA TAO ===");
        System.out.print(collection.toString());
        // 2. Xuất tổng diện tích của chúng
        System.out.printf("\nTong dien tich tat ca hinh tron: %.2f\n", collection.getTotalArea());
        // 3. Xuất diện tích lớn nhất
        System.out.printf("Dien tich lon nhat: %.2f\n", collection.getMaxArea());
        // 4. Xuất thông tin hình tròn có diện tích nhỏ nhất
        Circle minCircle = collection.getMinAreaCircle();
        if (minCircle != null) {
            System.out.println("Thong tin hinh tron nho nhat: " + minCircle);
        }
        sc.close();
    }
}
