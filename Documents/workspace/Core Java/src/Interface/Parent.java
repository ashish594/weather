package Interface;


public class Parent
{
 public void method1()
 {
  System.out.println("parent");
 }
 public void method1(String s,String s1)
 {
  System.out.println("other parent");
 }
}
 class Child extends Parent
{
 public void method1()
 {
  System.out.println("child");
 }
 
 public void method1(String s)
 {
  System.out.println("other");
 }


public static void main(String args[])
{
	Parent p= new Child();
	p.method1("","");
}
}
