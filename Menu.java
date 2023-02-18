package lab2;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        // Menu
        System.out.println("Hay chon 1/2/3/4");
        System.out.println("==========");
        System.out.println("1. Giai PT Bac 1");
        System.out.println("2. Giai PT Bac 2");
        System.out.println("3. Tinh tien dien");
        System.out.println("4. Ket thuc");
        System.out.println("==========");
        
        int chon;
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap lua chon: ");
        chon = nhap.nextInt();
        
        switch(chon){
            case 1:
                System.out.println("Ban da chon 1");
                giaiPTBac1();
                System.out.println("");
                break;
            case 2:
                System.out.println("Ban da chon 2");
                giaiPTBac2();
                System.out.println("");
                break;
            case 3:
                System.out.println("Ban da chon 3");
                TinhTienDien();
                System.out.println("");
                break;
            case 4:
                System.out.println("Ban da chon 4");
                System.exit(0);
                break;
            /*default:
                break;*/   
        }
    } 
    
    public static void giaiPTBac1(){  
        //Giải PT bậc 1: ax + b = 0
        int a,b;
        float x;
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap a: ");
	a = nhap.nextInt();
	System.out.print("Nhap b: ");
	b = nhap.nextInt();
        
        if(a==0){
            if(b==0){
                System.out.println("PT vo so nghiem");
            }
            else{
                System.out.println("PT vo nghiem");
            }
        }
        else{
            x = -b/a;
            System.out.println("Nghiem x: "+x);
        }
}        
        
    public static void giaiPTBac2(){
        //Giải PT bậc 2: a*x^2 + bx + c = 0
        float a, b, c;
        float x1,x2,x,delta;
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap a: ");
        a = nhap.nextFloat();
        System.out.print("Nhap b: ");
        b = nhap.nextFloat();
        System.out.print("Nhap c: ");
        c = nhap.nextFloat();
        
       delta = b*b - 4*a*c;
       
       if(a==0){
           if(b==0){
               System.out.println("PT vo nghiem");
           }
           else{
               x = -c/b;
               System.out.println("PT co 1 nghiem: "+x);
           }
       }
       else{
           if(delta<0){
               System.out.println("PT vo nghiem");
           }
           else if(delta==0){
               x1 = -b / (2 * a);
               System.out.println("PT ci nghiem kep: "+x1);
           }
           else{
           x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
           x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
           System.out.println("PT co 2 nghiem phan biet");
           System.out.println("x1=" + x1);
           System.out.println("x2=" + x2);
       }
           return;
       }
}        

    public static void TinhTienDien(){ 
    // Tính tiền điện
        float soDien;
        float soTien;
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap so dien: ");
        soDien = nhap.nextFloat();
        
        if(soDien<=50){
            soTien = soDien * 1000;
            System.out.print("So tien phai tra: "+soTien);
        }
        else{
            soTien = 50*1000 + (soDien - 50)*1200;
            System.out.print("So tien phai tra: "+soTien);
        }
}
}