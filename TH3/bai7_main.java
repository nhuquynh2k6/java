package TH3;

public class bai7_main {
    public static void main(String[] args) {
        Employee[] dsNhanVien=new Employee[3];
        dsNhanVien[0]=new Boss("Nguyen Van A", 5000.0);
        dsNhanVien[1]=new PieceWorker("Tran Thi Binh",1200);
        dsNhanVien[2]=new CommissionWorker("Le Hoang Nam",2000.0,4500);
        for(Employee emp:dsNhanVien)
        {
            System.out.println(emp.toString());
        }
    }
}
