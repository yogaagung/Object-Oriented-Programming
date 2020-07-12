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
interface InterfaceLampu{
	public static final int KeadaanHidup=1;
	public static final int KeadaanMati=0;

	public abstract void hidupkan();
	public abstract void matikan();
}
