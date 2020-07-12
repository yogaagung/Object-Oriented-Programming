/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

/**
 *
 * @author E
 */
public class karyawan {
    String nama,NPP;
    int gajipokok=2000000;
    int tunjangan3=1000000;
    int tunjangan2=2000000;
    int tunjangan1=3000000;
    
    
    
    public karyawan(String nama,String NPP){
        this.nama=nama;
        this.NPP=NPP;
    }
    void info(){
        System.out.println("Nama : " +nama);
	  	System.out.println("NPP: " +NPP);

    }
    void gajinya(int golongan,int jmlanak){
        if(golongan==3){
            
            gajipokok=gajipokok+tunjangan3;
            if(jmlanak==1){
                gajipokok=gajipokok+100000;
                System.out.println("total gaji= "+gajipokok);
            }
            if(jmlanak>=2){
                gajipokok=gajipokok+200000;
                System.out.println("total gaji= "+gajipokok);
            }
            if(jmlanak<=0){
                gajipokok=gajipokok;
                System.out.println("total gaji= "+gajipokok);
            }
        }
        if(golongan==2){
            
            gajipokok=gajipokok+tunjangan3;
            if(jmlanak==1){
                gajipokok=gajipokok+100000;
                System.out.println("total gaji= "+gajipokok);
            }
            if(jmlanak>=2){
                gajipokok=gajipokok+200000;
                System.out.println("total gaji= "+gajipokok);
            }
            if(jmlanak<=0){
                gajipokok=gajipokok;
                System.out.println("total gaji= "+gajipokok);
            }
        }
        if(golongan==1){
            
            gajipokok=gajipokok+tunjangan3;
            if(jmlanak==1){
                gajipokok=gajipokok+100000;
                System.out.println("total gaji= "+gajipokok);
            }
            if(jmlanak>=2){
                gajipokok=gajipokok+200000;
                System.out.println("total gaji= "+gajipokok);
            }
            if(jmlanak<=0){
                gajipokok=gajipokok;
                System.out.println("total gaji= "+gajipokok);
            }
        }
        if(golongan>3||golongan<=0){
            System.out.println("input golongan dari 1-3");
        }
    }
    
    
}
