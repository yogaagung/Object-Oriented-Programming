/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan1;

/**
 *
 * @author E
 */
import java.util.Scanner;
public class Pertemuan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Datang");
        // cara cepat SOUT lgsung TAB
        System.out.println(10);
        
        int nilai1=15;
        int nilai2=20;
        int hasil;
        Double phi=3.14;
        int jari=10;
        Double hasil2;

        String nama="Yoga";
        String nim="A11.2015.08964";
        String alamat="kedondong";
        String telpon="0878329****";
        Double ipk=3.45; // Double jika ada titik (.)
        System.out.println("Nilainya adalah "+nilai1+" cm"); //(+) sbg penghubung
        System.out.println("Nama "+nama);
        System.out.println("NIM "+nim);
        System.out.println("IPK "+ipk);
        System.out.println("Alamat "+alamat);
        System.out.println("Telpon "+telpon);
        hasil=nilai1 + nilai2;
        System.out.println(nilai1+ " + " +nilai2+ " = " +hasil);
        hasil2=(phi*jari*jari);
        System.out.println("Luas = " +hasil2);
        System.out.println("Luas = " +(phi*jari*jari));
        ///////////////////////////////////////////////////////////////////////
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Nama = ");
        String nama1=sc.nextLine();
        System.out.println("Input Nilai = ");
        int nilai3=sc.nextInt();
        System.out.println("Input IPK = ");
        Double ipk1=sc.nextDouble();
        
        System.out.println("Nama " +nama1);
        System.out.println("Nilai" +nilai3);
        System.out.println("IPK " +ipk1);
        ///////////////////////////////////////////////////////////////////////
        System.out.println("Input UTS = ");
        Double UTS=sc.nextDouble();
        System.out.println("Input UAS = ");
        Double UAS=sc.nextDouble();
        System.out.println("TUGAS = ");
        Double Tugas=sc.nextDouble();
        System.out.println("Nama = ");
        String nama2=sc.nextLine();
        
        System.out.println("Nama "+nama2);
        System.out.println("UAS "+UAS);
        System.out.println("UTS "+UTS);
        System.out.println("Tugas "+Tugas);
        System.out.println("Rata "+(UAS+UTS+Tugas)/3);
    }
    
}
