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
public class manusia {
    String Nama,NIK,Jenis_kelamin;
    int umur;
    
    Scanner scan = new Scanner(System.in);
    public void identitas(){
        System.out.println("input nama : ");Nama = scan.nextLine();
        System.out.println("input NIK : ");NIK = scan.nextLine();
        System.out.println("input Jenis Kelamin : ");Jenis_kelamin = scan.nextLine();
        System.out.println("input umur anda :");umur=scan.nextInt();
        
    }
    public void info(){
        System.out.println("Nama anda : "+Nama);
        System.out.println("NIK anda : "+NIK);
        System.out.println("Jenis Kelamin anda : "+Jenis_kelamin);
        System.out.println("umur anda : "+umur);
        if(umur==0||umur<=17){
            System.out.println("Belum cukup umur :D");
        }
       
        
    }
}
