package TH5;

public class baitap4 {
    private String id;
    private String name;
    private int age;
    private String address;
    private double gpa;
    public baitap4(){}
    public baitap4(String id,String name,int age,String address,double gpa)
    {
        this.id=id;
        this.name=name;
        this.age=age;
        this.address=address;
        this.gpa=gpa;
    }
    public String getId()
    {
        return id;
    }
    public void setId(String id)
    { 
        this.id=id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    { 
        this.name=name;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    { 
        this.age=age;
    }
    public String getAddress()
    {
        return address;
    }
    public void setAddress(String address)
    { 
        this.address=address;
    }
    public double getGpa()
    {
        return gpa;
    }
    public void setGpa(double gpa)
    { 
        this.gpa=gpa;
    }
    public String toString()
    {
        return "ID: "+id+" | Ten: "+name+" | Tuoi: "+age+" | Dia chi: "+address+" | Diem trung binh: "+gpa;
    }
}
