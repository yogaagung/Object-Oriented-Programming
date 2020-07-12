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
public class kapalAksi {
    public static void main(String[] args) {
        kapal kpl=new kapal();
        Scanner sc=new Scanner(System.in);
        System.out.println("Input Nama Kapal    = "); kpl.nama_kpl= sc.nextLine();
        System.out.println("Input Warna Kapal   = "); kpl.warna_kpl= sc.nextLine();
        System.out.println("Jumlah Orang        = "); kpl.orang= sc.nextInt();
        System.out.println("Jumlah Ruang        = "); kpl.ruang= sc.nextInt();
        kpl.tambahorang();
        kpl.tambahoruang();
        kpl.tampil();
    }
}
