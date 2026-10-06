public class Product {
    private String maSP;
    private String tenSP;
    private double gia;
    private String xuatXu;
    public Product(String maSP, String tenSP, double gia, String xuatXu) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.gia = gia;
        this.xuatXu = xuatXu;
    }
    public String getMaSP() { return maSP; }
    public void setMaSP(String maSP) { this.maSP = maSP; }
    public String getTenSP() { return tenSP; }
    public void setTenSP(String tenSP) { this.tenSP = tenSP; }
    public double getGia() { return gia; }
    public void setGia(double gia) { this.gia = gia; }
    public String getXuatXu() { return xuatXu; }
    public void setXuatXu(String xuatXu) { this.xuatXu = xuatXu; }
    public String toString() {
        return String.format("Ma SP: %-8s | Ten SP: %-20s | Gia: %-12.2f | Xuat xu: %s",
                maSP, tenSP, gia, xuatXu);
    }
}
