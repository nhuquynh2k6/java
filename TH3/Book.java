package TH3;

public class Book extends Document {
    private String tenTacGia; 
    private int soTrang;     
    public Book(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, String tenTacGia, int soTrang) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }
    public String toString() {
        return "[Sach] " + super.toString() + " | Tac gia: " + tenTacGia + " | So trang: " + soTrang;
    }
}

