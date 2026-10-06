import java.util.Arrays;
import java.util.Scanner;
public class baitap4 {
    private static Scanner sc = new Scanner(System.in);
    // 1. Nhập mảng số nguyên
    public static int[] nhapMang() {
        System.out.print("Nhậap so luong phan tu n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            System.out.printf("arr[%d] = ", i);
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    // 2. Xuất mảng số nguyên
    public static void xuatMang(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Mang rong!");
            return;
        }
        System.out.println("Mang hien tai: " + Arrays.toString(arr));
    }
    // 3. Tìm kiếm giá trị bất kỳ nhập vào từ bàn phím
    public static void timKiem(int[] arr) {
        System.out.print("Nhậap gia tri x can tim: ");
        int x = sc.nextInt();
        boolean found = false;
        System.out.print("Gia tri " + x + " xuat hien tai vi tri (index): ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.print(i + " ");
                found = true;
            }
        }
        System.out.println();

        if (!found) {
            System.out.println("Khong tim thay gia tri " + x + " trong mang.");
        }
    }
    // Hàm phụ trợ: Kiểm tra số nguyên tố
    private static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    // 4. Xuất tất cả các số nguyên tố trong mảng
    public static void xuatSoNguyenTo(int[] arr) {
        System.out.print("Cac so nguyen to trong mang: ");
        boolean found = false;
        for (int x : arr) {
            if (isPrime(x)) {
                System.out.print(x + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.print("Khong co so nguyen to nao.");
        }
        System.out.println();
    }
    // --- CÁC THUẬT TOÁN SẮP XẾP ---
    // BubbleSort (Sắp xếp nổi bọt)
    public static int[] bubbleSort(int[] arr) {
        int[] a = arr.clone(); // Sao chép để không hỏng mảng gốc
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        return a;
    }
    // SelectionSort (Sắp xếp chọn)
    public static int[] selectionSort(int[] arr) {
        int[] a = arr.clone();
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = a[minIdx];
            a[minIdx] = a[i];
            a[i] = temp;
        }
        return a;
    }
    // InsertionSort (Sắp xếp chèn)
    public static int[] insertionSort(int[] arr) {
        int[] a = arr.clone();
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
        return a;
    }
    // QuickSort (Sắp xếp nhanh)
    public static int[] quickSort(int[] arr) {
        int[] a = arr.clone();
        quickSortHelper(a, 0, a.length - 1);
        return a;
    }
    private static void quickSortHelper(int[] a, int low, int high) {
        if (low < high) {
            int pivotIdx = partition(a, low, high);
            quickSortHelper(a, low, pivotIdx - 1);
            quickSortHelper(a, pivotIdx + 1, high);
        }
    }
    private static int partition(int[] a, int low, int high) {
        int pivot = a[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (a[j] < pivot) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[i + 1];
        a[i + 1] = a[high];
        a[high] = temp;
        return i + 1;
    }
    // 5. Xóa một giá trị bất kỳ xuất hiện trong mảng (xóa tất cả các phần tử trùng với giá trị đó)
    public static int[] xoaGiaTri(int[] arr) {
        System.out.print("Nhap gia tri x can xoa: ");
        int x = sc.nextInt();
        // Đếm số phần tử khác x
        int count = 0;
        for (int val : arr) {
            if (val != x) count++;
        }
        if (count == arr.length) {
            System.out.println("Gia tri " + x + " khong ton tai trong mang!");
            return arr;
        }

        // Tạo mảng mới không chứa x
        int[] newArr = new int[count];
        int index = 0;
        for (int val : arr) {
            if (val != x) {
                newArr[index++] = val;
            }
        }
        System.out.println("Da xoa gia tri " + x + " khoi mang.");
        return newArr;
    }
    // 6. Kiểm tra mảng có đối xứng hay không
    public static boolean isSymmetric(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - 1 - i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = null;
        int choice;
        do {
            System.out.println("\n========== THAO TAC TREN MANG SO NGUYEN ==========");
            System.out.println("1. Nhap mang");
            System.out.println("2. Xuat mang");
            System.out.println("3. Tim kiem gia tri bat ki");
            System.out.println("4. Xuat tat ca cac so nguyen to");
            System.out.println("5. Sap xep mang (BubbleSort, SelectionSort, InsertionSort, QuickSort)");
            System.out.println("6. Xoa mot gia tri bat ki");
            System.out.println("7. Kiem tra mang doi xung");
            System.out.println("0. Thoat");
            System.out.print("Lua chon cua ban: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    arr = nhapMang();
                    break;
                case 2:
                    xuatMang(arr);
                    break;
                case 3:
                    if (arr == null) System.out.println("Vui long nhap mang truoc!");
                    else timKiem(arr);
                    break;
                case 4:
                    if (arr == null) System.out.println("Vui long nhap mang truoc!");
                    else xuatSoNguyenTo(arr);
                    break;
                case 5:
                    if (arr == null) {
                        System.out.println("Vui long nhap mang truoc!");
                        break;
                    }
                    System.out.println("\n--- BANG KET QUA SAP XEP ---");
                    System.out.println("Mang goc: " + Arrays.toString(arr));
                    System.out.println("BubbleSort:    " + Arrays.toString(bubbleSort(arr)));
                    System.out.println("SelectionSort: " + Arrays.toString(selectionSort(arr)));
                    System.out.println("InsertionSort: " + Arrays.toString(insertionSort(arr)));
                    System.out.println("QuickSort:     " + Arrays.toString(quickSort(arr)));
                    break;
                case 6:
                    if (arr == null) System.out.println("Vui long nhap mang truoc!");
                    else {
                        arr = xoaGiaTri(arr);
                        xuatMang(arr);
                    }
                    break;
                case 7:
                    if (arr == null) System.out.println("Vui long nhap mang truoc!");
                    else {
                        if (isSymmetric(arr)) {
                            System.out.println("Mang nay la mang doi xung.");
                        } else {
                            System.out.println("Mang nay khong doi xung.");
                        }
                    }
                    break;
                case 0:
                    System.out.println("Da thoat chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } 
        while (choice != 0);
        sc.close();
    }
}
