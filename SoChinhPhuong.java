/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

import java.util.Scanner;
public class SoChinhPhuong {
    public static void main(String[] args){
    //Kiểm tra số chính phương
    Scanner nhap = new Scanner(System.in);
    int n, n_can_nguyen;
    System.out.print("Nhap n: ");
    n = nhap.nextInt();
    n_can_nguyen = (int)Math.sqrt(n);
    if(n_can_nguyen * n_can_nguyen == n){
        System.out.print(n+" la so chinh phuong");
        System.out.println("\t");
    }
    else{
        System.out.print(n+" khong la so chinh phuong");
        System.out.println("\t");
    }
}
}
