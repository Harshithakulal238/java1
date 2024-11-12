
package oopj_1;
class Outer{
        void show(){
            System.out.println("Outer class");
        }
        class Inner{
            void show(){
                System.out.println("Inner class");
            }
    }
}
public class Test4 {
    public static void main(String[] args){
        Outer outer=new Outer();
        outer.show();
        Outer.Inner obj1=outer.new Inner();
        obj1.show();
    
}
}
