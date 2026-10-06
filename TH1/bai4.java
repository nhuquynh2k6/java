import java.time.Year;
import java.util.Scanner;
public class bai4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap vao nam sinh: ");
        int namSinh=scanner.nextInt();
        int namHienTai=Year.now().getValue();
        int tuoi=namHienTai-namSinh;
        System.out.println("Ban sinh nam " + namSinh + ", vay ban " + tuoi + " tuoi");
        scanner.close();
    }
}
