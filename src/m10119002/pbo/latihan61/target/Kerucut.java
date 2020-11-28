/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan61.target;

import m10119002.pbo.latihan61.target.references.BangunRuang;
import m10119002.pbo.latihan61.target.references.LuasLingkaran;
import m10119002.pbo.latihan61.target.references.VolumeBangunRuang;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Class : Class untuk Kerucut
 * other class
 * 
 */
public class Kerucut extends BangunRuang implements VolumeBangunRuang, LuasLingkaran {
    private int jari;
    private int tinggi;
    
    public void setJari(int jari) {this.jari = jari;}
    public int getJari() {return this.jari;}
    public void setTinggi(int tinggi) {this.tinggi = tinggi;}
    public int getTinggi() {return this.tinggi;}
    
    @Override
    public double hitungLuasLingkaran() {
        double tJari = (double)this.jari;
        return 22 * (tJari*tJari) / 7;
    }

    @Override
    public double hitungVolume() {
        double tLingkaran = hitungLuasLingkaran();
        return 1 * (tLingkaran*this.tinggi) / 3;
    }
}
