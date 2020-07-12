/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptopaksi;

/**
 *
 * @author asus
 */
public class laptop {
    String nama;
    int thnbuat;
public void laptopaksi(String nama, int thnbuat){
    this.nama=nama;
    this.thnbuat=thnbuat;
}
public void info(){
    System.out.println("============================");
    System.out.println("Nama Prossesor = "+nama);
    System.out.println("Tahun Buat     = "+thnbuat);
} 
}
