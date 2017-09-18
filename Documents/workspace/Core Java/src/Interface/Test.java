package Interface;


	public class Test
	{
		 private Test()
		{
			
		}
		public static void main(String args[])
		{
			Landline ll=new SmartPhone();// ll is assigned with smartphone values
			Mobile ml=(Mobile)ll;	// mobile obj is assigned with ll values, but ll is parent of mobile therefore it is typecasted
			ml.call();
			Mobile obj=new Mobile();
			//System.out.println(ml.number);   // here mobile no. is printed instead of smartphone 
			test(ll);
		}
		
		public static void test(Landline m)
		{
			m.call();
		}
	}
	interface ICommunication
	{
		long number=111;
		public void call();
	}
	class Landline implements ICommunication
	{
		 long number=11111;
		public void call()
		{
			System.out.println("Landline calls");
		}
	}
	class Mobile extends Landline
	{
		private long number=1111111111;
		public void call()
		{
			System.out.println("Mobile calls");
		}
		public void text()
		{
			System.out.println("Mobile Text");
		}
	}
	class SmartPhone extends Mobile
	{
		long number=2142222222;
		public void call()
		{
			System.out.println("SmartPhone calls");
		}
		public void text()
		{
			System.out.println("SmartPhone Text");
		}
		public void data()
		{
			System.out.println("Smartphone data browse");
		}
	}


