package TH3;

public class PieceWorker extends Employee {
    private int quantity; // Số lượng sản phẩm hoàn thành
    public PieceWorker(String name, int quantity) {
        super(name);
        this.quantity = quantity;
    }
    // Ghi đè phương thức: Lương = Số lượng sản phẩm * 0.5
    public double earnings() {
        return this.quantity * 0.5;
    }
    public String toString() {
        return "[PieceWorker] " + super.toString() + " | So san pham: " + quantity + " | Tong luong: " + earnings();
    }
}