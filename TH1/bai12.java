import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap diem tong ket hoc phan: ");
        double diem=scanner.nextDouble();
        String hocLuc="";
        if(diem < 0 || diem > 10)
            System.out.println("Diem so khong hop le");
        else
        {
        if(diem>=8.5)
            hocLuc="Xuat sac";
        else if(diem>=7.0)
            hocLuc="Gioi";
        else if(diem>=5)
            hocLuc="Trung binh";
        else
            hocLuc="Yeu";
        }
        System.out.println("Xep loai hoc luc: " + hocLuc);
        scanner.close();
    }
}
