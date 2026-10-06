package TH3;

public class Boss extends Employee {
    private double fixedSalary; // Lương cố định định mức

    public Boss(String name, double fixedSalary) {
        super(name);
        this.fixedSalary = fixedSalary;
    }
    // Ghi đè phương thức: Trả về khoản định mức cố định
    public double earnings() {
        return fixedSalary;
    }
    public String toString() {
        return "[Boss] " + super.toString() + " | Luong dịnh muc: " + earnings();
    }
}
