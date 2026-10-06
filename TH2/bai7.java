import java.util.Scanner;

public class bai7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        // 1. Nhập kích thước mảng n (bắt buộc n > 0)
        do {
            System.out.print("Nhap so luong phan tu cua mang (n > 0): ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Kich thuoc mang khong hop le. Vui long nhap lai!");
            }
        } while (n <= 0);

        int[] arr = new int[n];

        // 2. Nhập các phần tử là số nguyên dương
        System.out.println("--- Nhap cac phan tu cua mang ---");
        for (int i = 0; i < n; i++) {
            do {
                System.out.print("Phan tu thu " + (i + 1) + ": ");
                arr[i] = scanner.nextInt();
                if (arr[i] <= 0) {
                    System.out.println("Vui long nhap so nguyen duong (> 0)!");
                }
            } while (arr[i] <= 0);
        }

        // 3. Đếm số lượng số nguyên tố có trong mảng ban đầu
        int soLuongSNT = 0;
        for (int i = 0; i < n; i++) {
            if (laSoNguyenTo(arr[i])) {
                soLuongSNT++;
            }
        }

        // 4. Đảo ngược thứ tự các phần tử của mảng ban đầu (Thuật toán hoán đổi đối xứng)
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }

        // 5. Đầu ra (Output): Hiển thị kết quả
        System.out.print("Mang sau khi dao nguoc la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        System.out.println("Số lượng số nguyên tố trong mảng là: " + soLuongSNT);

        scanner.close();
    }

    /**
     * Hàm helper dùng để kiểm tra một số nguyên có phải là số nguyên tố hay không
     */
    public static boolean laSoNguyenTo(int k) {
        if (k < 2) {
            return false;
        }
        // Kiểm tra từ 2 đến căn bậc hai của k để tối ưu hiệu năng
        for (int i = 2; i <= Math.sqrt(k); i++) {
            if (k % i == 0) {
                return false; // Chia hết cho số khác ngoài 1 và chính nó
            }
        }
        return true;
    }
}
