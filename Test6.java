/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopj_1;
class Animal{
    String name;
    public Animal(String name){
        this.name=name;
    }
    public void sound(){
        System.out.println(name+" makes a sound");
    }    
}
class Mammal extends Animal{
    public Mammal(String name){
        super(name);
    }
    
}
class Dog extends Mammal{
    public Dog(String name){
        super(name);
}
    public void bark(){
        System.out.println(name+" barks!");
    }
}

public class Test6 {
    public static void main(String[] args){
        Dog dog=new Dog("Tom");
        dog.sound();
        dog.bark();
        
}
    
}
    

