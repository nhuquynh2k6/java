package TH5;

public class baitap3 {
    public static boolean laSoThuanNghich(int n)
    {
        int original=n;
        int reversed=0;
        while ((n>0)) {
            reversed=reversed*10+n%10;
            n/=10;
        }
        return original==reversed;
    }
    public static void main(String[] args) {
        int textNumber=123321;
        if(laSoThuanNghich(textNumber))
            System.out.println(textNumber+" la so thuan nghich");
        else
            System.out.println(textNumber+" khong phai la so thuan nghich");
        System.out.println("\nCac so thuan nghich tu 100000 den 100099 la: ");
        for(int i=100000;i<=999999;i++)
        {
            if(laSoThuanNghich(i))
            {
                if(i<=100099)
                    System.out.print(i+" ");
            }
        }
    }
}
