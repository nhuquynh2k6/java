import java.util.Scanner;
public class bai10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap so luong phan tu cua mang (n>0): ");
            n=scanner.nextInt();
            if(n<=0) {
                System.out.println("Kich thuoc mang khong hop le. Vui long nhap lai");
            }
        }
            while(n<=0);
            int arr[]=new int[n];
            System.out.println("Nhap cac phan tu cua mang");
            for(int i=0;i<n;i++)
            {
                System.out.print("Phan tu thu "+(i+1)+": ");
                arr[i]=scanner.nextInt();
            }
        // 3. Áp dụng thuật toán Bubble Sort để sắp xếp tăng dần
        // Vòng lặp ngoài kiểm soát số lượt quét (cần n-1 lượt)
        for (int i = 0; i < n - 1; i++) {
            // Vòng lặp trong thực hiện so sánh các cặp phần tử kề nhau
            for (int j = 0; j < n - 1 - i; j++) {
                // Nếu phần tử đứng trước lớn hơn phần tử đứng sau -> Hoán đổi vị trí
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print("Mang sau khi sap xep tang dan la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        scanner.close();
    }
}