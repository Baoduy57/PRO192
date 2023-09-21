/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tinhdiem;

import java.util.Scanner;

/**
 *
 * @author FPT SHOP
 */
public class TinhDiem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap diem chuyen can: ");
        int a = input.nextInt();
        System.out.println("Nhap diem giua ki: ");
        int b = input.nextInt();
        System.out.println("Nhap diem cuoi ki: ");
        int c = input.nextInt();
        
        int sum = a+b+c;
        System.out.println("Diem hoc phan: " + sum);
    }
    
}
