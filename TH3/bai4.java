package TH3;
public class bai4 {
public class Candidate {
    private String maTS;
    private String hoTen;
    private String ngaySinh;
    private double diemToanRR;
    private double diemMayHoc;
    private double diemCSDL;
    public Candidate() {}
    public Candidate(String maTS, String hoTen, String ngaySinh, double diemToanRR, double diemMayHoc, double diemCSDL) {
        this.maTS = maTS;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemToanRR = diemToanRR;
        this.diemMayHoc = diemMayHoc;
        this.diemCSDL = diemCSDL;
    }
    public double tinhTongDiem() {
        return this.diemToanRR + this.diemMayHoc + this.diemCSDL;
    }
    public void hienThiThongTin() {
        System.out.printf("Ma TS: | Ho ten: | Ngay sinh: | Toan RR: | May hoc: | CSDL: | Tong diem: ",
                maTS, hoTen, ngaySinh, diemToanRR, diemMayHoc, diemCSDL, tinhTongDiem());
    }
}
}
