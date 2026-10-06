import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap vao so nguyen n: ");
        int n=scanner.nextInt();
        if(n%2==0)
            System.out.println(n + " la so chan");
        else
            System.out.print(n + " la so le");
        scanner.close();
    }
}
