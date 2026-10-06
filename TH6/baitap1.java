import java.util.Scanner;

public class baitap1
{
    public static void timTongLonNhat(double[][]A,int n)
    {
        double maxValue = -Double.MAX_VALUE;
        String location="";
        for(int i=0;i<=n;i++)
        {
            double sum=0;
            for(int j=0;j<=n;j++)
            {
                sum+=A[i][j];
            }
            if(sum>maxValue)
            {
                maxValue=sum;
                location="Hang"+(i+1);
            }
        }
        for(int j=0;j<n;j++)
        {
            double sum=0;
            for(int i=0;j<n;i++)
            {
                sum+=A[i][j];
            }
            if(sum>maxValue)
            {
                maxValue=sum;
                location="Cot"+(j+1);
            }
        }
        double duongCheoChinh=0;
        for(int i=0;i<n;i++)
        {
            duongCheoChinh+=A[i][i];
        }
        if(duongCheoChinh>maxValue)
        {
            maxValue=duongCheoChinh;
            location="Duong cheo chinh";
        }
        double duongCheoPhu=0;
        for(int i=0;i<n;i++)
        {
            duongCheoPhu+=A[i][n-1-i];
        }
        if(duongCheoPhu>maxValue)
        {
            maxValue=duongCheoPhu;
            location="Duong cheo phu";
        }
        System.out.print(location+"co tong lon nhat la"+maxValue);
    }
    public static double[][] maTranChuyenVi(double[][] A, int n) {
        double[][] At = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                At[j][i] = A[i][j];
            }
        }
        return At;
    }
    public static double dinhThuc(double[][]A,int n)
    {
        double[][] temp=cloneMatrix(A,n);
        double det=1;
        int swapCount=0;
        for(int i=0;i<n;i++)
        {
            int pivot=i;
            for(int k=i+1;k<n;k++)
            {
                if(Math.abs(temp[k][i])>Math.abs(temp[pivot][i]))
                {
                    pivot=k;
                }
                if (Math.abs(temp[pivot][i]) < 1e-9) return 0;
            }
            if (pivot != i) {
                double[] rowTemp = temp[i];
                temp[i] = temp[pivot];
                temp[pivot] = rowTemp;
                swapCount++;
            }
            det *= temp[i][i];
            for (int j = i + 1; j < n; j++) {
                double factor = temp[j][i] / temp[i][i];
                for (int k = i; k < n; k++) {
                    temp[j][k] -= factor * temp[i][k];
                }
            }
        }
        return(swapCount%2==0)?det:det;
    }
    public static double[][] MaTranNghichDao(double[][] A, int n) {
        double[][] aug = new double[n][2 * n];
        // Ghép ma trận đơn vị I vào bên phải ma trận A
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) aug[i][j] = A[i][j];
            aug[i][i + n] = 1.0;
        }
        for(int i=0;i<n;i++)
        {
            int pivot=i;
            for(int k=i+1;k<n;k++)
            {
                if (Math.abs(aug[k][i]) > Math.abs(aug[pivot][i])) 
                    pivot = k;
            }
            if(Math.abs(aug[pivot][i])<1e-9)
            {
                return null;
            }
            double[] temp = aug[i];
            aug[i] = aug[pivot];
            aug[pivot] = temp;
            double div = aug[i][i];
            for (int j = 0; j < 2 * n; j++) 
                aug[i][j] /= div;
            //Khử tất cả phần tử ở cột i (trừ aug[i][i])
            for (int k = 0; k < n; k++) {
                if (k != i) {
                    double factor = aug[k][i];
                    for (int j = 0; j < 2 * n; j++) {
                        aug[k][j] -= factor * aug[i][j];
                    }
                }
            }
        }
        // Tách ma trận nghịch đảo ra khỏi ma trận mở rộng
        double[][] inv = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                inv[i][j] = aug[i][j + n];
            }
        }
        return inv;
    }
    public static void solveGauss(double[][] A, double[] B, int n) {
        double[][] aug = new double[n][n + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) aug[i][j] = A[i][j];
            aug[i][n] = B[i];
        }
        // Quá trình khử thuận
        for (int i = 0; i < n; i++) {
            int pivot = i;
            for (int k = i + 1; k < n; k++) {
                if (Math.abs(aug[k][i]) > Math.abs(aug[pivot][i])) pivot = k;
            }

            if (Math.abs(aug[pivot][i]) < 1e-9) {
                System.out.println("Hệ phương trình không có nghiệm duy nhất (Vô nghiệm hoặc vô số nghiệm).");
                return;
            }

            double[] temp = aug[i];
            aug[i] = aug[pivot];
            aug[pivot] = temp;

            for (int j = i + 1; j < n; j++) {
                double factor = aug[j][i] / aug[i][i];
                for (int k = i; k <= n; k++) {
                    aug[j][k] -= factor * aug[i][k];
                }
            }
        }
        // Quá trình thế ngược
        double[] X = new double[n];
        for (int i = n - 1; i >= 0; i--) {
            double sum = 0;
            for (int j = i + 1; j < n; j++) sum += aug[i][j] * X[j];
            X[i] = (aug[i][n] - sum) / aug[i][i];
        }

        // In nghiệm
        System.out.println("Nghiệm của hệ AX = B là:");
        for (int i = 0; i < n; i++) {
            System.out.printf("x[%d] = %.4f\n", (i + 1), X[i]);
        }
    }
    // Hàm phụ trợ: Sao chép ma trận để tránh sửa dữ liệu gốc
    private static double[][] cloneMatrix(double[][] A, int n) {
        double[][] copy = new double[n][n];
        for (int i = 0; i < n; i++) System.arraycopy(A[i], 0, copy[i], 0, n);
        return copy;
    }

    // Hàm in ma trận
    public static void printMatrix(double[][] M, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%8.2f ", M[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập cấp n của ma trận vuông A: ");
        int n = sc.nextInt();

        double[][] A = new double[n][n];
        System.out.println("Nhập các phần tử ma trận A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("A[%d][%d] = ", i + 1, j + 1);
                A[i][j] = sc.nextDouble();
            }
        }

        System.out.println("\n--- MA TRAN A BAN DAU ---");
        printMatrix(A, n);

        // a. Hàng, cột, đường chéo có tổng lớn nhất
        System.out.println("\na. TIM TONG LON NHAT:");
        timTongLonNhat(A, n);

        // b. Ma trận chuyển vị
        System.out.println("\nb. MA TRAN CHUYEN VI A^T:");
        double[][] At = maTranChuyenVi(A, n);
        printMatrix(At, n);

        // c. Định thức
        System.out.println("\nc. ĐINH THUC CUA A:");
        double det = dinhThuc(A, n);
        System.out.printf("det(A) = %.4f\n", det);

        // d. Ma trận nghịch đảo
        System.out.println("\nd. MA TRAN NGHICH DAO A^(-1):");
        if (Math.abs(det) < 1e-9) {
            System.out.println("Ma tran A khong co ma tran nghich dao do det(A) = 0.");
        } else {
            double[][] invA = MaTranNghichDao(A, n);
            printMatrix(invA, n);
        }

        // e. Giải hệ phương trình AX = B
        System.out.println("\ne. GIAI HE PHUONG TRINH AX = B:");
        double[] B = new double[n];
        System.out.println("Nhap vector ve phai B (n phan tu):");
        for (int i = 0; i < n; i++) {
            System.out.printf("B[%d] = ", i + 1);
            B[i] = sc.nextDouble();
        }
        solveGauss(A, B, n);
        sc.close();
    }
}