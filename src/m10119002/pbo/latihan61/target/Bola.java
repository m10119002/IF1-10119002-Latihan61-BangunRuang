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
 * Deskripsi Class : Class untuk Bola
 * other class
 * 
 */
public class Bola extends BangunRuang implements VolumeBangunRuang, LuasLingkaran {
    private int jari;
    
    public void setJari(int jari) {this.jari = jari;}
    public int getJari() {return this.jari;}
    
    @Override
    public double hitungLuasLingkaran() {
        double tJari = (double)this.jari;
        return 22 * (tJari*tJari*tJari) / 7;
    }

    @Override
    public double hitungVolume() {
        double tLingkaran = hitungLuasLingkaran();
        return 4 * tLingkaran / 3;
    }
}
