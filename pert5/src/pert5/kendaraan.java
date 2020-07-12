/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pert5;

/**
 *
 * @author E
 */
public class kendaraan {
    private String nama,
                   jenis;
            int kondisi,
                 x,y;
   
    
    public kendaraan(String nama, String jenis){
        this.nama=nama;
        this.jenis=jenis;
        System.out.println("Nama kendaraan = "+nama);
        System.out.println("Jenis kendaraan = "+jenis);
    }
    
    void nyala(int pil){
        if(kondisi==1){
            System.out.println("Mesin nyala");
        }
        else if(kondisi==0){
            System.out.println("Mesin mati");
        }
        else{
            System.out.println("Mesin rusak");
        }
    }
    void depan(){
        if(kondisi==1){
            x+=x;
        }
        else{
            System.out.println("mesin mati");
        }
    }
    void blkang(){
        if(kondisi==1){
            y-=y;
        }
        else{
            System.out.println("mesin mati");
        }
    }
    void kanan(){
        if(kondisi==1){
            y+=y;
        }
        else{
            System.out.println("mesin mati");
        }
    }
    void kiri(){
        if(kondisi==1){
            y-=y;
        }
        else{
            System.out.println("mesin mati");
        }
    }
}
