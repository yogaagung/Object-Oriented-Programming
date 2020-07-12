/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;

/**
 *
 * @author E
 */
import java.util.Scanner;
public class AksiKapal {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        Kapal Battle = new Kapal();
               
        System.out.print("Input Nama Kapal  : ");
        Battle.Nm = get.nextLine();
        System.out.print("Input Max Ammo    : ");
        Battle.Mx_Ammo= get.nextInt();
        
        Battle.Reload();
        
        String comand = get.nextLine();
        while(comand!="x"){
            switch(comand){
                case "t" : 
                    Battle.Tembak();
                    break;
                case "y" :
                    System.out.print("Input Tembakan : ");
                    Battle.TembakB(get.nextInt());
                    break;
                case "r" :
                    Battle.Reload();
            }
            Battle.Status();
            comand = get.nextLine();
        }
    }
}
