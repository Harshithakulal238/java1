/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author smv
 */

class Shape{
    public void draw(){
        System.out.println("Drawing a shape");
    }
    public void erase(){
        System.out.println("Erasing a shape");
    }
}
class Circle extends Shape{
    @Override
    public void draw(){
        System.out.println("Drawing a circle");
    }
    public void erase(){
        System.out.println("Erasing a circle");
    }}

class Triangle extends Shape{
    @Override
    public void draw(){
        System.out.println("Drawing a Triangle");
    }
    public void erase(){
        System.out.println("Erasing a Triangle");
    }
}
class Square extends Shape{
    @Override
    public void draw(){
        System.out.println("Drawing a Square");
    }
    public void erase(){
        System.out.println("Erasing a Square");
    }
}
    
    

public class H4 {
    public static void main(String[] args){
        Shape[] shapes=new Shape[3];
        shapes[0]=new Circle();
        shapes[1]=new Triangle();
        shapes[2]=new Square();
        for(int i=0;i<shapes.length;i++){
          shapes[i].draw();
          shapes[i].erase();
          System.out.println("----------");
        }
        
        
    }
    
}
