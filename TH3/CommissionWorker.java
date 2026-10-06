package TH3;

public class CommissionWorker extends Employee {
    private double baseSalary;  // Lương cứng cố định
    private int quantitySold;   // Số lượng sản phẩm bán được

    public CommissionWorker(String name, double baseSalary, int quantitySold) {
        super(name);
        this.baseSalary = baseSalary;
        this.quantitySold = quantitySold;
    }

    // Ghi đè phương thức: Lương cứng + (Số sản phẩm * 0.1)
    public double earnings() {
        return this.baseSalary + (this.quantitySold * 0.1);
    }
    public String toString() {
        return "[CommissionWorker] " + super.toString() + " | Luong cung: " + baseSalary + " | San pham ban: " + quantitySold + " | Tong luong: " + earnings();
    }
}
