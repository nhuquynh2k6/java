//Ho va ten sinh vien: Duong Nhu Quynh - MSSV: CNTT2411024

package TH4;

import java.util.Scanner;

public class ThuatToanSoHoc {
    public static int TimUSCLN(int a, int b)
    {
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static int TimBSCNN(int a, int b, int uscln)
    {
        return (a*b)/uscln;
    }
    public static int nhapSoNguyenDuong(Scanner scanner, String targetLabel)
    {
        int val;
        while(true)
        {
            System.out.println("Nhap so nguyen duong"+targetLabel+": ");
            if(scanner.hasNextInt())
            {
                val=scanner.nextInt();
                if(val>0)
                { break;}
            }
            System.out.println("Du lieu nhap vao phai la mot so nguyen duong. Vui long thu lai");
            scanner.nextLine();
        }
        return val;
    }
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int a=nhapSoNguyenDuong(scanner, "a");
        int b=nhapSoNguyenDuong(scanner, "b");
        int uscln=TimUSCLN(a, b);
        int bscnn=TimBSCNN(a, b, uscln);
        System.out.println("Uoc so chung lon nhat cua ("+a+","+b+") la: "+uscln);
        System.out.println("Boi so chung nho nhat cua ("+a+","+b+") la: "+bscnn);
        scanner.close();
    }
}
