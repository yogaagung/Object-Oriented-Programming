/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pert5;

/**
 *
 * @author E
 */
import java.util.Scanner;

public class Pert5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Input nama = ");
        String nm=sc.nextLine();
        System.out.println("Input jenis = ");
        String jns=sc.nextLine();
        System.out.println("Input berapa kali ? ");
        int lo=sc.nextInt();
        kendaraan ke=new kendaraan(nm,jns);
        
        for(int a=0;a<lo;a++){
        System.out.println("Input kondisi mesin = ");
        int pil=sc.nextInt();
        ke.nyala(pil);
        System.out.println("input maju = ");
        int a=sc.nextInt();
        ke.depan();
        System.out.println("input belakang = ");
        int b=sc.nextInt();
        ke.blkang();
        System.out.println("input kanan = ");
        int c=sc.nextInt();
        ke.kanan();
        System.out.println("input kiri = ");
        int d=sc.nextInt();
        ke.kiri();
        } 
    }
}
