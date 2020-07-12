/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mataksi;

/**
 *
 * @author asus
 */
import java.util.Scanner;
public class Mataksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        matcanggihsekali ma=new matcanggihsekali();
        
        System.out.println("Input a = ");
        int a=sc.nextInt();
        System.out.println("Input b = ");
        int b=sc.nextInt();
        System.out.println("Input c = ");
        int c=sc.nextInt();
        
        System.out.println(a+ "+" +b+ " Hasil "+ma.tambah(a, b));
        System.out.println(a+ "*" +b+ " Hasil "+ma.kali(a, b));
        System.out.println(a+ "%" +b+ " Hasil "+ma.modulo(a, b));
        System.out.println(a+ "+" +b+ "+" +c+ "Hasil "+ma.tambahtiga(a, b, c));
        
    }
    
}
