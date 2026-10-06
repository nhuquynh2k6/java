import java.util.Scanner;

public class StudentBody {

    // Hàm phụ trợ hỗ trợ nhập nhanh địa chỉ
    private static Address inputAddress(Scanner sc, String type) {
        System.out.println("  --- Nhap dia chi " + type + " ---");
        System.out.print("  Dia chi duong (Street): ");
        String street = sc.nextLine();
        System.out.print("  Thanh pho (City): ");
        String city = sc.nextLine();
        System.out.print("  Bang/Tinh (State): ");
        String state = sc.nextLine();
        System.out.print("  Ma buu dien (Zip Code): ");
        long zipCode = Long.parseLong(sc.nextLine());

        return new Address(street, city, state, zipCode);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luong sinh vien: ");
        int count = Integer.parseInt(sc.nextLine());

        Student[] students = new Student[count];

        // Nhập danh sách sinh viên
        for (int i = 0; i < count; i++) {
            System.out.println("\n====================================");
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1));
            System.out.print("Ten (FirstName): ");
            String firstName = sc.nextLine();
            System.out.print("Ho (LastName): ");
            String lastName = sc.nextLine();

            // Nhập 2 địa chỉ
            Address home = inputAddress(sc, "nha");
            Address school = inputAddress(sc, "truong");

            // Tạo đối tượng Student
            students[i] = new Student(firstName, lastName, home, school);
        }

        // Xuất thông tin danh sách sinh viên
        System.out.println("\n====================================");
        System.out.println("DANH SACH THONG TIN SINH VIEN");
        System.out.println("====================================");
        for (int i = 0; i < count; i++) {
            System.out.println("\n[Sinh vien " + (i + 1) + "]");
            System.out.println(students[i]);
            System.out.println("------------------------------------");
        }

        sc.close();
    }
}
