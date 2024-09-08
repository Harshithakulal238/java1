import java.util.List;
import java.util.ArrayList;
public class J1{
  public static void main(String[] args){
  List <Integer> list1=new ArrayList<>();
  List <Integer> list2=new ArrayList<>();
  List <Character> list3=new ArrayList<>();
  List <Character> list4=new ArrayList<>();
 for(int i=65;i<=90;i++)
{
list1.add(i);
}
System.out.println(list1);
for(int i=97;i<=112;i++)
{
list2.add(i);
}
System.out.println(list2);
for(int i=65;i<=90;i++)
{
list3.add((char)i);
}
System.out.println(list3);
for(int i=97;i<=122;i++)
{
list4.add((char)i);
}
System.out.println(list4);
  
}}