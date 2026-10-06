package TH3;

public class Magazine extends Document {
    private int soPhatHanh; 
    private int thangPhatHanh;  

    public Magazine(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, int soPhatHanh, int thangPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }
    public String toString() {
        return "[Tap chi] " + super.toString() + " | So PH: " + soPhatHanh + " | Thang PH: " + thangPhatHanh;
    }
}

