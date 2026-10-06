import java.util.Date;

public class bai1 {
    public static void main(String[] args) {
        // 1. Khởi tạo đối tượng Date để lấy thời gian thực của hệ thống
        Date today = new Date();
        // 2. Lấy số thứ tự của ngày trong tuần (0: Chủ Nhật, 1: Thứ 2, ..., 6: Thứ 7)
        int dayOfWeek = today.getDay();
        // 3. Sử dụng cấu trúc rẽ nhánh để kiểm tra và in kết quả
        if (dayOfWeek == 0) {
            // Trường hợp 1: Nếu là 0 thì tức là Chủ Nhật
            System.out.println("Đung roi! Hom nay la chu nhat");
        } else {
            // Trường hợp 2: Các ngày còn lại từ 1 đến 6
            String thuHienTai = "";
            // Chuyển đổi số thành chuỗi ký tự tên Thứ tương ứng
            switch (dayOfWeek) {
                case 1: thuHienTai = "Hai"; break;
                case 2: thuHienTai = "Ba"; break;
                case 3: thuHienTai = "Tu"; break;
                case 4: thuHienTai = "Nam"; break;
                case 5: thuHienTai = "Sau"; break;
                case 6: thuHienTai = "Bay"; break;
            }
            System.out.println("Hom nay khong phai la chu nhat. Hom nay la thu " + thuHienTai + ".");
        }
    }
}