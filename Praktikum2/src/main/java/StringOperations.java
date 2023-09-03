
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca dua string dari input
        String A = scanner.next();
        String B = scanner.next();

        // Langkah 1: Menghitung jumlah panjang A dan B
        int totalLength = A.length() + B.length();
        System.out.println(totalLength);

        // Langkah 2: Memeriksa apakah A leksikografis lebih besar dari B
        String Result;
        if (A.compareTo(B)>0){
            Result = "Yes";
        }
        else{
            Result = "NO";
        }
        System.out.println(Result);
//        String result = A.compareTo(B) > 0 ? "Yes" : "No";
//        System.out.println(result);

        // Langkah 3: Kapitalkan huruf pertama dalam A dan B, lalu cetak keduanya dipisahkan oleh spasi
        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(capitalizedA + " " + capitalizedB);

        scanner.close();
    }
}
