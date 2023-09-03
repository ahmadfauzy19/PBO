/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.addNum;

import java.io.IOException;

/**
 *
 * @author ASUS
 */
public class Praktikum2 {

    public int addNum(int NumA, int NumB) {
        return(NumA + NumB);
    }
    
    public static void main(String[] args)throws IOException {
        Praktikum2 obj = new Praktikum2();
        int sum = obj.addNum(10, 20);
        
        System.out.println("sum of 20 and 10 is :" + sum);
    }
}
