package lab2;

import java.util.Scanner;
public class DocChuSo {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        int n, donvi, hangchuc, hangtram;
        System.out.print("Nhap 1 so nguyen co 3 chu so: ");
        n = nhap.nextInt();
        
        donvi = n % 10;
        hangchuc = (n/10)%10;
        hangtram = n / 100;
        
        if(n<100 || n>999){
            System.out.println("Khong hop le, hay nhap lai");
        }
        
        switch(hangtram){
            case 1:
                System.out.print("Mot tram ");
                break;
            case 2:   
                System.out.print("Hai tram ");
                break;
            case 3:
                System.out.print("Ba tram ");
                break;
            case 4:
                System.out.print("Bon tram ");
                break;
            case 5:
                System.out.print("Nam tram ");
                break;
            case 6:
                System.out.print("Sau tram ");
                break;
            case 7:
                System.out.print("Bay tram ");
                break;  
            case 8:
                System.out.print("Tam tram ");
                break;
            case 9:
                System.out.print("Chin tram ");
                break;    
        }
        
        switch(hangchuc){
            case 1:
                System.out.print("Muoi ");
                break;
            case 2:   
                System.out.print("Hai muoi ");
                break;
            case 3:
                System.out.print("Ba muoi ");
                break;
            case 4:
                System.out.print("Bon muoi ");
                break;
            case 5:
                System.out.print("Nam muoi ");
                break;
            case 6:
                System.out.print("Sau muoi ");
                break;
            case 7:
                System.out.print("Bay muoi ");
                break;  
            case 8:
                System.out.print("Tam muoi ");
                break;
            case 9:
                System.out.print("Chin muoi ");
                break;    
        }
        
        switch(donvi){
            case 1:
                System.out.print("Mot ");
                break;
            case 2:
                System.out.print("Hai ");
                break;
            case 3:
                System.out.print("Ba ");
                break;
            case 4:
                System.out.print("Bon ");
                break;
            case 5:
                System.out.print("Nam "); 
                break;
            case 6:
                System.out.print("Sau ");
                break;
            case 7:
                System.out.print("Bay ");
                break;
            case 8:
                System.out.print("Tam ");   
                break;
            case 9:
                System.out.print("Chin "); 
                break;
        }
    }
    
}

