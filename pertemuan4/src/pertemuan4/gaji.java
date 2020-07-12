
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

/**
 *
 * @author E
 */
import java.util.Scanner;
public class gaji {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("nama = ");String namanya=scan.nextLine();
        System.out.println("NPP = ");String NPPNYA= scan.nextLine();
        System.out.println("input golongan = ");int golongan = scan.nextInt();
        System.out.println("jml anak =");int anak=scan.nextInt();
        
        karyawan baru = new karyawan(namanya,NPPNYA);
        baru.gajinya(golongan, anak);
    }
    
}
