public class Circle {
    private double radius;
    public Circle() {
        this.radius = 1.0;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    // Hàm tính diện tích hình tròn S = PI * r^2
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public String toString() {
        return String.format("Hinh tron [Ban kinh: %.2f | Dien tich: %.2f]", radius, getArea());
    }
}