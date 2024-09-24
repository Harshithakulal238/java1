/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author smv
 */
class Car{
    private String make;
    private String model;
    private int year;
    private String color;
    Car(String mk,String md,int yr,String clr){
        this.make=mk;
        this.model=md;
        this.year=yr;
        this.color=clr;
    }
    public void getcardetails(){
        System.out.println(color+" "+make+"-"+model+" "+year);
    }
}
public class H8 {
    public static void main(String[] args){
        Car principalcar=new Car("Hyundai","i20",2022,"White");
        Car vprincipalcar=new Car("Maruthi","Swift",2020,"Grey");
        System.out.println("The two cars parked in front of SMVITM are:");
        principalcar.getcardetails();
        vprincipalcar.getcardetails();
    }
    
}
