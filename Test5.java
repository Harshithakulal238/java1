
package oopj_1;
class Animal_2{
    public void sound(){
        System.out.println("Animals make sound");
        
    }
}
class Dog_1 extends Animal_2{
    public void sound(){
        System.out.println("Barks");
    }
    
}
public class Test5 {
    public static void main(String[] args){
        Animal_2 obj1=new Animal_2();
        Animal_2 obj2=new Dog_1();
        obj1.sound();
        obj2.sound();
        
    
}
}
