package TH3;
import java.util.ArrayList;

public class ManageDocument {
    private ArrayList<Document> documents;

    public ManageDocument() {
        this.documents = new ArrayList<>();
    }

    // Chức năng 1: Thêm mới tài liệu
    public void addDocument(Document doc) {
        this.documents.add(doc);
        System.out.println(">> Them thanh cong tai lieu ma: " + doc.getMaTaiLieu());
    }

    // Chức năng 2: Hiển thị thông tin chi tiết hệ thống tài liệu hiện tại
    public void displayAll() {
        if (documents.isEmpty()) {
            System.out.println("Thu vien hien dang trong!");
            return;
        }
        for (Document doc : documents) {
            System.out.println(doc);
        }
    }

    // Chức năng 3: Tìm kiếm tài liệu theo phân loại (Sách/Tạp chí/Báo)
    // Truyền vào kiểu: 1 - Sách, 2 - Tạp chí, 3 - Báo
    public void searchByType(int type) {
        boolean found = false;
        for (Document doc : documents) {
            if (type == 1 && doc instanceof Book) {
                System.out.println(doc);
                found = true;
            } else if (type == 2 && doc instanceof Magazine) {
                System.out.println(doc);
                found = true;
            } else if (type == 3 && doc instanceof Newspaper) {
                System.out.println(doc);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay tai lieu nao thuoc phan loai nay");
        }
    }
}

