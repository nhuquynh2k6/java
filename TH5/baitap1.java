package TH5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class baitap1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] a=new int[n];
        System.out.println("Nhap cac phan tu cua mang: ");
        for(int i=0;i<n;i++)
        {
            System.out.print("a["+i+"]=");
            a[i]=scanner.nextInt();
        }
        Integer[] b=new Integer[n];
        for(int i=0;i<n;i++)
        {
            b[i]=a[i];
        }
        Arrays.sort(b,Collections.reverseOrder());
        System.out.println("Mang sau khi sap xep giam dan la: ");
        for(int i=0;i<n;i++)
        {
            System.out.println(b[i]+" ");
        }
        scanner.close();
    }
}