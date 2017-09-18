package Inheritance;

public class Main {

	public static void main(String[] args) {
//		Parent a=new Parent();
//		Child b=new Child();
		Parent c=new Child();
		TestInheritance((Child)c);
		System.out.println(c.i);
	}
public static void TestInheritance(Parent a)
{
	//c.ParentMethod();
	a.display();
}

}
