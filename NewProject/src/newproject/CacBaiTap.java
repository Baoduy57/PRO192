/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package newproject;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author FPT SHOP
 */
public class CacBaiTap {

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
        
        // Nhap ho va ten in ra ten day du
        System.out.println("Nhap ten: ");
        String name = input.next();
        
        // Nhap diem chuyen can, giua ki, cuoi ki in ra diem hoc phan
        System.out.println("Nhap diem chuyen can: ");
        int a = input.nextInt();
        System.out.println("Nhap diem giua ki: ");
        int b = input.nextInt();
        System.out.println("Nhap diem cuoi ki: ");
        int c = input.nextInt();
        
        int sum = a+b+c;
        System.out.println("Diem hoc phan: " + sum);
        
        // nhap ho ten kiem tra co ton tai trong danh sach khoi tao hay khong neu co thi in Yes nguoc lai in No
        //ArrayList < TenClass > tenCuaList = new ArrayList<> ();
        ArrayList<String> List = new ArrayList<> ();
        List.add("Nguyen Dang Nhan");
        List.add("Thai Bao Duy");
        List.add("Truong Chau Dien");
        List.add("Huynh Tan Luc");
        
        System.out.println("Nhap chuoi can kiem tra: ");
        String ListName = input.next();
        
        if(List.contains(ListName)){
            System.out.println("Yes");
        }
        else{
            
            System.out.println("No");
        }
        
    }
    
}
