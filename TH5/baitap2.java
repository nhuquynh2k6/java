package TH5;
import java.util.HashMap;
import java.util.Map;

public class baitap2 {
    public static void main(String[] args) {
        String chuoi="chuyen de ngon ngu lap trinh 2, hoc ngon ngu java";
        //Chuyen thanh chu thuong va loai bo dau cau
        chuoi=chuoi.toLowerCase();
        //Tach chuoi thanh mang cac tu dua tren khoang trang
        String[] tuMang=chuoi.split("\\s+");
        //Su dung Map de luu tu va so lan xuat hien 
        Map<String,Integer> bangDem=new HashMap<>();
        for(String tu:tuMang)
        {
            if(bangDem.containsKey(tu))
            {
                bangDem.put(tu,bangDem.get(tu)+1);
            }
            else
            {
                bangDem.put(tu,1);
            }
        }
        for(Map.Entry<String, Integer>entry:bangDem.entrySet())
            System.out.println("Tu "+entry.getKey()+" xuat hien"+entry.getValue()+" lan");
    }
}
