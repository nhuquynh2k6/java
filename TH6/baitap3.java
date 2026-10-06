import java.util.ArrayList;
import java.util.Scanner;
public class baitap3 {
    private static ArrayList<Category> dsDanhMuc = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // Tạo dữ liệu mẫu ban đầu để dễ sử dụng
        initSampleData();
        int choice;
        do {
            System.out.println("\n========== QUAN LY BAN HANG ==========");
            System.out.println("1. Tim thong tin danh muc hoac san pham");
            System.out.println("2. Xuat danh sach san pham theo danh muc");
            System.out.println("3. Cap nhat thong tin san pham");
            System.out.println("4. Xoa san pham bat ki trong danh muc");
            System.out.println("5. Thong ke tong gia tri cac mat hang");
            System.out.println("6. Liet ke cac san pham co xuat xu tu 'Trung Quoc'");
            System.out.println("7. Hien thi tat ca danh muc va san pham");
            System.out.println("0. Thoat");
            System.out.print("Lua chon cua ban: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1: timKiemInfo(); break;
                case 2: xatSPTheoDanhMuc(); break;
                case 3: capNhatSanPham(); break;
                case 4: xoaSanPham(); break;
                case 5: thongKeTongGiaTri(); break;
                case 6: lietKeSPTrungQuoc(); break;
                case 7: hienThiTatCa(); break;
                case 0: System.out.println("Da thoat chuong trinh!"); break;
                default: System.out.println("Lua chon khong hop le!");
            }
        } while (choice != 0);
    }

    // 1. Tìm thông tin danh mục hoặc sản phẩm
    private static void timKiemInfo() {
        System.out.print("Nhap ten hoac ma (Danh muc / San pham) can tim: ");
        String kw = sc.nextLine().toLowerCase();
        boolean found = false;

        System.out.println("\n--- Ket qua tim kiem danh muc ---");
        for (Category c : dsDanhMuc) {
            if (c.getMaDanhMuc().toLowerCase().contains(kw) || c.getTenDanhMuc().toLowerCase().contains(kw)) {
                System.out.println(c);
                found = true;
            }
        }

        System.out.println("\n--- Kếet qua tim kiem san pham ---");
        for (Category c : dsDanhMuc) {
            for (Product p : c.getDsSanPham()) {
                if (p.getMaSP().toLowerCase().contains(kw) || p.getTenSP().toLowerCase().contains(kw)) {
                    System.out.println(p + " [Thuoc DM: " + c.getTenDanhMuc() + "]");
                    found = true;
                }
            }
        }

        if (!found) System.out.println("Khong tim thay thong tin phu hop!");
    }

    // 2. Xuất danh sản phẩm thuộc một danh mục bất kỳ nhập vào từ bàn phím
    private static void xatSPTheoDanhMuc() {
        System.out.print("Nhap ma hoac ten danh muc can xem san pham: ");
        String input = sc.nextLine().toLowerCase();
        Category foundCategory = null;

        for (Category c : dsDanhMuc) {
            if (c.getMaDanhMuc().equalsIgnoreCase(input) || c.getTenDanhMuc().equalsIgnoreCase(input)) {
                foundCategory = c;
                break;
            }
        }

        if (foundCategory != null) {
            System.out.println("\n=== DANH SACH SAN PHAM THUOC DANH MUC: " + foundCategory.getTenDanhMuc() + " ===");
            if (foundCategory.getDsSanPham().isEmpty()) {
                System.out.println("Danh muc nay hien chua co san pham nao.");
            } else {
                for (Product p : foundCategory.getDsSanPham()) {
                    System.out.println(p);
                }
            }
        } else {
            System.out.println("Khong tim thya danh muc nay!");
        }
    }

    // 3. Cho phép cập nhật thông tin sản phẩm
    private static void capNhatSanPham() {
        System.out.print("Nhap ma san pham can cap nhat: ");
        String maSP = sc.nextLine();

        for (Category c : dsDanhMuc) {
            for (Product p : c.getDsSanPham()) {
                if (p.getMaSP().equalsIgnoreCase(maSP)) {
                    System.out.println("Tim thay san pham: " + p);
                    System.out.print("Nhap ten moi (bo trong neu giu nguyen): ");
                    String tenMoi = sc.nextLine();
                    if (!tenMoi.trim().isEmpty()) p.setTenSP(tenMoi);

                    System.out.print("Nhap gia moi (nhap -1 neu giu nguyen): ");
                    double giaMoi = Double.parseDouble(sc.nextLine());
                    if (giaMoi >= 0) p.setGia(giaMoi);

                    System.out.print("Nhap xuat xu moi (bo trong neu giu nguyen): ");
                    String xxMoi = sc.nextLine();
                    if (!xxMoi.trim().isEmpty()) p.setXuatXu(xxMoi);

                    System.out.println("Cap nhat thanh cong!");
                    return;
                }
            }
        }
        System.out.println("Khôong tim thay san pham co ma: " + maSP);
    }

    // 4. Xóa sản phẩm bất kỳ trong danh mục
    private static void xoaSanPham() {
        System.out.print("Nhap ma san pham can xoa: ");
        String maSP = sc.nextLine();

        for (Category c : dsDanhMuc) {
            for (int i = 0; i < c.getDsSanPham().size(); i++) {
                if (c.getDsSanPham().get(i).getMaSP().equalsIgnoreCase(maSP)) {
                    c.getDsSanPham().remove(i);
                    System.out.println("Da xoa san pham thanh cong khoi danh muc: " + c.getTenDanhMuc());
                    return;
                }
            }
        }
        System.out.println("Khong tim hay san pham co ma: " + maSP);
    }

    // 5. Thống kê tổng giá trị của các mặt hàng
    private static void thongKeTongGiaTri() {
        double tongGiaTri = 0;
        int tongSoLuong = 0;

        for (Category c : dsDanhMuc) {
            for (Product p : c.getDsSanPham()) {
                tongGiaTri += p.getGia();
                tongSoLuong++;
            }
        }

        System.out.println("\n=== THONG KE ===");
        System.out.println("Tong so luong mat hang: " + tongSoLuong);
        System.out.printf("Tong gia tri cac mat hang: %.2f VNĐ\n", tongGiaTri);
    }

    // 6. Liệt kê các sản phẩm có xuất xứ từ Trung Quốc
    private static void lietKeSPTrungQuoc() {
        System.out.println("\n=== DANH SACH SAN PHAM XUAT XU TU TRUNG QUOC ===");
        boolean found = false;

        for (Category c : dsDanhMuc) {
            for (Product p : c.getDsSanPham()) {
                if (p.getXuatXu().equalsIgnoreCase("Trung Quoc") || p.getXuatXu().equalsIgnoreCase("China")) {
                    System.out.println(p + " [Danh muc: " + c.getTenDanhMuc() + "]");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Khong co san pham nao tu Trung Quoc.");
        }
    }

    // In toàn bộ dữ liệu
    private static void hienThiTatCa() {
        System.out.println("\n================= TAT CA DANH MUC VA SAN PHAM =================");
        for (Category c : dsDanhMuc) {
            System.out.println("\n" + c);
            System.out.println("------------------------------------------------------------");
            for (Product p : c.getDsSanPham()) {
                System.out.println("  + " + p);
            }
        }
    }

    // Tạo dữ liệu mẫu chạy thử
    private static void initSampleData() {
        Category c1 = new Category("DM01", "Dien thoai");
        c1.themSanPham(new Product("SP01", "iPhone 15 Pro", 28000000, "My"));
        c1.themSanPham(new Product("SP02", "Xiaomi 13", 12000000, "Trung Quoc"));

        Category c2 = new Category("DM02", "Gia dung");
        c2.themSanPham(new Product("SP03", "Noi chien khong dau", 2500000, "Trung Quoc"));
        c2.themSanPham(new Product("SP04", "Tu lanh Hitachi", 18000000, "Nhat Ban"));

        dsDanhMuc.add(c1);
        dsDanhMuc.add(c2);
    }
}
