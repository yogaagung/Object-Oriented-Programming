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
public class mahasiswa extends manusia{
    String NIM,nama,fak,jurusan;
    private double nilaiakhir;
    
    
    
   public void nilaimahasiswa(double a,double b,double c,double d,double e){
       /// double tugas=a+b+c;
        nilaiakhir=(((a+b+c)/3)*0.4)+(d*0.3)+(e*0.3);
    }
    double balik(){
        return nilaiakhir;
    }
}
