/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Barang {
    String kode_barang;
    String nama_barang;
    private int stok;
    
    public Barang(String kode, String nama, int stk) { 
        kode_barang = kode;
        nama_barang = nama; 
        this.stok = stk;
    }
    
     public int getstok() {
        return stok;
    }
     
     public int addstok(int a) {
        return stok += a;
    }
     
     
    
}
