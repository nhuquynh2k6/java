//Ho va ten sinh vien: Duong Nhu Quynh - MSSV: CNTT2411024

package TH4;

public class bai1_main {
    public static void main(String[] args) {
        System.out.println("Kiem thu cac phep toan phan so");
        PhanSo psMacDinh=new PhanSo();
        PhanSo ps1=new PhanSo(2,4);
        PhanSo ps2=new PhanSo(3,5);
        System.out.println("Phan so mac dinh ban dau: "+psMacDinh);
        System.out.println("Phan so 1 truoc toi gian: "+ps1);
        ps1.optimize();
        System.out.println("Sau toi gian: "+ps1);
        System.out.println("Phan so 2: "+ps2);
        PhanSo tong=ps1.add(ps2);
        System.out.println("Phep cong: "+ps1+"+"+ps2+"="+tong+"(Thap phan: "+tong.toDecimal()+")");
        PhanSo hieu=ps1.sub(ps2);
        System.out.println("Phep tru: "+ps1+"-"+ps2+"="+hieu+"(Thap phan: "+hieu.toDecimal()+")");
        PhanSo tich=ps1.add(ps2);
        System.out.println("Phep nhan: "+ps1+"*"+ps2+"="+tich+"(Thap phan: "+tich.toDecimal()+")");
        PhanSo thuong=ps1.div(ps2);
        System.out.println("Phep chia: "+ps1+"/"+ps2+"="+thuong+"(Thap phan: "+thuong.toDecimal()+")");
        
    }
}
