/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kapal;

/**
 *
 * @author asus
 */
public class kapalaksi {
    String nama;
    int peluru,maks;
    
void tembak(){
    peluru=peluru-1;
}
void tembakbnyk(int a){
    peluru-=a;
}
void reload(){
    peluru=maks;
}
}

