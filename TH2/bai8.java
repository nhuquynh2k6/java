import java.util.Scanner;
public class bai8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap mot chuoi van ban: ");
        String chuoi=scanner.nextLine();
        System.out.print("Nhap vao ki tu can dem: ");
        char kiTuCanTim=scanner.next().charAt(0);
        int soLanXuatHien=0;
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == kiTuCanTim) {
                soLanXuatHien++;
            }
        }
        System.out.println("Ki tu "+kiTuCanTim+"xuat hien"+soLanXuatHien+"lan trong chuoi");
        scanner.close();
    }
}
