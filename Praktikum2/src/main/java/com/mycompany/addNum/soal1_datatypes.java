/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.addNum;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class soal1_datatypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char userInput;
        do {
            System.out.print("Masukan angka: ");
            long x = sc.nextLong();
            if (x >= Byte.MIN_VALUE && x <= Long.MAX_VALUE){
                System.out.println(x + " can be fitted in:" + "");
            }
            if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) {
                System.out.println("* byte"+"");
            } 
            if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
                System.out.println( "* short" + "");
            } 
            if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
                System.out.println("* int"+"");
            } 
            if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) {
                System.out.println("* long" + "");
            } 
            else if(x > Long.MAX_VALUE || x < Byte.MIN_VALUE ) {
                System.out.println(x + " can't be fitted anywhere");
            }
            
            System.out.print("Apakah ingin input lagi? (y/n): ");
            userInput = sc.next().charAt(0);
        } while (userInput != 'n' && userInput != 'N');
        
        sc.close();
    }
}
