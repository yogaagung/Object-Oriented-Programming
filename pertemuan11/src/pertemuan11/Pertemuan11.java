/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan11;

/**
 *
 * @author D2J
 */
public class Pertemuan11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ruang rg=new ruang(2);
        rg.info();
        ruang rng=new ruang();
        rng.info();
        
        daftarumum du=new daftarumum(25000);
        du.info();
        daftarumum dd=new daftarumum();
        dd.info();
        
        daftarkhusus da=new daftarkhusus(50000);
        
        
    }
    
}
