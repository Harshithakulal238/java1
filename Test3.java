class Test{
    static int counter=0;
    public static void increment(){
        counter++;
    }
    public static void display(){
        System.out.println("Counter:"+counter);
    }
}
public class Test3 {
    public static void main(String[] args){
        Test.increment();
        Test.display();
        Test obj1=new Test();
        obj1.increment();
        obj1.display();
        Test obj2=new Test();
        obj2.increment();
        obj2.display();
    }
    
}
  