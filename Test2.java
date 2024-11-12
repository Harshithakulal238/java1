
package oopj_1;
public class Test2{ 
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }}
    public static void main(String[] args){
        int num=5;
        int res=factorial(num);
        System.out.println(res);
    
    }}
    

