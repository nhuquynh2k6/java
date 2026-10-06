package TH3;
import java.util.Scanner;

public class bai8_main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManageDocument manager = new ManageDocument();

        // Thêm sẵn một vài dữ liệu mẫu để test nhanh
        manager.addDocument(new Book("B01", "Kim Đồng", 1000, "Nguyễn Nhật Ánh", 250));
        manager.addDocument(new Magazine("M01", "Tuổi trẻ", 500, 12, 7));
        manager.addDocument(new Newspaper("N01", "Nhân dân", 2000, "02/07/2026"));

        while (true) {
            System.out.println("\n====== HE THONG QUAN LY THU VIEN ======");
            System.out.println("1. Them moi tai lieu");
            System.out.println("2. Hien thi thong tin tat ca tai lieu");
            System.out.println("3. Tim kiem tai lieu theo phan loai");
            System.out.println("4. Thoat chuong trinh");
            System.out.print("Chon chuc nang (1-4): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Xóa bộ đệm

            switch (choice) {
                case 1:
                    System.out.print("Chon loai tai lieu muon them (1-Sach, 2-Tap chi, 3-Bao): ");
                    int subChoice = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.print("Nhap ma tai lieu: ");
                    String maTaiLieu = scanner.nextLine();
                    System.out.print("Nhap nha xuat ban: ");
                    String tenNhaXuatBan = scanner.nextLine();
                    System.out.print("Nhap so ban phat hanh: ");
                    int soBanPhatHanh = scanner.nextInt();
                    scanner.nextLine();

                    if (subChoice == 1) {
                        System.out.print("Nhap ten tac gia: ");
                        String tenTacGia = scanner.nextLine();
                        System.out.print("Nhap so trang: ");
                        int soTrang = scanner.nextInt();
                        manager.addDocument(new Book(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, tenTacGia, soTrang));
                    } else if (subChoice == 2) {
                        System.out.print("Nhap so phat hanh: ");
                        int soPhatHanh = scanner.nextInt();
                        System.out.print("Nhap thang phat hanh: ");
                        int thangPhatHanh = scanner.nextInt();
                        manager.addDocument(new Magazine(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, soPhatHanh, thangPhatHanh));
                    } else if (subChoice == 3) {
                        System.out.print("Nhap ngay phat hanh (dd/mm/yyyy): ");
                        String ngayPhatHanh = scanner.nextLine();
                        manager.addDocument(new Newspaper(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, ngayPhatHanh));
                    } else {
                        System.out.println("Lua chon loai tai lieu khong hop le!");
                    }
                    break;

                case 2:
                    System.out.println("\n--- DANH SACH TAI LIEU HIEN CO ---");
                    manager.displayAll();
                    break;

                case 3:
                    System.out.print("Nhap phan loai can tim (1-Sach, 2-Tap chi, 3-Bao): ");
                    int type = scanner.nextInt();
                    System.out.println("\n--- KET QUA TIM KIEM ---");
                    manager.searchByType(type);
                    break;

                case 4:
                    System.out.println("Da thoat he thong quan ly");
                    scanner.close();
                    System.exit(0);
                    
                default:
                    System.out.println("Chuc nang khong hop le, vui long chon lai!");
            }
        }
    }
}
