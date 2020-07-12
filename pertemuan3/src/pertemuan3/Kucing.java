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
public class Kucing {
    String Nm_Kcng;
    int posisi;
    
     void langkah(int x){
        posisi +=x;
    }
    
    public void tampil(){
        System.out.println("\nNama Kucing : "+Nm_Kcng);
        System.out.println("Posisi      : "+posisi+"\n");
    }
}
