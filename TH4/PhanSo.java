//Ho va ten sinh vien: Duong Nhu Quynh - MSSV: CNTT2411024

package TH4;
import java.util.Scanner;

public class PhanSo {
    // Thuoc tinh
    private int tuSo;
    private int mauSo;
    public PhanSo() {
        tuSo = 0;
        mauSo = 1;
    }
    public PhanSo(int tuSo, int mauSo) {
        if (mauSo == 0) {
            System.out.println("Mau so khong duoc bang 0");
            tuSo = 0;
            mauSo = 1;
        } else {
            this.tuSo = tuSo;
            this.mauSo = mauSo;
        }
    }

    public void enterFrac(Scanner sc) {
        int ts, ms;
        do {
            System.out.print("\tNhap vao tu so: ");
            ts = sc.nextInt();
            System.out.print("\tNhap vao mau so: ");
            ms = sc.nextInt();

            if (ms == 0) {
                System.out.println("Nhap lai thong tin cho phan so!");
            }
        } while (ms == 0);
        tuSo = ts;
        mauSo = ms;
    }

    // Ham hien thi phan so
    public void display() {
        if (tuSo * mauSo < 0) {
            System.out.println("-" + Math.abs(tuSo) + "/" + Math.abs(mauSo));
        } else {
            System.out.println(Math.abs(tuSo) + "/" + Math.abs(mauSo));
        }
    }

    // Ham cong 2 phan so
    public PhanSo add(PhanSo ps2) {
        int ts = tuSo * ps2.mauSo + ps2.tuSo * mauSo;
        int ms = mauSo * ps2.mauSo;
        return new PhanSo(ts, ms);
    }

    // Ham tru 2 phan so
    public PhanSo sub(PhanSo ps2) {
        int ts = tuSo * ps2.mauSo - ps2.tuSo * mauSo;
        int ms = mauSo * ps2.mauSo;
        return new PhanSo(ts, ms);
    }

    // Ham nhan 2 phan so
    public PhanSo mul(PhanSo ps2) {
        int ts = tuSo * ps2.tuSo;
        int ms = mauSo * ps2.mauSo;
        return new PhanSo(ts, ms);
    }

    // Ham nghich dao phan so
    public void inverse() {
        int tg = tuSo;
        tuSo = mauSo;
        mauSo = tg;
    }

    // Chia 2 phan so
    public PhanSo div(PhanSo ps2) {
        // Nghich dao ps2
        int tg = ps2.tuSo;
        ps2.tuSo = ps2.mauSo;
        ps2.mauSo = tg;

        // Nhan this vs ps2 (da nghich dao)
        int ts = tuSo * ps2.tuSo;
        int ms = mauSo * ps2.mauSo;
        return new PhanSo(ts, ms);
    }

    // Ham toi gian phan so
    public void optimize() {
        // Tim uscln
        int a = tuSo;
        int b = mauSo;
        int r = a % b;
        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }

        // Toi gian phan so
        tuSo /= b;
        mauSo /= b;
    }
    public double toDecimal()
    {
        return (double)this.tuSo/this.mauSo;
    }
}
