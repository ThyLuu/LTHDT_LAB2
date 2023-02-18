package xoaphantu;

import java.util.Scanner;
public class XoaPhanTu {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        int x, n, i, xoa;
        int dem = 0;
        System.out.print("Nhap so luong phan tu: ");
        n = nhap.nextInt();
        int a[] = new int[n];
        
        System.out.println("Nhap cac phan tu: ");
        for (i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu a[" + i + "]: ");
            a[i] = nhap.nextInt();
        }
        
        System.out.print("Phan tu can xoa: ");
        xoa = nhap.nextInt();
        for (i = 0; i < n; i++) {
            if (a[i] == xoa) {
                for (int j = i; j < (n - 1); j++) {
                a[j] = a[j + 1];
                }
                dem++;
                break;
            }
        }
        
        if (dem == 0) {
            System.out.print("Khong hop le, hay nhap lai");
        }   
        else {
            System.out.print("Da xoa thanh cong");
            System.out.println("Sau khi xoa: ");
            for (i = 0; i < (n - 1); i++) {
                System.out.print(a[i] + " ");
            }
        }    
    }
}