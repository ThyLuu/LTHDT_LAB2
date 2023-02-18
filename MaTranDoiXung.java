package lab2;

import java.util.Scanner;
public class MaTranDoiXung {
    public static void main(String[] args) {
        //Ma trận đối xứng ( ma trận vuông )
        // dòng = cột
        Scanner nhap = new Scanner(System.in);
        int n;
        int ktra = 0;
        int i,j;
        System.out.print("Nhap n: ");
        n = nhap.nextInt();
        
        if(n<=1){
            System.out.println("Khong hop le, hay nhap lai");
        }
        
        int[][] a = new int[n][n];
        System.out.println("Nhap cac dinh cho ma tran: ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print("A[" + i + "," + j + "] = ");
                a[i][j] = nhap.nextInt();
            }
        }
        
        System.out.println("Ma tran:");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println("\t");
         }
        
        for (i = 0; i < n; i++) {
            for (j = 0; j < i; j++) {
                if (a[i][j] == a[j][i]) {
                    ktra = 1;
                } 
                else {
                    ktra = 0;
                }
            }
        }
        
        if (ktra == 1) {
            System.out.println("Ma tran đoi xung");
        } 
        else {
            System.out.println("Ma tran khong đoi xung");
        }
    }
}

