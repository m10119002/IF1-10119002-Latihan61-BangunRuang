/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan61.target.references;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Class : Class untuk Bangun Ruang
 * other abstract class
 * 
 */
public abstract class BangunRuang {
    private double volume;
    
    public void setVolume(double volume) {this.volume = volume;}
    public Double getVolume() {return this.volume;}
    private String getFormatAngka(double bilangan, boolean isFormatRibuan) {
        String output;
        // contoh: test = 19835800.3681 | splitTest[0] = 19835800 | splitTest[1] = 3681
        String test = Double.toString(bilangan);
        String[] splitTest = test.split("\\.");
        // contoh: splitTest[0] = 19835800 | len = 8 | sisa = 2 | x = 2
        int len = splitTest[0].length();
        int sisa = len % 3;
        int x = 0;
        if(len>3) x = (len-sisa) / 3;
        // contoh: temp[0] = 19. | temp[1] = 835800 | temp[2] = 835.800 | end = .3
        String[] temp = new String[3];
        if(len>3 && sisa>0) temp[0] = splitTest[0].substring(0, sisa);
        else temp[0] = "";
        if(isFormatRibuan && !temp[0].equals("")) temp[0] = temp[0].concat(".");
        if(len>3) temp[1] = splitTest[0].substring(sisa, len);
        else temp[1] = splitTest[0];
        String end;
        // contoh: true = 5.800,3681 | false = 5800.3681
        if(isFormatRibuan) {
            end = ",".concat(splitTest[1]);
        } else {
            end = ".".concat(splitTest[1]);
            x = -1;
        }
        if(end.length()>2) end = end.substring(0, 2); // ,3681 => ,3

        switch(x) {
            case 1: // ribu
                temp[2] = temp[1];
                break;
            case 2: // juta
                temp[2] = temp[1].substring(0, 3).
                        concat(".").
                        concat(temp[1].substring(3, 6));
                break;
            case 3: // milyar
                temp[2] = temp[1].substring(0, 3).
                        concat(".").
                        concat(temp[1].substring(3, 6)).
                        concat(".").
                        concat(temp[1].substring(6, 9));
                break;
            case 4: // triliun
                temp[2] = temp[1].substring(0, 3).
                        concat(".").
                        concat(temp[1].substring(3, 6)).
                        concat(".").
                        concat(temp[1].substring(6, 9)).
                        concat(".").
                        concat(temp[1].substring(9, 12));
                break;
            default:
                temp[2] = temp[1];
                break;
        }
        if (end.equals(".0") || end.equals(",0")) {
            end = "";
        }
        output = temp[0].concat(temp[2]).concat(end);
        return output;
    }
    public void displayHasil(boolean isFormatRibuan) {
        String vol = getFormatAngka(this.volume, isFormatRibuan);
        System.out.println("Hasil : V = ".
                concat(vol).
                concat(" cm^3"));
    }
}
