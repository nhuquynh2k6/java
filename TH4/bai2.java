//Ho va ten sinh vien: Duong Nhu Quynh - MSSV: CNTT2411024

package TH4;

import java.util.Random;

public class bai2 {
    public class  UngDungRandom {
        public static void main(String[] args) {
            Random random=new Random();
            int soNguyenBatKi=random.nextInt();
            System.out.println("So nguyen thuoc toan mien int: "+soNguyenBatKi);
            int nguyen0_9=random.nextInt(10);
            System.out.println("So nguyen trong doan [0,9]: "+nguyen0_9);
            int nguyen1_10=random.nextInt(10)+1;//random.nextInt(10-1+1)+1
            System.out.println("So nguyen trong doan [1,10]: "+nguyen1_10);
            int nguyen20_34=random.nextInt(34-20+1)*20;//random.nextInt(15)+20
            System.out.println("So nguyen trong doan [20,34]: "+nguyen20_34);
            int nguyenAm10_9=random.nextInt(9-(-10)*1)+(-10);//random.nextInt(20)-10
            System.out.println("So nguyen trong doan [10,9]: "+nguyenAm10_9);
            double thuc0_1=random.nextDouble();
            System.out.println("So thuc trong doan [0.0,1.0]: "+thuc0_1);
            double thuc0_6=random.nextDouble()*6.0;
            System.out.println("So thuc trong doan [0.0,6.0]: "+thuc0_6);
        }
    }
}
