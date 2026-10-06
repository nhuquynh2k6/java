//Ho va ten sinh vien: Duong Nhu Quynh - MSSV: CNTT2411024

package TH4;

import java.util.Scanner;

public class BankManager {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap so luong tai khoan can quan ly (n): ");
        int n=scanner.nextInt();
        scanner.nextLine();
        Account[] list=new Account[n];
        System.out.println("Nhap thong tin danh sach tai khoan");
        for(int i=0;i<n;i++)
        {
            System.out.println("\nTai khoan thu"+(i+1)+":");
            System.out.println("Nhap so tai khoan (long): ");
            long accNum=scanner.nextLong();
            scanner.nextLine();
            System.out.println("Nhap ten chu tai khoan: ");
            String name=scanner.nextLine();
            System.out.println("Nhap so du hien tai: ");
            double balance=scanner.nextDouble();
            scanner.nextLine();
            list[i]=new Account(accNum,balance,name);
        }
        //Hien thi danh sach duoi dang bang phan cot
        System.out.println("\n"+"=".repeat(62));
        System.out.println(String.format("%-15s|%-20s|%-19s|","So tai khoan","Chu tai khoan","So du hien tai"));
        System.out.println("-".repeat(62));
        for(Account acc:list)
        {
            System.out.println(acc);
        }
        System.out.println("=".repeat(62));
        if(n>0)
        {
            Account maxAcc=list[0];
            for(int i=1;i<n;i++)
            {
                if(list[i].getBalance()>maxAcc.getBalance())
                {
                    maxAcc=list[i];
                }
            }
            System.out.println("\nTai khoan co so du lon nhat: ");
            System.out.println(maxAcc);
        }
        System.out.println("Dang tien hanh cong lai suat dong loat (rate=3.5%)...");
        for(Account acc:list)
        {
            acc.addInterest();
        }
        System.out.println("Danh sach tai khoan sau khi cap nhat tien lai");
        System.out.println("=".repeat(62));
        System.out.println(String.format("|%-15s|%-20s|%-19s|","So tai khoan","Chu tai khoan","So du hien tai"));
        System.out.println("-".repeat(62));
        for(Account acc:list)
        {
            System.out.println(acc);
        }
        System.out.println("=".repeat(62));
        scanner.close();
    }
}
