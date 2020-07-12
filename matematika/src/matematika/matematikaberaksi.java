/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematika;

/**
 *
 * @author asus
 */
import java.util.Scanner;

public class matematikaberaksi {
    public static void main(String[] args) {
        
        Matematika matku=new Matematika();
        Scanner sc=new Scanner(System.in);
        
        int a,b;
        System.out.print("input a = ");
        a=sc.nextInt();
        System.out.print("input b = ");
        b=sc.nextInt();
        matku.tambah(a, b);
        System.out.println(a+"+"+b+"="+matku.c);
        System.out.print("input a = ");
        a=sc.nextInt();
        System.out.print("input b = ");
        b=sc.nextInt();
        matku.kurang(a, b);
        System.out.println(a+"-"+b+"="+matku.c);
        System.out.print("input a = ");
        a=sc.nextInt();
        System.out.print("input b = ");
        b=sc.nextInt();
        matku.kali(a, b);
        System.out.println(a+"*"+b+"="+matku.c);
        System.out.print("input a = ");
        a=sc.nextInt();
        System.out.print("input b = ");
        b=sc.nextInt();
        matku.bagi(a, b);
        System.out.println(a+"/"+b+"="+matku.c);
            
    }
    
}
