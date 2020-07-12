/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptopaksi;

/**
 *
 * @author asus
 */
import java.util.Scanner;

public class Laptopaksi {

    /**
     * @param args the command line arguments
     */                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        laptop laptopku=new laptop();
        
        System.out.print("Input nama prosessor = ");
        laptopku.nama=sc.nextLine();
        System.out.print("Input tahun          = ");
        laptopku.thnbuat=sc.nextInt();
        laptopku.info();
    }
    
}
