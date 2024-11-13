
package oopj_1;

class Animal_1{
    public void eat(){
        System.out.println("Animal is eating");
    }
}
interface canfly{
    void fly();
}
interface canswim{
    void swim();
}
interface canchirp{
    void swim();
}

class Bird extends Animal_1 implements canfly,canswim{
    public void fly(){
        System.out.println("Bird is flying");
    }
    public void swim(){
        System.out.println("Bird is swimming");
        
    }
    public void chirp(){
        System.out.println("Bird is chirping");
        
    }
    
}
    

public class Test7 {
    public static void main(String[] args){
        Bird bird=new Bird();
        bird.fly();
        bird.swim();
        bird.chirp();
}
}
