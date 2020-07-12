/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface2;

/**
 *
 * @author D2J
 */
interface Inter {
    public static final int hidup=1;
    public static final int mati=0;
    public static final int minC=1;
    public static final int maxC=20;
    public static final int minV=0;
    public static final int maxV=50;
    
    public abstract void hidupmati();
    public abstract void tambahC();
    public abstract void kurangC();
    public abstract void tambahV();
    public abstract void kurangV();
    
}
