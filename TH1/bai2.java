import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap vao ho ten: ");
        String Ten_Vua_Nhap=scanner.nextLine();
        System.out.println("Xin chao " + Ten_Vua_Nhap);
        scanner.close();
    }
}