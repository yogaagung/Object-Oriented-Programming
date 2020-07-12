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
public class Kapal {
    String Nm;
    int Mx_Ammo, Ammo;
    
    void Tembak(){
        if(Ammo == 0)
            System.out.println("Ammo Empty !!");
        else Ammo--;
    }
    
    void TembakB(int x){
        if(Ammo < x)
            System.out.println("Ammo Not Enough !!");
        else Ammo-=x;
    }
    
    void Reload(){
        Ammo = Mx_Ammo;
        System.out.println("Ammo Reloaded !!");
    }
    
    void Status(){
        System.out.println("\nNama Kapal  : "+Nm);
        System.out.println("Max Ammo    : "+Mx_Ammo);
        System.out.println("Ammo Now    : "+Ammo+"\n");
    }
    
}
