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
public class RemoteTv implements Inter {
    int status,
        chanel=10,
        vol=10;
    
    public void hidupmati(){
        if(this.status==mati){
            this.status=hidup;
            System.out.println("TV mati");
        }
        else if(this.status==hidup){
            this.status=mati;
            System.out.println("TV hidup");
        }
        else{
            System.out.println("system salah");
        }
    }
    
    public void tambahC(){
        if(status==hidup){
            if(chanel==maxC){
                System.out.println("Chanel "+this.chanel);
        }
            else{
                chanel++;
                System.out.println("Chanel "+this.chanel);
            }
        }
}
    public void kurangC(){
        if(status==hidup){
            if(chanel==maxC){
                System.out.println("Chanel "+this.chanel);
        }
            else{
                chanel--;
                System.out.println("Chanel "+this.chanel);
            }
        }
    }
    
    public void tambahV(){
      if(status==hidup){
            if(vol==maxV){
                System.out.println("Chanel "+this.chanel);
        }
            else{
                vol++;
                System.out.println("Chanel "+this.chanel);
            }
        }
}
    public void kurangV(){
        if(status==hidup){
            if(vol==maxV){
                System.out.println("Chanel "+this.chanel);
        }
            else{
                vol--;
                System.out.println("Chanel "+this.chanel);
            }
        }
    }
}

 