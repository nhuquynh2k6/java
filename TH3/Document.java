package TH3;

public class Document {
    public String maTaiLieu;
    public String tenNhaXuatBan;
    public int soBanPhatHanh;
    public Document(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh)
    {
        this.maTaiLieu=maTaiLieu;
        this.tenNhaXuatBan=tenNhaXuatBan;
        this.soBanPhatHanh=soBanPhatHanh;
    }
    public String getMaTaiLieu()
    {
        return maTaiLieu;
    }
    public String toString()
    {
        return "Ma: "+maTaiLieu+" | NXB: "+tenNhaXuatBan+" | So ban phat hanh: "+soBanPhatHanh;
    }
}
