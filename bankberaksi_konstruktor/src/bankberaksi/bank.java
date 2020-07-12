/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankberaksi;

/**
 *
 * @author asus
 */
public class bank {
    int saldo;
public bank(int saldo){
    this.saldo=saldo;
}
public void simpanUang(int a){
    saldo+=a;
}
public void ambilUang(int a){
    saldo-=a;
}
public int getSaldo(){
    return saldo;
}
public void info(){
    System.out.println("saldo = "+saldo);
}
}
