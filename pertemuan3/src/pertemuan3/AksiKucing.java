/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;

/**
 *
 * @author E
 */

import java.util.Scanner;

public class AksiKucing {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        Kucing Kucingku = new Kucing();
        
        System.out.print("Input Nama Kucing     : ");
        Kucingku.Nm_Kcng = get.nextLine();
        System.out.print("Input Posisis Kucing  : ");
        Kucingku.posisi = get.nextInt();
        
        Kucingku.tampil();
        
        System.out.print("Input Langkah Kucing    :");
        Kucingku.langkah(get.nextInt());
        Kucingku.tampil();
        
        System.out.print("Input Langkah Kucing    :");
        Kucingku.langkah(get.nextInt());
        Kucingku.tampil();
    }
}
