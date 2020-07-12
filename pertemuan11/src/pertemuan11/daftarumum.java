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
class daftarumum {
    int tiket;
    public daftarumum(int tiket){
        this.tiket=tiket;
        if(tiket==25000){
            System.out.println("Tanpa Bag");
        }
        else{
            System.out.println("Kurang");
        }
    }
    public daftarumum(){
    }
    void info(){
        System.out.println(+tiket);
    }
}
