package TH3;

public class bai1_main {
    public static void main(String[] args) {
        Motorbike bike1 = new Motorbike();
        bike1.displayInfo();

        Motorbike bike2 = new Motorbike("Honda", "SH150i-2026-XYZ", "SH 150i Abs", 40000000.0, 2026);
        
        // Gọi thực thi các phương thức đơn lẻ theo yêu cầu đề bài
        String modelName = bike2.getModelName();
        double targetPrice = bike2.calculatePrice();

        // In kết quả kiểm tra ra màn hình
        System.out.println("Ten mau xe vua lay ra: " + modelName);
        System.out.println("Gia ban tinh toan duoc: " + targetPrice + " VND");
        
        bike2.displayInfo();
}
}
