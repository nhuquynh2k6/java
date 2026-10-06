import java.util.ArrayList;
public class CircleCollection {
    private ArrayList<Circle> alCircle;
    // Khởi tạo tập hợp hình tròn
    public CircleCollection() {
        alCircle = new ArrayList<>();
    }
    //addCircle: thêm 1 hình tròn vào mảng
    public void addCircle(Circle c) {
        alCircle.add(c);
    }
    //getSize: lấy số lượng hình tròn trong mảng
    public int getSize() {
        return alCircle.size();
    }
    //getCircle: lấy hình tròn tại vị trí index
    public Circle getCircle(int index) {
        if (index >= 0 && index < alCircle.size()) {
            return alCircle.get(index);
        }
        return null;
    }
    //setCircle: gán hình tròn tại vị trí xác định trong mảng
    public void setCircle(int index, Circle c) {
        if (index >= 0 && index < alCircle.size()) {
            alCircle.set(index, c);
        }
    }
    // + toString: trả về thông tin của tập các hình tròn trong mảng
    public String toString() {
        if (alCircle.isEmpty()) {
            return "Tap hop hinh tron rong!";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < alCircle.size(); i++) {
            sb.append(String.format("  [%d] %s\n", i + 1, alCircle.get(i).toString()));
        }
        return sb.toString();
    }
    //Hàm tính tổng diện tích hình tròn
    public double getTotalArea() {
        double total = 0;
        for (Circle c : alCircle) {
            total += c.getArea();
        }
        return total;
    }
    //Hàm tìm diện tích lớn nhất
    public double getMaxArea() {
        if (alCircle.isEmpty()) return 0;
        double maxArea = alCircle.get(0).getArea();
        for (Circle c : alCircle) {
            if (c.getArea() > maxArea) {
                maxArea = c.getArea();
            }
        }
        return maxArea;
    }

    //Hàm lấy hình tròn có diện tích nhỏ nhất
    public Circle getMinAreaCircle() {
        if (alCircle.isEmpty()) return null;
        Circle minCircle = alCircle.get(0);
        for (Circle c : alCircle) {
            if (c.getArea() < minCircle.getArea()) {
                minCircle = c;
            }
        }
        return minCircle;
    }
}