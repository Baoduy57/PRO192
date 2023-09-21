/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cacpheptoan;

import java.util.Scanner;

/**
 *
 * @author FPT SHOP
 */
public class CacPhepToan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        // Nhap 2 so tu ban phim in ra ket qua tinh cong, tru, nhan, chia
        System.out.println("Nhap vao so thu nhat:  ");
        int firstNumber = input.nextInt();
        System.out.println("Nhap vao so thu hai: ");
        int secondNumber = input.nextInt();
        
        int Sum = firstNumber + secondNumber;        
        System.out.println(firstNumber + "+" + secondNumber + "=" + Sum);
        int Tru = firstNumber - secondNumber;
        System.out.println(firstNumber + "-" + secondNumber + "=" + Tru);
        int Nhan = firstNumber * secondNumber;
        System.out.println(firstNumber + "*" + secondNumber + "=" + Nhan);
        int Chia = firstNumber / secondNumber;
        System.out.println(firstNumber + "/" + secondNumber + "=" + Chia);
    }
    
}
