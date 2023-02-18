package lab2;

import java.util.Scanner;
public class GiaiThua {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        int n;
        System.out.print("Nhap n: ");
        n = nhap.nextInt();
        
        int i=1;
        long giai_thua = 1;
        while(i<=n){
            giai_thua = giai_thua * i;
            i++;
        }
        System.out.println("Giai thua "+ n +"! = " + giai_thua);
    }
    
}
