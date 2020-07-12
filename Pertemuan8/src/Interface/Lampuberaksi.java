/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author E
 */
public class Lampuberaksi {
    public static void main(String[] args) {
        Lampu lm = new Lampu();
        System.out.println("Status Lampu Saat Ini: Mati");
        
        lm.hidupkan(); //lampu hidup
        lm.matikan(); // lampu mati
        lm.matikan(); // lampu mati
        lm.hidupkan(); // lampu hidup
        lm.hidupkan(); // lampu hidup
	}
    }
