package TH5;

import java.io.*;
import java.util.*;

public class StudentManager {
    private static final String FILE_NAME = "students.txt";
    private List<baitap4> studentList;
    private Scanner scanner;

    public StudentManager() {
        studentList = new ArrayList<>();
        scanner = new Scanner(System.in);
        loadFromFile(); // Doc du lieu tu file khi khoi dong
    }

    public void AddStudent() {
        System.out.print("Nhap id: ");
        String id = scanner.nextLine();
        System.out.print("Nhap ten: ");
        String name = scanner.nextLine();
        System.out.print("Nhap tuoi: ");
        int age = Integer.parseInt(scanner.nextLine()); // SỬA: Đổi kiểu dữ liệu sang int
        System.out.print("Nhap dia chi: ");
        String address = scanner.nextLine();
        System.out.print("Nhap diem trung binh: ");
        double gpa = Double.parseDouble(scanner.nextLine()); // SỬA: Đổi kiểu dữ liệu sang double

        // Giả định constructor lớp Student của bạn nhận các tham số tương ứng (String, String, int, String, double)
        studentList.add(new baitap4(id, name, age, address, gpa));
        saveToFile();
        System.out.println("Them sinh vien thanh cong");
    } // SỬA: Thêm dấu đóng ngoặc nhọn bị thiếu ở đây để tránh lỗi lồng hàm!

    public void editStudentById() {
        System.out.print("Nhap id sinh vien can sua: ");
        String id = scanner.nextLine();
        baitap4 st = findById(id);
        if (st != null) {
            System.out.println("Dang sua thong tin sinh vien " + id);
            System.out.print("Ten moi (cu: " + st.getName() + "): ");
            st.setName(scanner.nextLine());
            System.out.print("Tuoi moi (cu: " + st.getAge() + "): ");
            st.setAge(Integer.parseInt(scanner.nextLine()));
            System.out.print("Dia chi moi (cu: " + st.getAddress() + "): ");
            st.setAddress(scanner.nextLine());
            System.out.print("Diem moi (cu: " + st.getGpa() + "): ");
            st.setGpa(Double.parseDouble(scanner.nextLine()));
            saveToFile();
            System.out.println("Sua thong tin thanh cong");
        } else {
            System.out.println("Khong tim thay sinh vien co id: " + id);
        }
    }

    public void deleteStudentById() {
        System.out.print("Nhap id sinh vien can xoa: ");
        String id = scanner.nextLine();
        baitap4 st = findById(id);
        if (st != null) {
            studentList.remove(st);
            saveToFile();
            System.out.println("Xoa sinh vien thanh cong");
        } else {
            System.out.println("Khong tim thay sinh vien co id: " + id);
        }
    }

    public void sortStudentByGpa() {
        System.out.println("1. Tang dan | 2. Giam dan");
        System.out.print("Lua chon cua ban: ");
        int choice = Integer.parseInt(scanner.nextLine());
        if (choice == 1) {
            studentList.sort(Comparator.comparingDouble(baitap4::getGpa));
        } else if (choice == 2) {
            // SỬA: Thêm cặp ngoặc đơn (s1, s2) cho biểu thức Lambda chuẩn
            studentList.sort((s1, s2) -> Double.compare(s2.getGpa(), s1.getGpa()));
        } else {
            System.out.println("Lua chon khong hop le");
            return;
        }
        showStudents();
    }

    // SỬA: Bổ sung phương thức sắp xếp theo Tên (Alphabet) bị thiếu
    public void sortStudentByName() {
        studentList.sort((s1, s2) -> s1.getName().compareToIgnoreCase(s2.getName()));
        System.out.println("Da sap xep sinh vien theo ten (Alphabet).");
        showStudents();
    }

    public void showStudents() {
        if (studentList.isEmpty()) {
            System.out.println("Danh sach sinh vien trong");
        } else {
            System.out.println("Danh sach sinh vien:");
            for (baitap4 st : studentList) {
                System.out.println(st);
            }
            System.out.println();
        }
    }

    private baitap4 findById(String id) {
        for (baitap4 st : studentList) {
            if (st.getId().equalsIgnoreCase(id))
                return st;
        }
        return null;
    }

    private void saveToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(studentList);
        } catch (IOException e) {
            System.out.println("Loi khi luu file: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    private void loadFromFile() {
        File file = new File(FILE_NAME); // SỬA: Thêm dấu chấm phẩy `;`
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
                studentList = (List<baitap4>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Loi khi doc file: " + e.getMessage());
            }
        }
    }

    public void Menu() {
        int choice;
        do { // SỬA: Sắp xếp lại chuẩn khối lệnh do-while gán gọn gàng với switch-case
            System.out.println("1. Add student (Them sinh vien)");
            System.out.println("2. Edit student by id (Sua thong tin sinh vien bang id)");
            System.out.println("3. Delete student by id (Xoa sinh vien bang id)");
            System.out.println("4. Sort student by gpa (Sap xep sinh vien theo gpa)");
            System.out.println("5. Sort student by name (Sap xep sinh vien theo ten, theo thu tu alphabet)");
            System.out.println("6. Show student (Hien thi danh sach sinh vien)");
            System.out.println("0. Exit (Thoat khoi chuong trinh)");
            System.out.print("Nhap lua chon cua ban: ");
            
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    AddStudent();
                    break;
                case 2:
                    editStudentById();
                    break;
                case 3:
                    deleteStudentById();
                    break;
                case 4:
                    sortStudentByGpa();
                    break;
                case 5:
                    sortStudentByName();
                    break;
                case 6:
                    showStudents();
                    break;
                case 0:
                    System.out.println("Da thoat chuong trinh");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long nhap lai");
            }
        } while (choice != 0); // SỬA: Đưa điều kiện của vòng lặp nằm ngoài khối đóng của `do`
    }

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        manager.Menu();
    }
}