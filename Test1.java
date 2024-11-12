package oopj_1;

class Addition{
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public String add(String a, String b){
        return a+b;
    }
}
public class Test1 {
    public static void main(String[] args){
        Addition calc=new Addition();
        System.out.println(calc.add(10,20));
        System.out.println(calc.add(10,20,30));
        System.out.println(calc.add("Hello","World"));   
}
}
