/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AC;

/**
 *
 * @author E
 */
public class acm implements Interfaceac{
    int status,x;
    
    public void hidup(){
	if (this.status == Keadaanmati){
            this.status = Keadaanhidup;
            System.out.println("Hidupkan AC ! --> AC Hidup");
	}else{
            System.out.println("Hidupkan AC! --> AC Sudah Hidup ");}
	}

  public void mati(){
	if (this.status == Keadaanhidup){
            this.status = Keadaanmati;
            System.out.println("Matikan AC! --> AC Mati");
	}else{
            System.out.println("Matikan AC! --> AC Sudah Mati ");
	}
	}
  public void tambah(){
      if(this.status==Keadaanmati){
          this.status=Keadaanhidup;
          if(Suhu>=32){
              System.out.println("Sangat Panas");
          }
          System.out.println("Suhu Bertambah");
      }
      else{
          System.out.println("Suhu Tetap");
      }
  }
  public void kurang(){
      if(this.status==Keadaanhidup){
          this.status=Keadaanmati;
                  if(Suhu>=16){
                      System.out.println("Sangat Dingin");
                  }
      }
      System.out.println("Dingin Sekali");
  }
}
