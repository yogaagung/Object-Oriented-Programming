/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kapal;

/**
 *
 * @author asus
 */

import java.util.Scanner;
public class Kapal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    kapalaksi kapalku=new kapalaksi();
    Scanner sc=new Scanner(System.in);
    int b;
        System.out.println("Input peluru = ");
        kapalku.maks=sc.nextInt();
        kapalku.peluru=kapalku.maks;
        System.out.println("Peluru = "+kapalku.peluru);
        
        kapalku.tembak();
        System.out.println("Peluru sekarang = "+kapalku.peluru);
        
        kapalku.tembakbnyk(12);
        System.out.println("Peluru sekarang = "+kapalku.peluru);
        
        kapalku.reload();
        System.out.println("Peluru sekarang = "+kapalku.peluru);
    }
    
}
