package TH3;

public abstract class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Phương thức trừu tượng buộc các lớp con phải tự triển khai cách tính toán
    public abstract double earnings();

    @Override
    public String toString() {
        return "Nhan vien: " + name;
    }
}
