package TH3;

public class bai6 {
    public class Triangular
    {
        public static double tinhDienTich(double canhDay, double chieuCao)
        {
            if (canhDay<=0||chieuCao<=0)
            {
                System.out.println("Loi: Do dai canh day va chieu cao phai lon hon 0!");
                return -1;
            }
            return 0.5*canhDay*chieuCao;
        }
        public static double tinhDienTich(double a, double b, double c)
        {
            if(a<=0||b<=0||c<=0||a+b<=c||a+c<=b||b+c<=a)
            {
                System.out.println("Loi: 3 canh nhap vao khong tao thanh mot tam giac hop le!");
                return -1;
            }
            double p=(a+b+c)/2.0;//Nửa chu vi
            return Math.sqrt(p*(p-a)*(p-b)*(p-c));
        }
        public static double tinhDienTich(double a, double b, int gocDo)
        {
            if(a<=0||b<=0||gocDo<=0||gocDo>=180)
            {
                System.out.println("Loi: Du lieu canh hoac goc (0<goc<180) khong hop le!");
                return -1;
            }
            double gocRadian=Math.toRadians(gocDo);
            return 0.5*a*b*Math.sin(gocRadian);
        }
    }
}
