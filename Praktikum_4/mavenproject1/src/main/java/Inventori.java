/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Inventori {
    //Barang[] barangs;
    private Barang[] barangs;
    private int[] stok;
    void initBarang() {
        barangs = new Barang[2];
        barangs[0] = new Barang("001", "Baju", 10); 
        barangs[1] = new Barang("002", "Celana", 20);
        stok = new int[2];
        stok[0] = barangs[0].getstok();
    }
    void showBarang() {
        System.out.println(barangs[0].nama_barang + "(" + barangs[0].getstok() + ")"); 
        System.out.println(barangs[1].nama_barang + "(" + barangs[1].getstok() + ")");
    }
    
    void pengadaan() {
        initBarang();
//        barangs[0].stok += 20;
//        barangs[0].stok -= 30; //Bisa juga dikurangi dong? 
//        barangs[0].stok *= 30; //dikali juga bisa dong??
        barangs[0].addstok(20);
        
        showBarang();
    }
    
    public static void main(String[] args) { 
        Inventori beli = new Inventori(); 
        beli.pengadaan();
    }
    
}
