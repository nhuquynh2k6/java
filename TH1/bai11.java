import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap vao so kWh: ");
        double soKWh=scanner.nextDouble();
        double tong=0;

        if(soKWh<0)
            System.out.println("So kWh nhap vao khong hop le");
        else
        {
            if(soKWh<=50)
                tong=soKWh*1800;
            else if(soKWh<=100)
                tong=(50*1800)+((soKWh-50)*2000);
            else
                tong=(50*1800)+(50*2000)+((soKWh-100)*2500);
        }
        System.out.println("Tong so tien dien phai tra la: " + tong);
        scanner.close();
    }
}
