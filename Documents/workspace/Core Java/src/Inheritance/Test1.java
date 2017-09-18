package Inheritance;

public class Test1 {
		public static void main(String args[])
	
		{
			AbsConcrete b=new AbsConcreteExt();
			call((AbsConcreteExt)b);
		}
		public static void call(AbsConcreteExt ace)
		{
			ace.method1();
		}
	}

	abstract class Abs
	{
		public void method1(){
			System.out.println("Abs 1");
		}
	}
	class AbsConcrete extends Abs
	{
		public void method1(){
			System.out.println("AbsConcrete 1");
		}
	}
	class AbsConcreteExt extends AbsConcrete
	{
		public void method1(){
			System.out.println("AbsConcreteExt 1");
		}
	}

