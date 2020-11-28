/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan61;

import m10119002.pbo.latihan61.target.Bola;
import m10119002.pbo.latihan61.target.Kerucut;
import m10119002.pbo.latihan61.target.Tabung;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Program : Program ini berisi Hitung Bangun Ruang
 * main class
 * 
 */
public class Program {
    public static void main(String[] args) {
        System.out.println("Jari-jari dari sebuah bola basket adalah 7 cm");
        Bola bola = new Bola();
        bola.setJari(7);
        bola.setVolume(bola.hitungVolume());
        bola.displayHasil(false);
        
        System.out.println();
        
        System.out.println("Sebuah tabung memiliki jari-jari berukuran 10 cm. Jika tingginya 21 cm,");
        Tabung tabung = new Tabung();
        tabung.setJari(10);
        tabung.setTinggi(21);
        tabung.setVolume(tabung.hitungVolume());
        tabung.displayHasil(false);
        
        System.out.println();
        
        System.out.println("Diketahui tinggi sebuah kerucut 9 cm. Jika jari-jarinya 14 cm,");
        Kerucut kerucut = new Kerucut();
        kerucut.setTinggi(9);
        kerucut.setJari(14);
        kerucut.setVolume(kerucut.hitungVolume());
        kerucut.displayHasil(true);
    }
}
