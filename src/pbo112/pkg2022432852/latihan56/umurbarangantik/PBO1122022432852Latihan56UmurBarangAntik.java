/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo112.pkg2022432852.latihan56.umurbarangantik;

/**
 *
 * @author Mini Pc
 * Nama : DaruL Fitahul Huda 
 * NIM : 2022432852 
 * Kode Kelas :FS112B (PBO112B) 
 * Deksripsi Program : Menampilkan umur dari barang antik radio

 */
public class PBO1122022432852Latihan56UmurBarangAntik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Radio r = new Radio(234);
        r.setName("Radio AM");
        System.out.println("Nama barang Antik : " + r.getName());
        r.tampilUmur();
    }
    
}
