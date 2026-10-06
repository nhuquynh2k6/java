package TH3;
import java.util.Random;
public class TestRect {
    public static void main(String[] args) {
        Random rand = new Random();
        Rect[] danhSachHCN = new Rect[10];
        // 1. Sinh ngẫu nhiên 10 hình chữ nhật
        for (int i = 0; i < 10; i++) {
            // Sinh ngẫu nhiên tọa độ cho điểm Top-Left
            int x1 = rand.nextInt(40); // khoảng 0 - 39
            int y1 = rand.nextInt(40);
            
            // Đảm bảo điểm Bottom-Right luôn lớn hơn điểm Top-Left từ 1 đến 15 đơn vị
            int x2 = x1 + rand.nextInt(15) + 1;
            int y2 = y1 + rand.nextInt(15) + 1;

            danhSachHCN[i] = new Rect(new Point(x1, y1), new Point(x2, y2));
            System.out.printf("HCN %d: %s | Dien tich: %d%n", (i + 1), danhSachHCN[i], danhSachHCN[i].getArea());
        }

        // 2. Tính toán và hiển thị phần diện tích giao nhau đôi một
        int count = 1;
        for (int i = 0; i < danhSachHCN.length - 1; i++) {
            for (int j = i + 1; j < danhSachHCN.length; j++) {
                // Lấy hình chữ nhật là phần giao của cặp (i, j)
                Rect vungGiao = danhSachHCN[i].getIntersection(danhSachHCN[j]);
                long dienTichGiao = vungGiao.getArea();
                
                if (dienTichGiao > 0) {
                    System.out.printf("Vung giao giua HCN %d va HCN %d la %s -> Dien tich giao: %d%n", 
                                      count, (i + 1), (j + 1), vungGiao, dienTichGiao);
                } else {
                    System.out.printf("HCN %d va HCN %d: Khong giao nhau (Dien tich giao: 0)%n", 
                                      count, (i + 1), (j + 1));
                }
                count++;
            }
        }
    }
}
