/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author smv
 */

class Mypoint1{
    private int x;
    private int y;
    public Mypoint1(){
        this.x=0;
        this.y=0;
        }
    public Mypoint1 (int x,int y){
        this.x=x;
        this.y=y;
       }
    public void setxy(int x,int y){
        this.x=x;
        this.y=y;
        }
    public int[] getxy(){
        int[] points={x,y};
        return points;
        }
    public double distance(int x,int y){
        int xdiff=this.x-x;
        int ydiff=this.y-y;
        return Math.sqrt(xdiff*xdiff+ydiff*ydiff);
        }
    public double distance(){
        return Math.sqrt(x*x+y*y);}
}
public class H3 {
    public static void main(String[] args){
        Mypoint1 point1=new Mypoint1();
        Mypoint1 point2=new Mypoint1();
        point1.setxy(1,2);
        int[]points=point1.getxy();
        System.out.print("Point1 coordinates are ");
        System.out.print(points[0]+","+points[1]+"\n");
        System.out.println(point1.distance(5,6));
        System.out.println(point1.distance());
    }
    
}
