package TH3;
public class Newspaper extends Document {
    private String ngayPhatHanh;

    public Newspaper(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, String ngayPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }
    public String toString() {
        return "[Bao] " + super.toString() + " | Ngay PH: " + ngayPhatHanh;
    }
}
