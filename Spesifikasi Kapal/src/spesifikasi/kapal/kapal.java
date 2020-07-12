/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spesifikasi.kapal;

/**
 *
 * @author E
 */
import java.util.Scanner;
public class kapal {
    String nama_kpl;
    String warna_kpl;
    int ruang;
    int orang;
    int tambahorg;
    int tambahrng;
    Scanner sc = new Scanner(System.in);
    public void tambahorang (){
        System.out.println("Tambah Orang        = "); tambahorg=sc.nextInt();
    }
    
    public void tambahoruang (){
        System.out.println("Tambah Ruang        = "); tambahrng=sc.nextInt();
    }
    
    public void tampil (){
        System.out.println("Nama Kapal      = "+nama_kpl);
        System.out.println("Warna Kapal     = "+warna_kpl);
        System.out.println("Jumlah Orang    = "+(orang+tambahorg));
        System.out.println("Jumlah Ruang    = "+(ruang+tambahrng));
    }
}
