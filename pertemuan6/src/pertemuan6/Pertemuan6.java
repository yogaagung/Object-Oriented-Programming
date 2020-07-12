/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

/**
 *
 * @author E
 */
import java.util.Scanner;
public class Pertemuan6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ///manusia baru = new manusia();
        mahasiswa baru2 = new mahasiswa();
        double balik2;
        Scanner scan = new Scanner(System.in);
        
        baru2.identitas();
        System.out.println("input NIM : ");baru2.NIM=scan.nextLine();
        System.out.println("input Fakultas : ");baru2.fak=scan.nextLine();
        System.out.println("input Jurusan : ");baru2.jurusan=scan.nextLine();
        
        System.out.println("input Nilai tugas 1 : ");double tugas1=scan.nextDouble();
         System.out.println("input Nilai tugas 2 : ");double tugas2=scan.nextDouble();
          System.out.println("input Nilai tugas 3 : ");double tugas3=scan.nextDouble();
           System.out.println("input Nilai tugas uts : ");double uts=scan.nextDouble();
            System.out.println("input Nilai tugas uas : ");double uas=scan.nextDouble();
            
        
        baru2.info();
        System.out.println("NIM : "+baru2.NIM);
        System.out.println("fAKULTAS : "+baru2.fak);
        System.out.println("jURUSAN : "+baru2.jurusan);
        
        baru2.nilaimahasiswa(tugas1, tugas2, tugas3, uts, uas);
        ///baru2.balik();
        balik2 = baru2.balik();
        System.out.println("Nilai akhir : "+balik2);
        
    }
    
}
