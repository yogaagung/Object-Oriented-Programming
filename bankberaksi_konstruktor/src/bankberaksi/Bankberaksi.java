/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankberaksi;

/**
 *
 * @author asus
 */
import java.util.Scanner;
public class Bankberaksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        bank banku=new bank(100000);
       
        System.out.println("Selamat Datang ");
        System.out.print("Saldo saat ini = Rp. "+banku.getSaldo());
        System.out.print("\nSimpan uang    = Rp. ");
        int a=sc.nextInt();
        banku.simpanUang(a);
        System.out.print("Saldo saat ini = Rp. "+banku.getSaldo());
        System.out.print("\nAmbil uang     = Rp. ");
        int b=sc.nextInt();
        banku.ambilUang(b);
        System.out.println("Saldo saat ini = Rp. "+banku.getSaldo());
        
    }
    
}
