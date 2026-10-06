//Ho va ten sinh vien: Duong Nhu Quynh - MSSV: CNTT2411024

package TH4;

import java.util.Scanner;

public class XuLyLogicNhanSu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int tuoi=0;
        while(true)
        {
            System.out.println("Nhap so tuoi cua ban: ");
            if(scanner.hasNextInt())
            {
                tuoi=scanner.nextInt();
                if(tuoi>0)
                {
                    break;
                }
            }
            System.out.println("Tuoi phai la so nguyen va co gia tri lon hon 0");
            scanner.nextLine();
        }
        scanner.nextLine();//tranh troi dong tiep theo
    String nhomTuoi="";
    if(tuoi>=1&&tuoi<=10)
    {
        nhomTuoi="Thanh nien";
    }
    else if(tuoi>=19&&tuoi<=65)
    {
        nhomTuoi="Trung nien";
    } 
    else
    {
        nhomTuoi="Lao nien";
    }
    System.out.println("Phan loai nhom tuoi: "+nhomTuoi);
    String ngayHeThong="09/07";
        System.out.println("Nhap ngay thang nam sinh cua ban (Dinh dang dd/mm, vi du: 09/07)");
        String ngaySinhUser=scanner.nextLine().trim();
        if(ngaySinhUser.equals(ngayHeThong))
        {
            System.out.println("\nChuc mung sinh nhat. Chuc ban co mot ngay tuoi moi ngap tran niem vui va hanh phuc");
        }
        else
        {
            System.out.println("Hom nay khong phai sinh nhat cua ban. Chuc ban mot ngay lam viec/hoc tap vui ve");
        }
        scanner.close();
    }
}
