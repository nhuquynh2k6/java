import java.util.ArrayList;
public class Category {
    private String maDanhMuc;
    private String tenDanhMuc;
    private ArrayList<Product> dsSanPham;
    public Category(String maDanhMuc, String tenDanhMuc) {
        this.maDanhMuc = maDanhMuc;
        this.tenDanhMuc = tenDanhMuc;
        this.dsSanPham = new ArrayList<>();
    }
    public String getMaDanhMuc() { return maDanhMuc; }
    public String getTenDanhMuc() { return tenDanhMuc; }
    public ArrayList<Product> getDsSanPham() { return dsSanPham; }

    public void themSanPham(Product p) {
        dsSanPham.add(p);
    }
    public String toString() {
        return String.format("Ma DM: %-8s | Ten Danh Muc: %s (So luong SP: %d)", 
                maDanhMuc, tenDanhMuc, dsSanPham.size());
    }
}
