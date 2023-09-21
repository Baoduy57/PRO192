/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hovaten;

import java.util.Scanner;

/**
 *
 * @author FPT SHOP
 */
public class HoVaTen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ho va ten: ");
        String name = input.nextLine();
        System.out.println("Ten day du la: " + name);
    }
    
}
