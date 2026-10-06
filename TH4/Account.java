//Ho va ten sinh vien: Duong Nhu Quynh - MSSV: CNTT2411024
package TH4;

public class Account {
    public final static double RATE=0.035;
    private long accountNumber;
    private double balance;
    private String name;
    public Account()
    {
        this.accountNumber=0L;
        this.balance=0.0;
        this.name="";
    }
    public Account(long accountNumber, double balance, String name)
    {
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.name=name;
    }
    public long getAccountNumber()
    {
        return accountNumber;
    }
    public void setAccountNumber(long accountNumber)
    {
        this.accountNumber=accountNumber;
    }
    public double getBalance()
    {
        return balance;
    }
    public void setBalance(long balance)
    {
        this.balance=balance;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public double deposit(double amount)
    {
        if(amount>0)
        {
            this.balance+=amount;
        }
        else
        {
            System.out.println("So tien gui phai lon hon 0");
        }
        return this.balance;
    }
    public double withdraw(double amount, double fee)
    {
        double totalCost=amount+fee;
        if(amount<=0||fee<0)
        {
            System.out.println("Du lieu so tien rut hoac phi khong hop le");
        }
        else
        {
            this.balance-=totalCost;
        }
        return this.balance;
    }
    public double addInterest()
    {
        double interest=this.balance*RATE;
        this.balance+=interest;
        return this.balance;
    }
    public String toString()
    {
        return String.format("|%-15d|%-20s|%,15.2f VND|",accountNumber,name,balance);
    }
}
