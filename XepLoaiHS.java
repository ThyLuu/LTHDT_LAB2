package lab2;

import java.util.Scanner;
public class XepLoaiHS {
    public static void main(String[] args) {
       Scanner nhap = new Scanner(System.in);
       float diem;
       System.out.print("Nhap so diem: ");
       diem = nhap.nextFloat();
       
       if(diem<5){
           System.out.println("Loai kem");
       }
       else if(diem>=5&&diem<7){
           System.out.println("Loai trung binh");
       }
       else if(diem>=7&&diem<8){
           System.out.println("Loai kha");
       }
       else{
           System.out.println("Loai gioi");
       }
    }
    
}
