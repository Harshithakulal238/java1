/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author smv
 */
class Bank2{
    int getInterestrate(){
        return 0;}
    }
class Canara extends Bank2{
    int getInterestrate(){
        return 5;
    }
}
class SBI extends Bank2{
    int getInterestrate(){
        return 6;
    }
}
class SCDCC extends Bank2{
    int getInterestrate(){
        return 8;
    }
}
public class H6 {
    public static void main(String[] args){
        Canara bank1=new Canara();
        SBI bank2=new SBI();
        SCDCC bank3=new SCDCC();
        System.out.println("Bank1:"  +bank1.getInterestrate() + "%");
        System.out.println("Bank2:"  +bank2.getInterestrate() + "%");
        System.out.println("Bank3:"  +bank3.getInterestrate() + "%");
        
    }
    
}
